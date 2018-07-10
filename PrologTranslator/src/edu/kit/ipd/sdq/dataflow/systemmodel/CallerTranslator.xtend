package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.HashSet
import edu.kit.ipd.sdq.dataflow.systemmodel.AssignmentsTranslator.PredicateProvider

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
		translateReturnValues(result,op);
		
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
			
			var PredicateProvider argPred;
			if(config.argumentAndReturnValueIndexing) {
				argPred = [stack,vari,attrib,value | '''callArgumentIndexed('«call.callee.name»',['«call.callee.name»','«call.name»'|«stack»], «vari», «attrib», «value»)'''];	
			} else {
				argPred = [stack,vari,attrib,value | '''callArgumentImpl(['«call.callee.name»','«call.name»'|«stack»], «vari», «attrib», «value»)'''];	
			}
			assignmentTrans.buildAssignments(call.parameterAssignments, caller, argPred, result);
		}
	}
	
	private def translateReturnValues(PrologProgram result, Operation op) {
		result.addMinorHeading('''Return Values of «op.name»''')
		var PredicateProvider rvPred;
		if(config.argumentAndReturnValueIndexing) {
			rvPred = [stack,vari,attrib,value | '''returnValueIndexed('«op.name»',«stack», «vari», «attrib», «value»)'''];
		} else {
			rvPred = [stack,vari,attrib,value | '''returnValueImpl(«stack», «vari», «attrib», «value»)'''];			
		}
		assignmentTrans.buildAssignments(op.returnValueAssignments ,op,rvPred,result);
	}
}