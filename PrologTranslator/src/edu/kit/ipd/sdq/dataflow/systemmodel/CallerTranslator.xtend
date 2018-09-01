package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.AssignmentContext.PredicateProvider
import java.util.ArrayList
import java.util.HashSet
import java.util.Optional

class CallerTranslator {
	
	val AssignmentsTranslator assignmentTrans;
	val Configuration config;
	
	new(TranslationCache bb, Configuration config) {
		assignmentTrans  = new AssignmentsTranslator(bb, config);
		this.config = config;
	}
	
	def dispatch translate(Operation op, System containingSystem, PrologProgram result) {
		result.addMajorHeading('''Operation «op.name»''')
		result.addFact('''isOperation('«op.name»')''')
		
		translatePropertyDefinitions(op, result)
		translateOperationSignature(op, result)
		translateDefaultStateAssignments(op, result);
		translateCalls(result,containingSystem, op);
		translateReturnValueAssignments(result,op);
		translatePostExecutionStateChanges(result,op,containingSystem);
		
	}
	
	
	def dispatch translate(SystemUsage op, System contianingSystem, PrologProgram result) {
		result.addMajorHeading('''System Usage «op.name»''')
		result.addFact('''isSystemUsage('«op.name»')''')
	
		translateCalls(result,contianingSystem, op);
		
	}
	
	protected def void translatePropertyDefinitions(Operation op, PrologProgram result) {
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
	}
	
	protected def void translateOperationSignature(Operation op, PrologProgram result) {
		for(Variable param : op.parameters) {
			result.addFact('''operationParameterType('«op.name»','«param.name»','«param.datatype.name»')''')			
		}
		for(Variable rval : op.returnValues) {
			result.addFact('''operationReturnValueType('«op.name»','«rval.name»','«rval.datatype.name»')''')			
		}
		for(Variable state : op.stateVariables) {
			result.addFact('''operationStateType('«op.name»','«state.name»','«state.datatype.name»')''')			
		}
	}
	
	def translatePostExecutionStateChanges(PrologProgram result, Operation op, System sys) {
		var assignments = generateStateCopyAssignments(sys, false);
		assignments.addAll(op.postExecutionStateDefinitions);
		
		result.addMinorHeading('''State Definitions of «op.name»''')
		
		val context = new AssignmentContext;
		if(config.argumentAndReturnValueIndexing) {
			context.predicate = [stack,vari,attrib,value | 
			'''postCallStateIndexed('«op.name»',«stack»,'«(vari.eContainer as Operation).name»','«vari.name»', «attrib», «value»)'''];
		} else {
			context.predicate = [stack,vari,attrib,value | 
			'''postCallStateImpl(«stack»,'«(vari.eContainer as Operation).name»','«vari.name»', «attrib», «value»)'''];
		}
		context.currentOperation = op;
		context.previousCall = Optional.ofNullable(op.calls.last);
		assignmentTrans.buildAssignments(assignments, context ,result);
	}
	
	private def translateDefaultStateAssignments(Operation op, PrologProgram result) {
		result.addMinorHeading('''Default State Values of «op.name»''')		
		val context = new AssignmentContext;
		context.currentOperation = op;
		context.previousCall = Optional.empty();
		context.predicate = [stack,vari,attrib,value | '''defaultStateImpl('«op.name»', '«vari.name»', «attrib», «value»)'''];
		assignmentTrans.buildAssignments(op.defaultStateDefinitions, context, result);
	}
	
	private def translateCalls(PrologProgram result,System system, Caller caller) {
		
		var Optional<OperationCall> previousCall = Optional.empty();
		
		for(OperationCall call : caller.calls) {
			result.addMinorHeading('''Call to «call.callee.name» («call.name»)''');
			result.addFact('''operationCall('«call.caller.name»','«call.callee.name»','«call.name»')''');
			
			buildCallArgumentAssignments(result,call,previousCall);
			
			buildCallStateAssignments(result,system, call, previousCall);
			
			previousCall = Optional.of(call);
		}
	}
	
	def private buildCallArgumentAssignments(PrologProgram result, OperationCall call, Optional<OperationCall> previousCall) {
		var PredicateProvider argPred;
		if(config.argumentAndReturnValueIndexing) {
			argPred = [stack,vari,attrib,value | '''callArgumentIndexed('«call.callee.name»',['«call.callee.name»','«call.name»'|«stack»], '«vari.name»', «attrib», «value»)'''];	
		} else {
			argPred = [stack,vari,attrib,value | '''callArgumentImpl(['«call.callee.name»','«call.name»'|«stack»], '«vari.name»', «attrib», «value»)'''];	
		}
		
		val context = new AssignmentContext;
		context.predicate = argPred;
		context.currentOperation = call.caller;
		context.previousCall = previousCall;
		
		assignmentTrans.buildAssignments(call.parameterAssignments, context, result);
	}
	
	def buildCallStateAssignments(PrologProgram result,System sys, OperationCall call, Optional<OperationCall> previousCall) {
		val useDefaultState = !previousCall.isPresent() && (call.caller instanceof SystemUsage);
		var assignments = generateStateCopyAssignments(sys, useDefaultState);
		assignments.addAll(call.preCallStateDefinitions);
		
		val context = new AssignmentContext;
		if(config.argumentAndReturnValueIndexing) {
			context.predicate = [stack,vari,attrib,value | 
			'''preCallStateIndexed('«call.callee.name»', ['«call.callee.name»','«call.name»'|«stack»],'«(vari.eContainer as Operation).name»','«vari.name»', «attrib», «value»)'''];
		} else {
			context.predicate = [stack,vari,attrib,value | 
			'''preCallStateImpl(['«call.callee.name»','«call.name»'|«stack»],'«(vari.eContainer as Operation).name»','«vari.name»', «attrib», «value»)'''];
		}
		context.currentOperation = call.caller;
		context.previousCall =previousCall;
		
		assignmentTrans.buildAssignments(assignments, context ,result);
	}
	
	private def translateReturnValueAssignments(PrologProgram result, Operation op) {
		result.addMinorHeading('''Return Values of «op.name»''')
		var PredicateProvider rvPred;
		if(config.argumentAndReturnValueIndexing) {
			rvPred = [stack,vari,attrib,value | '''returnValueIndexed('«op.name»',«stack», '«vari.name»', «attrib», «value»)'''];
		} else {
			rvPred = [stack,vari,attrib,value | '''returnValueImpl(«stack», '«vari.name»', «attrib», «value»)'''];			
		}
		
		val context = new AssignmentContext;
		context.predicate = rvPred;
		context.currentOperation = op;
		context.previousCall = Optional.ofNullable(op.calls.last);		
		assignmentTrans.buildAssignments(op.returnValueAssignments , context ,result);
	}
	/**
	 * Generates the assignments for the default behaviour of how state variables are defined:
	 * Their value is simply copied from the previous value or the default value ,depending on the context.
	 */
	private def generateStateCopyAssignments(System sys, boolean useDefaultState) {
		val fac = SystemModelFactory.eINSTANCE;		
		val assignments = new ArrayList<VariableAssignment>;
		for(op : sys.operations) {
			for(state : op.stateVariables) {
				var assi = fac.createVariableAssignment();
				assi.variable = state;
				if(useDefaultState) {
					var term = fac.createDefaultStateRef();
					term.stateVariable = state;
					assi.term = term;					
				} else {
					var term = fac.createStateRef();
					term.stateVariable = state;
					assi.term = term;					
				}
				assignments.add(assi);				
			}
		}
		return assignments;
	}
}