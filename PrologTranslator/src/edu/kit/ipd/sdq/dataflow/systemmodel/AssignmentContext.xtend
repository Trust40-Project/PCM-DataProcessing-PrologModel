package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.Optional
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import org.apache.commons.beanutils.BeanUtils;

/**
 * Container for properties that influence the generation of an individual VariableAssignment.
 * This properties are used to resolve references made in the contained LogicTerm.
 */
@Accessors
class AssignmentContext {
	
	/**
	 * Functional interface used to define the left side of generated rules.
	 * Examples for such Predicates are callArgument(...) or retrunValue(...).
	 */
	interface PredicateArgumentsProvider {
		/**
		 * @param stackContextList the list representing the current stack, for example ['myOperation'|S]
		 * @param variable the variable being assigned
		 * @param attribute the attribute (or a placeholder) which is assigned
		 * @param value the value (or a placeholder) which is assigned
		 */
		def List<String> getPredicateArguments(String stackContextList, Variable variable, String attribute, String value);
	}
	
	/**
	 * Defines the name of the predicate on the left-hand side of the assignment.
	 */
	String predicateName;
	
	/**
	 * Defines the arguments of the predicate on the left-hand side of the assignment.
	 */
	PredicateArgumentsProvider predicateArguments;
	
	/**
	 * Defines the operation which owns the Assignment.
	 */
	Caller currentOperation;
	
	/**
	 * Defines the last, already executed call, starting at currenOperation.
	 * If this is present, the state defined by this call will be used when referring to state variables.
	 * Otherwise, the state passed to the current operation will be used.
	 */
	Optional<OperationCall> previousCall;
	
	def AssignmentContext copy() {
		return BeanUtils.cloneBean(this) as AssignmentContext;
	}
	
}