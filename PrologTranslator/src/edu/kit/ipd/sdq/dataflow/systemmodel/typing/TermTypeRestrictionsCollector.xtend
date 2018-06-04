package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.And
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.Not
import edu.kit.ipd.sdq.dataflow.systemmodel.Or
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef
import edu.kit.ipd.sdq.dataflow.systemmodel.Value
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable
import edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm

class TermTypeRestrictionsCollector {
	
	def dispatch void collect(LogicTerm term, TypeRestrictions restrictions) {
		//NOOP default
	}
	
	def dispatch void collect(Not term, TypeRestrictions restrictions) {
		collect(term.operand, restrictions);
	}
	
	def dispatch void collect(And term, TypeRestrictions restrictions) {
		collect(term.operands.get(0), restrictions);
		collect(term.operands.get(1), restrictions);
	}
	
	def dispatch void collect(Or term, TypeRestrictions restrictions) {
		collect(term.operands.get(0), restrictions);
		collect(term.operands.get(1), restrictions);
	}
	
	def dispatch void collect(PropertyRef term, TypeRestrictions restrictions) {
		//Value wildcard = Attribute must have the same type as the property
		if(term.value === null) {
			var res = new AttributeValueSetTypeRestriction(term.property.type);
			restrictions.addAttributeRestriction(res);
		}
	}
	
	def dispatch void collect(ReturnValueRef term, TypeRestrictions restrictions) {
		restrictions.isStackReferenced = true;
		collectForVariableReference(term.returnValue, term.attribute, term.value, restrictions);
	}
	
	def dispatch void collect(ParameterRef term, TypeRestrictions restrictions) {
		restrictions.isStackReferenced = true;
		collectForVariableReference(term.parameter, term.attribute, term.value, restrictions);
	}
	
	def private void collectForVariableReference(Variable vari, Attribute attrib, Value value, TypeRestrictions restrictions) {
		val isAttribWildcard = attrib === null;	
		val isValueWildcard = value === null;	
		
		if(isAttribWildcard) {
			val res = new AttributeDataTypeRestriction(vari.datatype);
			restrictions.addAttributeRestriction(res);
		}
		if(isAttribWildcard && !isValueWildcard) {
			val res = new AttributeValueSetTypeRestriction(value.containingType);
			restrictions.addAttributeRestriction(res);
		}
		if(!isAttribWildcard && isValueWildcard) {
			val res = new AttributeValueSetTypeRestriction(attrib.type);
			restrictions.addAttributeRestriction(res);
		}
	}
	
}