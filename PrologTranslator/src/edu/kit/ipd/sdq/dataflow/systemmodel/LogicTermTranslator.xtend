package edu.kit.ipd.sdq.dataflow.systemmodel

class LogicTermTranslator {
	
	def dispatch String translate(True term, String stackList, Attribute attrib, Value value) {
		return "true";
	}
	
	def dispatch String translate(False term, String stackList, Attribute attrib, Value value) {
		return "fail";
	}
	
	def dispatch String translate(Not term, String stackList, Attribute attrib, Value value) {
		return '''(stackValid(«stackList»), \+ «translate(term.operand,stackList,attrib,value)»)''';
	}
	
	def dispatch String translate(And term, String stackList, Attribute attrib, Value value) {
		return '''(«translate(term.operands.get(0),stackList,attrib,value)» , «translate(term.operands.get(1),stackList,attrib,value)»)''';
	}
	
	def dispatch String translate(Or term, String stackList, Attribute attrib, Value value) {
		return '''(«translate(term.operands.get(0),stackList,attrib,value)» ; «translate(term.operands.get(1),stackList,attrib,value)»)''';
	}
	
	def dispatch String translate(PropertyRef term, String stackList, Attribute attrib, Value value) {
		return '''operationProperty('«term.operation.name»','«term.property.name»','«term.value?.name ?: value.name»')''';
	}
	
	def dispatch String translate(ParameterRef term, String stackList, Attribute attrib, Value value) {
		return '''callArgument(«stackList»,'«term.parameter.name»','«term.attribute?.name ?: attrib.name»','«term.value?.name ?: value.name»')''';
	}
	
	def dispatch String translate(ReturnValueRef term, String stackList, Attribute attrib, Value value) {
		val callStack = '''[«term.call.callee.name»,«term.call.name» | «stackList»]'''
		return '''returnValue(«callStack»,'«term.returnValue.name»','«term.attribute?.name ?: attrib.name»','«term.value?.name ?: value.name»')''';
	}
	
}