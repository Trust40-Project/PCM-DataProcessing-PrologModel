package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment
import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache

class AssignmentTypeRestrictionsCollector {
	
	val TranslationCache bb;
	
	new(TranslationCache bb) {
		this.bb = bb;
	}
	
	def TypeRestrictions collect(VariableAssignment assignment) {
		var TypeRestrictions result = bb.getTermTypeRestrictions(assignment.term).duplicate();		
		if(assignment.isAttributeWildcard) {
			result.addAttributeRestriction(new AttributeDataTypeRestriction(assignment.variable.datatype));
			if(!assignment.isValueWildcard) {
				result.addAttributeRestriction(new AttributeValueSetTypeRestriction(assignment.value.containingType));				
			}
		}
		return result;
	}
}