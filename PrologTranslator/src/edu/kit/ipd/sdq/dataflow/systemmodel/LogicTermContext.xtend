package edu.kit.ipd.sdq.dataflow.systemmodel

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class LogicTermContext {
	
	/**
	 * Defines with what attribute wildcard within logic terms will be replaced.
	 */
	var String attributeWildCardInstatiation;
	/**
	 * Defines with what attribute wildcard within logic terms will be replaced.
	 */
	var String valueWildCardInstatiation;
	
	/**
	 * Defines a list which repesents the current call stack for referencing call arguments
	 */
	var String currentStack;
	
	/**
	 * Defines a list which repesents the previous call stack for referencing state variables
	 */
	var String stateAccessStack;
	
	/**
	 * Defines a list which repesents the previous call stack for referencing state variables.
	 * Note that this stack must not depend on any variables which are not also sued in stateAccessStack.
	 */
	var StateAccessMode stateAccessPredicate;
}