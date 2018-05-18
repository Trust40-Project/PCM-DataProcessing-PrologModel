package edu.kit.ipd.sdq.dataflow.systemmodel

import java.beans.PropertyDescriptor

class CallerTranslator {
	
	val typeChecker = new LogicTermTypeChecker;
	val termTranslator = new LogicTermTranslator;
	
	def translateOperation(PrologProgram result, Operation op) {
		result.addMajorHeading('''Operation «op.name»''')
		result.addFact('''isOperation('«op.name»')''')
		
		//property definitions
		for(PropertyDefinition propDef : op.propertyDefinitions) {
			result.addFact('''hasProperty('«op.name»','«propDef.property.name»')''');
			for(Value value : propDef.presentValues) {
				result.addFact('''operationProperty('«op.name»','«propDef.property.name»', '«value.name»')''');
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
		for(Variable rv : op.returnValues) {
			//for each attribute and value find a matching assignment
			for(Attribute attrib : rv.datatype.attributes) {
				for(Value value : attrib.type.values) {
					var VariableAssignment matchingAssignment = null;
					for(VariableAssignment a : op.returnValueAssignments) {
						if(a.variable === rv && (a.attribute === null || a.attribute === attrib)
							&& (a.value === null || a.value === value)) {
							//check if the types used in the assignment are compatible
							if(typeChecker.isAttributeValueComboValid(a.term,attrib,value)) {
								matchingAssignment = a;
							}
						}
					}
					if(matchingAssignment === null) {
						throw new IllegalArgumentException(
						'''No Return Value Assignment in operation «op.name» for «rv.name».«attrib.name».«value.name»!''')
					} else {
						val stack = '''['«op.name»' | S]''';
						result.addRule(
							'''returnValue(«stack», '«rv.name»', '«attrib.name»', '«value.name»')''',
							termTranslator.translate(matchingAssignment.term,stack,attrib,value)
						);
					}
				}
			}
		}
	}
	
	def translateSystemUsage(PrologProgram result, SystemUsage op) {
		result.addMajorHeading('''System Usage «op.name»''')
		result.addFact('''isSystemUsage('«op.name»')''')
	
		
		translateCalls(result, op);
		
	}
	
	private def translateCalls(PrologProgram result, Caller caller) {
		for(OperationCall call : caller.calls) {
			result.addMinorHeading('''Call to «call.callee.name» («call.name»)''');
			result.addFact('''operationCall('«call.caller.name»','«call.callee.name»','«call.name»')''');
			
			for(Variable param : call.callee.parameters) {
				//for each attribute and value find a matching assignment
				for(Attribute attrib : param.datatype.attributes) {
					for(Value value : attrib.type.values) {
						var VariableAssignment matchingAssignment = null;
						for(VariableAssignment a : call.parameterAssignments) {
							if(a.variable === param && (a.attribute === null || a.attribute === attrib)
								&& (a.value === null || a.value === value)) {
								//check if the types used in the assignment are compatible
								if(typeChecker.isAttributeValueComboValid(a.term,attrib,value)) {
									matchingAssignment = a;
								}
							}
						}
						if(matchingAssignment === null) {
							throw new IllegalArgumentException(
							'''No Variable Assignment in call «call.name» from «call.caller.name» to «call.callee.name» for «param.name».«attrib.name».«value.name»!''')
						} else {
							val stack = '''['«call.caller.name»' | S]''';
							val resultStack = '''['«call.callee.name»','«call.name»','«call.caller.name»' | S]''';
							result.addRule(
								'''callArgument(«resultStack», '«param.name»', '«attrib.name»', '«value.name»')''',
								termTranslator.translate(matchingAssignment.term,stack,attrib,value)
							);
						}
					}
				}
			}
		}
	}
}