package edu.kit.ipd.sdq.dataflow.systemmodel

class LogicTermTranslator {
	
	val Blackboard bb;
	val Configuration config
	
	new(Blackboard bb, Configuration config) {
		this.bb = bb;
		this.config = config;
	}
	
	def dispatch String translate(True term, String stackList, String attrib, String value) {
		return "true";
	}
	
	def dispatch String translate(False term, String stackList, String attrib, String value) {
		return "fail";
	}
	
	def dispatch String translate(Not term, String stackList, String attrib, String value) {
		if(config.optimizedNegations) {
			return '''lnot(«translate(term.operand,stackList,attrib,value)»)''';	
		} else {
			if(bb.getTermTypeRestrictions(term.operand).isStackReferenced) {
				//we have to bind the stack-variable in case it is used within the negated operand
				//all other possible variables are required to be bound when invoking logical terms
				return '''(stackValid(«stackList»), \+ «translate(term.operand,stackList,attrib,value)»)''';			
			} else {
				return '''\+ «translate(term.operand,stackList,attrib,value)»)''';			
			}
		}
	}
	
	def dispatch String translate(And term, String stackList, String attrib, String value) {
		return '''(«translate(term.operands.get(0),stackList,attrib,value)» , «translate(term.operands.get(1),stackList,attrib,value)»)''';
	}
	
	def dispatch String translate(Or term, String stackList, String attrib, String value) {
		return '''(«translate(term.operands.get(0),stackList,attrib,value)» ; «translate(term.operands.get(1),stackList,attrib,value)»)''';
	}
	
	def dispatch String translate(PropertyRef term, String stackList, String attrib, String value) {
		return '''operationProperty('«term.operation.name»','«term.property.name»','«term.value?.name ?: value»')''';
	}
	
	def dispatch String translate(ParameterRef term, String stackList, String attrib, String value) {
		return '''callArgumentImpl(«stackList»,'«term.parameter.name»','«term.attribute?.name ?: attrib»','«term.value?.name ?: value»')''';
	}
	
	def dispatch String translate(ReturnValueRef term, String stackList, String attrib, String value) {
		val callStack = '''['«term.call.callee.name»','«term.call.name»'|«stackList»]'''
		return '''returnValueImpl(«callStack»,'«term.returnValue.name»','«term.attribute?.name ?: attrib»','«term.value?.name ?: value»')''';
	}
	
}