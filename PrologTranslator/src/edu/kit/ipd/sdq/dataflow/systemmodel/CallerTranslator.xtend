package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.HashSet

class CallerTranslator {
	
	val AssignmentsTranslator assignmentTrans;
	val Configuration config;
	
	new(Blackboard bb, Configuration config) {
		assignmentTrans  = new AssignmentsTranslator(bb, config);
		this.config = config;
	}
	
	def dispatch translate(Operation op, PrologProgram result) {
		result.addMajorHeading('''Operation «op.name»''')
		result.addFact('''isOperation('«op.name»')''')
		
		//property definitions
		for(PropertyDefinition propDef : op.propertyDefinitions) {
			result.addFact('''hasProperty('«op.name»','«propDef.property.name»')''');
			for(Value value : propDef.presentValues) {
				result.addFact('''operationProperty('«op.name»','«propDef.property.name»', '«value.name»')''');
			}		
			if(config.optimizedNegations) {
				val presentValues = new HashSet<Value>(propDef.presentValues);
				for(Value value : propDef.property.type.values) {
					if(!presentValues.contains(value)) {
						result.addFact('''not_operationProperty('«op.name»','«propDef.property.name»', '«value.name»')''');						
					}
				}
			}
		}
		
		//Call Signature
		for(Variable param : op.parameters) {
			result.addFact('''operationParameterType('«op.name»','«param.name»','«param.datatype.name»')''')			
		}
		//Return Signature
		for(Variable rval : op.returnValues) {
			result.addFact('''operationReturnValueType('«op.name»','«rval.name»','«rval.datatype.name»')''')			
		}
		
		translateCalls(result, op);
		
		result.addMinorHeading('''Return Values of «op.name»''')
		assignmentTrans.buildAssignments(op.returnValueAssignments ,op,
			[stack,vari,attrib,value | '''returnValueImpl(«stack», '«vari»', '«attrib»', '«value»')''']
			,result
		);
	}
	
	def dispatch translate(SystemUsage op, PrologProgram result) {
		result.addMajorHeading('''System Usage «op.name»''')
		result.addFact('''isSystemUsage('«op.name»')''')
	
		translateCalls(result, op);
		
	}
	
	private def translateCalls(PrologProgram result, Caller caller) {
		for(OperationCall call : caller.calls) {
			result.addMinorHeading('''Call to «call.callee.name» («call.name»)''');
			result.addFact('''operationCall('«call.caller.name»','«call.callee.name»','«call.name»')''');
			
			assignmentTrans.buildAssignments(call.parameterAssignments, caller,
				[stack,vari,attrib,value | '''callArgumentImpl(['«call.callee.name»','«call.name»'|«stack»], '«vari»', '«attrib»', '«value»')''']
				,result
			);
		}
	}
}