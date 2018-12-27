package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable

/**
 * Collects all TypeRestrictions for a given LogicTerm.
 */
class TermTypeRestrictionsCollector {
	
	var TranslationCache bb;
	
	new(TranslationCache bb) {
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
		if(term.isValueWildcard) {
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
	
	private def collectForVariableReference(Variable vari, Attribute attrib, Value value, TypeRestrictions restrictions) {
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