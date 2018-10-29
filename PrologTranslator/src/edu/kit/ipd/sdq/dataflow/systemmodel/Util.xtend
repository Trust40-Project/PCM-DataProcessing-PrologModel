package edu.kit.ipd.sdq.dataflow.systemmodel

class Util {
	def public static String asAtom(String identifier) {
		if(!identifier.startsWith("'")) {
			return "'" + identifier + "'";
		} else {
			return identifier;
		}
	}
}