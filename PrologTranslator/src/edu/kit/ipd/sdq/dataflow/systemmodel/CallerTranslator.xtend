package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration
import java.util.ArrayList
import java.util.HashSet
import java.util.Optional
import org.slf4j.LoggerFactory

import static java.util.Arrays.asList

import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.asAtom
import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.negatedPredicate

/**
 * Translates Callers, namely SystemUsages and Operations.
 */
class CallerTranslator {
	
	static val LOG = LoggerFactory.getLogger(typeof(CallerTranslator));
	
	val AssignmentsTranslator assignmentTrans;
	val Configuration config;
	
	new(TranslationCache bb, Configuration config) {
		assignmentTrans  = new AssignmentsTranslator(bb, config);
		this.config = config;
	}
	
	def dispatch translate(Operation op, System containingSystem, PrologProgram result) {
		LOG.info('''Translating Operation «op.name»''')
		result.addMajorHeading('''Operation «op.name»''')
		result.addFact("isOperation",asList(op.name.asAtom))
		
		translatePropertyDefinitions(op, result)
		translateOperationSignature(op, result)
		translateDefaultStateAssignments(op, result);
		translateCalls(result,containingSystem, op);
		translateReturnValueAssignments(result,op);
		translatePostExecutionStateChanges(result,op,containingSystem);
		
	}
	
	
	def dispatch translate(SystemUsage op, System containingSystem, PrologProgram result) {
		LOG.info('''Translating SystemUsage «op.name»''')
		result.addMajorHeading('''System Usage «op.name»''')
		result.addFact("isSystemUsage",asList(op.name.asAtom))
	
		translateCalls(result,containingSystem, op);
		
	}
	
	protected def void translatePropertyDefinitions(Operation op, PrologProgram result) {
		for(PropertyDefinition propDef : op.propertyDefinitions) {
			result.addFact("hasProperty",asList(op.name.asAtom,propDef.property.name.asAtom));
			for(Value value : propDef.presentValues) {
				result.addFact("operationProperty",asList(op.name.asAtom,propDef.property.name.asAtom, value.name.asAtom));
			}		
			if(config.optimizedNegations) {
				val presentValues = new HashSet<Value>(propDef.presentValues);
				for(Value value : propDef.property.type.values) {
					if(!presentValues.contains(value)) {
						result.addFact("operationProperty".negatedPredicate,asList(op.name.asAtom,propDef.property.name.asAtom,value.name.asAtom));						
					}
				}
			}
		}
	}
	
	protected def void translateOperationSignature(Operation op, PrologProgram result) {
		for(Variable param : op.parameters) {
			result.addFact("operationParameterType",asList(op.name.asAtom,param.name.asAtom,param.datatype.name.asAtom))			
		}
		for(Variable rval : op.returnValues) {
			result.addFact("operationReturnValueType",asList(op.name.asAtom,rval.name.asAtom,rval.datatype.name.asAtom))			
		}
		for(Variable state : op.stateVariables) {
			result.addFact("operationStateType",asList(op.name.asAtom,state.name.asAtom,state.datatype.name.asAtom))			
		}
	}
	
	private def translatePostExecutionStateChanges(PrologProgram result, Operation op, System sys) {
		var assignments = generateStateCopyAssignments(sys, false);
		assignments.addAll(op.postExecutionStateDefinitions);
		
		result.addMinorHeading('''State Definitions of «op.name»''')
		
		val context = new AssignmentContext;
		if(config.argumentAndReturnValueIndexing) {
			context.predicateName = "postCallStateIndexed";
			context.predicateArguments = [stack,vari,attrib,value | 
			asList(op.name.asAtom,stack,(vari.eContainer as Operation).name.asAtom,vari.name.asAtom,attrib,value)];
		} else {
			context.predicateName = "postCallStateImpl";
			context.predicateArguments = [stack,vari,attrib,value | 
			asList(stack,(vari.eContainer as Operation).name.asAtom,vari.name.asAtom,attrib,value)];
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
		context.predicateName = "defaultStateImpl";
		context.predicateArguments = [stack,vari,attrib,value | asList(op.name.asAtom,vari.name.asAtom,attrib,value)];
		assignmentTrans.buildAssignments(op.defaultStateDefinitions, context, result);
	}
	
	private def translateCalls(PrologProgram result,System system, Caller caller) {
		
		var Optional<OperationCall> previousCall = Optional.empty();
		
		for(OperationCall call : caller.calls) {
			result.addMinorHeading('''Call to «call.callee.name» («call.name»)''');
			result.addFact("operationCall",asList(call.caller.name.asAtom,call.callee.name.asAtom,call.name.asAtom));
			
			buildCallArgumentAssignments(result,call,previousCall);
			
			buildCallStateAssignments(result,system, call, previousCall);
			
			previousCall = Optional.of(call);
		}
	}
	
	private def buildCallArgumentAssignments(PrologProgram result, OperationCall call, Optional<OperationCall> previousCall) {
		val context = new AssignmentContext;
		
		if(config.argumentAndReturnValueIndexing) {
			context.predicateName = "callArgumentIndexed";
			context.predicateArguments = [stack,vari,attrib,value | asList(call.callee.name.asAtom,'''[«call.callee.name.asAtom»,«call.name.asAtom»|«stack»]''',vari.name.asAtom,attrib,value)];	
		} else {
			context.predicateName = "callArgumentImpl";
			context.predicateArguments = [stack,vari,attrib,value | asList('''[«call.callee.name.asAtom»,«call.name.asAtom»|«stack»]''',vari.name.asAtom,attrib,value)];		
		}
		
		context.currentOperation = call.caller;
		context.previousCall = previousCall;
		
		assignmentTrans.buildAssignments(call.parameterAssignments, context, result);
	}
	
	private def buildCallStateAssignments(PrologProgram result,System sys, OperationCall call, Optional<OperationCall> previousCall) {
		val useDefaultState = !previousCall.isPresent() && (call.caller instanceof SystemUsage);
		var assignments = generateStateCopyAssignments(sys, useDefaultState);
		assignments.addAll(call.preCallStateDefinitions);
		
		val context = new AssignmentContext;
		if(config.argumentAndReturnValueIndexing) {
			context.predicateName = "preCallStateIndexed";
			context.predicateArguments = [stack,vari,attrib,value | 
			asList(call.callee.name.asAtom, '''[«call.callee.name.asAtom»,«call.name.asAtom»|«stack»]''',(vari.eContainer as Operation).name.asAtom,vari.name.asAtom,attrib,value)];
		} else {
			context.predicateName = "preCallStateImpl";
			context.predicateArguments = [stack,vari,attrib,value | 
			asList('''[«call.callee.name.asAtom»,«call.name.asAtom»|«stack»]''',(vari.eContainer as Operation).name.asAtom,vari.name.asAtom,attrib,value)];
		}
		context.currentOperation = call.caller;
		context.previousCall =previousCall;
		
		assignmentTrans.buildAssignments(assignments, context ,result);
	}
	
	private def translateReturnValueAssignments(PrologProgram result, Operation op) {
		result.addMinorHeading('''Return Values of «op.name»''')
		val context = new AssignmentContext;
		
		if(config.argumentAndReturnValueIndexing) {
			context.predicateName = "returnValueIndexed";
			context.predicateArguments = [stack,vari,attrib,value | asList(op.name.asAtom,stack,vari.name.asAtom,attrib,value)];
		} else {
			context.predicateName = "returnValueImpl";
			context.predicateArguments = [stack,vari,attrib,value | asList(stack,vari.name.asAtom,attrib,value)];	
		}
		
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
				var assign = fac.createVariableAssignment();
				assign.variable = state;
				assign.term = buildStateReference(useDefaultState, state);	
				assignments.add(assign);				
			}
		}
		return assignments;
	}
	
	private def buildStateReference(boolean useDefaultState, Variable state) {
		val fac = SystemModelFactory.eINSTANCE;		
		if(useDefaultState) {
			var term = fac.createDefaultStateRef();
			term.stateVariable = state;
			return term;					
		} else {
			var term = fac.createStateRef();
			term.stateVariable = state;
			return term;		
		}
	}
}