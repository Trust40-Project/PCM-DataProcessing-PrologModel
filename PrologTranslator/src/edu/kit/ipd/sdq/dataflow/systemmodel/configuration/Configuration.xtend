package edu.kit.ipd.sdq.dataflow.systemmodel.configuration

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

/**
 * Configures the performance optimizations for the translator.
 */
@ToString
class Configuration {
	
	/**
	 * If true, the lnot predicate can be used for negations.
	 * This increases the program size but can dramatically reduce the analysis time.
	 */
	@Accessors
	boolean optimizedNegations = true;
	
	/**
	 * If true, the cut based assignments are generated reducing the result program size.
	 */
	@Accessors
	boolean shorterAssignments = true;
	
	/**
	 * If true, predicates are generated to allow first argument indexing to be effective.
	 */
	@Accessors
	boolean argumentAndReturnValueIndexing = true;
}
