package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration

import static java.util.Arrays.asList

import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.negatedPredicate

/**
 * Builds teh preamble added to every program.
 * This preamble defines common analysis logic.
 */
class PreambleBuilder {
	
	val Configuration config;
	
	new(Configuration config) {
		this.config = config;
	}
	
	def addAPIRules(PrologProgram result) {
		
		result.addRule("callArgument",
			asList("[OP|S]","VAR","A","VAL"),
			"isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL)"
		);
		result.addRule("returnValue", 
			asList("[OP|S]","VAR","A","VAL"),
			"isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL)"
		);
		result.addRule("preCallState", 
			asList("[SOP|S]","OP","VAR","A","VAL"),
			"isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),preCallStateImpl([SOP|S],OP,VAR,A,VAL)"
		);
		result.addRule("postCallState",
			asList("[SOP|S]","OP","VAR","A","VAL"),
			"isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),postCallStateImpl([SOP|S],OP,VAR,A,VAL)"
		);
		result.addRule("defaultState", 
			asList("OP","VAR","A","VAL"),
			"operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),defaultStateImpl(OP,VAR,A,VAL)"
		);
		
		result.addRule("stackValid",asList("[SU]"), "isSystemUsage(SU)");
		result.addRule("stackValid",asList("[DEST,CALL,SOURCE | S]"), "operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S])");
		
	}
	
	def addLogicalNegationRules(PrologProgram result) {
		//simplification rules
		result.addRule("lnot",asList("lnot(A)"), "A");
		result.addRule("lnot",asList("(A,B)"), "(lnot(A);lnot(B))");
		result.addRule("lnot",asList("(A;B)"), "(lnot(A),lnot(B))");
		result.addRule("lnot",asList("true"), "fail");
		result.addRule("lnot",asList("fail"), "true");
		
		//translatiuon rules
		result.addRule("lnot",asList("callArgumentImpl(S,P,A,V)"), "callArgumentImpl(S,P,A,V)".negatedPredicate);
		result.addRule("lnot",asList("returnValueImpl(S,P,A,V)"), "returnValueImpl(S,P,A,V)".negatedPredicate);
		result.addRule("lnot",asList("operationProperty(OP,P,V)"), "operationProperty(OP,P,V)".negatedPredicate);
		result.addRule("lnot",asList("preCallStateImpl(S,OP,P,A,V)"), "preCallStateImpl(S,OP,P,A,V)".negatedPredicate);
		result.addRule("lnot",asList("postCallStateImpl(S,OP,P,A,V)"), "postCallStateImpl(S,OP,P,A,V)".negatedPredicate);
		result.addRule("lnot",asList("defaultStateImpl(OP,VAR,A,V)"), "defaultStateImpl(OP,VAR,A,V)".negatedPredicate);
		//Facade translations
		result.addRule("lnot",
			asList("callArgument([OP|S],VAR,A,VAL)"),
			"isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL)," + "callArgumentImpl([OP|S],VAR,A,VAL)".negatedPredicate
		);
		result.addRule("lnot", 
			asList("returnValue([OP|S],VAR,A,VAL)"),
			"isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL)," + "returnValueImpl([OP|S],VAR,A,VAL)".negatedPredicate
		);
		result.addRule("lnot",
			asList("preCallState([SOP|S],OP,VAR,A,VAL)"),
			"isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL)," + "preCallStateImpl([SOP|S],OP,VAR,A,VAL)".negatedPredicate
		);
		result.addRule("lnot",
			asList("postCallState([SOP|S],OP,VAR,A,VAL)"),
			"isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL)," + "postCallStateImpl([SOP|S],OP,VAR,A,VAL)".negatedPredicate
		);
		result.addRule("lnot",
			asList("defaultState(OP,VAR,A,VAL)"),
			"operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL)," + "defaultStateImpl(OP,VAR,A,VAL)".negatedPredicate
		);
		
	}
	
	def addIndexResolvingRules(PrologProgram result) {
		result.addRule("callArgumentImpl",
			asList("[OP|S]","VAR","A","VAL"),
			"callArgumentIndexed(OP, [OP|S],VAR,A,VAL)");
		result.addRule("returnValueImpl",
			asList("[OP|S]","VAR","A","VAL"),
			"returnValueIndexed(OP, [OP|S],VAR,A,VAL)");
		result.addRule("preCallStateImpl",
			asList("[OP|S]","OWNER","VAR","A","VAL"),
			"preCallStateIndexed(OP, [OP|S],OWNER,VAR,A,VAL)");
		result.addRule("postCallStateImpl",
			asList("[OP|S]","OWNER","VAR","A","VAL"),
			"postCallStateIndexed(OP, [OP|S],OWNER,VAR,A,VAL)");
		if(config.optimizedNegations) {
			result.addRule("callArgumentImpl".negatedPredicate,
				asList("[OP|S]","VAR","A","VAL"),
				"callArgumentIndexed(OP, [OP|S],VAR,A,VAL)".negatedPredicate);
			result.addRule("returnValueImpl".negatedPredicate,
				asList("[OP|S]","VAR","A","VAL"),
				"returnValueIndexed(OP, [OP|S],VAR,A,VAL)".negatedPredicate);
			result.addRule("preCallStateImpl".negatedPredicate,
				asList("[OP|S]","OWNER","VAR","A","VAL"),
				"preCallStateIndexed(OP, [OP|S],OWNER,VAR,A,VAL)".negatedPredicate);
			result.addRule("postCallStateImpl".negatedPredicate,
				asList("[OP|S]","OWNER","VAR","A","VAL"),
				"postCallStateIndexed(OP, [OP|S],OWNER,VAR,A,VAL)".negatedPredicate);
		}
	}
	
	def addAPIShortcuts(PrologProgram result) {
		result.addRule("isAttribute",asList("ATTRIB"), "attributeType(ATTRIB,_)");
		result.addRule("isProperty",asList("ATTRIB"), "propertyType(ATTRIB,_)");
		
		result.addRule("operationParameter",asList("OP","PARAM"), "operationParameterType(OP,PARAM,_)");
		result.addRule("operationReturnValue",asList("OP","RVAL"), "operationReturnValueType(OP,RVAL,_)");	
		result.addRule("operationState",asList("OP","SVAL"), "operationStateType(OP,SVAL,_)");		
	}
		
	def buildPreamble(PrologProgram result) {
		addAPIShortcuts(result);
		addAPIRules(result);
		if(config.optimizedNegations) {
			addLogicalNegationRules(result);
		}
		if(config.argumentAndReturnValueIndexing) {
			addIndexResolvingRules(result);
		}
	}
	
}