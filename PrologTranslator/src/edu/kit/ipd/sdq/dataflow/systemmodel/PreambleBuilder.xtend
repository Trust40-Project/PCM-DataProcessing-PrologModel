package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.ArrayList

class PreambleBuilder {
	
	val Configuration config;
	
	new(Configuration config) {
		this.config = config;
	}
	
	def addDiscontigousRules(PrologProgram result) {
		
		var discontigousPredicates = new ArrayList<String>();
		discontigousPredicates.add("isDataType/1");
		discontigousPredicates.add("dataTypeAttribute/2");
		discontigousPredicates.add("isOperation/1");
		discontigousPredicates.add("hasProperty/2");
		discontigousPredicates.add("operationProperty/3");
		discontigousPredicates.add("operationParameterType/3");
		discontigousPredicates.add("operationReturnValueType/3");
		discontigousPredicates.add("operationCall/3");
		discontigousPredicates.add("callArgumentImpl/4");
		discontigousPredicates.add("returnValueImpl/4");
		discontigousPredicates.add("isSystemUsage/1");
		
		if(config.optimizedNegations) {
			discontigousPredicates.add("not_callArgumentImpl/4");
			discontigousPredicates.add("not_returnValueImpl/4");		
			discontigousPredicates.add("not_operationProperty/3");		
		}		
		
		for(pred : discontigousPredicates) {
			result.addRule("", '''discontiguous «pred»''')
		}
		
	}
	
	def addAPIRules(PrologProgram result) {
		
		result.addRule("callArgument([OP|S],VAR,A,VAL)",
			"isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL)"
		);
		result.addRule("returnValue([OP|S],VAR,A,VAL)", 
			"isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL)"
		);
		
		result.addRule("stackValid([SU])", "isSystemUsage(SU)");
		result.addRule("stackValid([DEST,CALL,SOURCE | S])", "operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S])");
		
	}
	
	def addLogicalNegationRules(PrologProgram result) {
		//simplification rules
		result.addRule("lnot(lnot(A))", "A");
		result.addRule("lnot((A,B))", "(lnot(A);lnot(B))");
		result.addRule("lnot((A;B))", "(lnot(A),lnot(B))");
		result.addRule("lnot(true)", "fail");
		result.addRule("lnot(fail)", "true");
		
		//translatiuon rules
		result.addRule("lnot(callArgumentImpl(S,P,A,V))", "not_callArgumentImpl(S,P,A,V)");
		result.addRule("lnot(returnValueImpl(S,P,A,V))", "not_returnValueImpl(S,P,A,V)");
		result.addRule("lnot(operationProperty(OP,P,V))", "not_operationProperty(OP,P,V)");
		//Facade translations
		result.addRule("lnot(callArgument([OP|S],VAR,A,VAL))",
			"isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_callArgumentImpl([OP|S],VAR,A,VAL)"
		);
		result.addRule("lnot(returnValue([OP|S],VAR,A,VAL))", 
			"isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_returnValueImpl([OP|S],VAR,A,VAL)"
		);
		
	}
	
	def addAPIShortcuts(PrologProgram result) {
		result.addRule("isAttribute(ATTRIB)", "attributeType(ATTRIB,_)");
		result.addRule("isProperty(ATTRIB)", "propertyType(ATTRIB,_)");
		
		result.addRule("operationParameter(OP,PARAM)", "operationParameterType(OP,PARAM,_)");
		result.addRule("operationReturnValue(OP,RVAL)", "operationReturnValueType(OP,RVAL,_)");
		
		
	}
		
	def buildPreamble(PrologProgram result) {
		addDiscontigousRules(result);
		addAPIShortcuts(result);
		addAPIRules(result);
		if(config.optimizedNegations) {
			addLogicalNegationRules(result);
		}
	}
	
}