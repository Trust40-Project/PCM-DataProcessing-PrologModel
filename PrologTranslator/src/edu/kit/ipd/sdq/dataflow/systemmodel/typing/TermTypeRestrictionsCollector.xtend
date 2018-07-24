package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.And
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard
import edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm
import edu.kit.ipd.sdq.dataflow.systemmodel.Not
import edu.kit.ipd.sdq.dataflow.systemmodel.Or
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef
import edu.kit.ipd.sdq.dataflow.systemmodel.Value
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable
import edu.kit.ipd.sdq.dataflow.systemmodel.StateRef
import edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef

class TermTypeRestrictionsCollector {
	
	var Blackboard bb;
	
	new(Blackboard bb) {
		this.bb = bb;
	}
	
	def dispatch collect(LogicTerm term) {
		return TypeRestrictions.NO_RESTRICTIONS;
	}
	
	def dispatch collect(Not term) {
		return bb.getTermTypeRestrictions(term.operand);
	}
	
	def dispatch collect(And term) {
		return bb.getTermTypeRestrictions(term.operands.get(0))
			.getMerged(bb.getTermTypeRestrictions(term.operands.get(1)));
	}
	
	def dispatch collect(Or term) {
		return bb.getTermTypeRestrictions(term.operands.get(0))
			.getMerged(bb.getTermTypeRestrictions(term.operands.get(1)));
	}
	
	def dispatch collect(PropertyRef term) {
		if(term.value === null) {
			val restrictions = new TypeRestrictions();
			restrictions.addAttributeRestriction(new AttributeValueSetTypeRestriction(term.property.type));
			restrictions.valueWildCardReferenced = true;
			return restrictions;
		} else {
			return TypeRestrictions.NO_RESTRICTIONS;
		}
	}
	
	def dispatch collect(ReturnValueRef term) {
		val restrictions = new TypeRestrictions();
		restrictions.isStackReferenced = true;
		collectForVariableReference(term.returnValue, term.attribute, term.value, restrictions);
		return restrictions;
	}
	
	def dispatch collect(ParameterRef term) {
		val restrictions = new TypeRestrictions();
		restrictions.isStackReferenced = true;
		collectForVariableReference(term.parameter, term.attribute, term.value, restrictions);
		return restrictions;
	}
	
	def dispatch collect(StateRef term) {
		val restrictions = new TypeRestrictions();
		restrictions.isStackReferenced = true;
		collectForVariableReference(term.stateVariable, term.attribute, term.value, restrictions);
		return restrictions;
	}
	
	def dispatch collect(DefaultStateRef term) {
		val restrictions = new TypeRestrictions();
		//default state is independent of the stack
		restrictions.isStackReferenced = false;
		collectForVariableReference(term.stateVariable, term.attribute, term.value, restrictions);
		return restrictions;
	}
	
	def private collectForVariableReference(Variable vari, Attribute attrib, Value value, TypeRestrictions restrictions) {
		val isAttribWildcard = attrib === null;	
		val isValueWildcard = value === null;	
		
		restrictions.attributeWildCardReferenced = isAttribWildcard;
		restrictions.valueWildCardReferenced = isValueWildcard;
		
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