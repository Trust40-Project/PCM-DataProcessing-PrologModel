package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.HashSet
import java.util.List

/**
 * Class for the easier generation of textual Prolog Programs.
 * This class also tracks discontigous predicates and adds the corresponding statements.
 */
class PrologProgram {
	
	val resultCode = new StringBuilder;
	
	static val SEPARATOR_LINE = "----------------------------------------------------------------------------";
	
	val usedPredicates = new HashSet<String>();
	val discontigousPredicates = new HashSet<String>();
	var lastPredicate = null;
	
	def getCode() {
		return generateDiscontigousStatements() + resultCode.toString()
	}
	
	
	def void addRule(String predicate, List<String> arguments, String value) {
		checkForDiscontiguity(predicate, arguments.length);
		resultCode.append('\n').append(predicate).append('(');
		var isFirst = true;
		for(arg : arguments) {
			if(!isFirst) {
				resultCode.append(',');
			} else {
				isFirst = false;
			}
			resultCode.append(arg);
		}
		resultCode.append(") :- ").append(value).append('.');
	}
	
	def void addFact(String predicate, List<String> arguments) {
		checkForDiscontiguity(predicate, arguments.length);
		resultCode.append('\n').append(predicate).append('(');
		var isFirst = true;
		for(arg : arguments) {
			if(!isFirst) {
				resultCode.append(',');
			} else {
				isFirst = false;
			}
			resultCode.append(arg);
		}
		resultCode.append(").");
		
	}
	
	
	def void addMinorHeading(String title) {
		resultCode.append( '''
		
		«buildMinorHeadingLine(title)»
		''')
	}
	
	def void addMajorHeading(String title) {
		resultCode.append( '''
		
		
		%«SEPARATOR_LINE»
		«buildMinorHeadingLine(title)»
		%«SEPARATOR_LINE»
		''')
	}
	
	/**
	 * Checks if the given predicate is a discontigous one.
	 */
	private def void checkForDiscontiguity(String predicate, int arity) {
		val predIdentifier = predicate+"/"+arity;
		if(!predIdentifier.equals(lastPredicate) && usedPredicates.contains(predIdentifier)) {
			discontigousPredicates.add(predIdentifier);
		}
		usedPredicates.add(predIdentifier);
		lastPredicate = predIdentifier;
	}
	
	private def String generateDiscontigousStatements() {
		val result = new StringBuffer;
		for(pred : discontigousPredicates) {
			result.append(''':-discontiguous(«pred»).''' + "\n");
		}
		return result.toString;
	}
	
	private def String buildMinorHeadingLine(String title) {
		val leftWidth = Math.max(0, (SEPARATOR_LINE.length() - title.length()) / 2);
		val rightBegin = Math.min(SEPARATOR_LINE.length(), leftWidth + title.length());
		return '''
		%«SEPARATOR_LINE.substring(0,leftWidth)»«title»«SEPARATOR_LINE.substring(rightBegin)»
		''';
	}
}