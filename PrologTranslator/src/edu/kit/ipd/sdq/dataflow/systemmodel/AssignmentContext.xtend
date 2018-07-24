package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.Optional
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class AssignmentContext {
	
	
	static interface PredicateProvider {
		def String getPredicate(String stackContextList, Variable variable, String attribute, String value);
	}
	
	/**
	 * Defines the predicate on the left-hand side of the assignment.
	 */
	PredicateProvider predicate;
	
	Caller currentCaller;
	
	/**
	 * Defines the last, already executed call, starting at currenOperation.
	 * If this is present, the state defined by this call will be used when referring to state variables.
	 * Otherwise, the state passed to the current operation will be used.
	 */
	Optional<OperationCall> previousCall;
	
}