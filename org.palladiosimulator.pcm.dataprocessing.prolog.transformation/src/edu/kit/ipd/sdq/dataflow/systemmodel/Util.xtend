package edu.kit.ipd.sdq.dataflow.systemmodel

/**
 * Bundles common Utility functions and conventions.
 */
class Util {
	def static String asAtom(String identifier) {
		if(!identifier.startsWith("'")) {
			return "'" + identifier + "'";
		} else {
			return identifier;
		}
	}
	
	def static String negatedPredicate(String predicateName) {
		if(predicateName.startsWith("not_")) {
			return predicateName.substring("not_".length);
		} else {
			return "not_" + predicateName;
		}
	}
}