package edu.kit.ipd.sdq.dataflow.systemmodel

class PrologProgram {
	
	var resultCode = new StringBuilder;
	
	val SEPARATOR_LINE = "----------------------------------------------------------------------------";
	
	def getCode() {
		return resultCode.toString()
	}
	
	def addRule(String pattern, String value) {
		resultCode.append( '''
		«pattern» :- «value».
		''')
	}
	
	def addFact(String fact) {
		resultCode.append( '''
		«fact».
		''')
	}
	
	
	def addMinorHeading(String title) {
		resultCode.append( '''
		
		«buildMinorHeadingLine(title)»
		''')
	}
	
	def addMajorHeading(String title) {
		resultCode.append( '''
		
		
		%«SEPARATOR_LINE»
		«buildMinorHeadingLine(title)»
		%«SEPARATOR_LINE»
		''')
	}
	
	private def buildMinorHeadingLine(String title) {
		val leftWidth = Math.max(0, (SEPARATOR_LINE.length() - title.length()) / 2);
		val rightBegin = Math.min(SEPARATOR_LINE.length(), leftWidth + title.length());
		return '''
		%«SEPARATOR_LINE.substring(0,leftWidth)»«title»«SEPARATOR_LINE.substring(rightBegin)»
		''';
	}
}