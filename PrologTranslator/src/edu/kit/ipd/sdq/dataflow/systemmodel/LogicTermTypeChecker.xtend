package edu.kit.ipd.sdq.dataflow.systemmodel

class LogicTermTypeChecker {
	
	def dispatch boolean isAttributeValueComboValid(True term, Attribute attrib, Value value) {
		return true;
	}
	
	def dispatch boolean isAttributeValueComboValid(False term, Attribute attrib, Value value) {
		return true;
	}
	
	def dispatch boolean isAttributeValueComboValid(Not term, Attribute attrib, Value value) {
		return isAttributeValueComboValid(term.operand, attrib, value);
	}
	
	def dispatch boolean isAttributeValueComboValid(And term, Attribute attrib, Value value) {
		return isAttributeValueComboValid(term.operands.get(0), attrib, value)
		&& isAttributeValueComboValid(term.operands.get(0), attrib, value);
	}
	
	def dispatch boolean isAttributeValueComboValid(Or term, Attribute attrib, Value value) {
		return isAttributeValueComboValid(term.operands.get(0), attrib, value)
		&& isAttributeValueComboValid(term.operands.get(0), attrib, value);
	}
	
	def dispatch boolean isAttributeValueComboValid(PropertyRef term, Attribute attrib, Value value) {
		if(term.value !== null) {
			//No wildcard-value, always okay
			return true;
		} else {
			return term.property.type.values.contains(value);
		}
	}
	
	def dispatch boolean isAttributeValueComboValid(ParameterRef term, Attribute attrib, Value value) {
		val paramAttribute = term.attribute ?: attrib;
		val paramValue = term.value ?: value;
		return term.parameter.datatype.attributes.contains(paramAttribute) && paramAttribute.type.values.contains(paramValue);
	}
	
	def dispatch boolean isAttributeValueComboValid(ReturnValueRef term, Attribute attrib, Value value) {
		val rvAttribute = term.attribute ?: attrib;
		val rvValue = term.value ?: value;
		return term.returnValue.datatype.attributes.contains(rvAttribute) && rvAttribute.type.values.contains(rvValue);
	}
}