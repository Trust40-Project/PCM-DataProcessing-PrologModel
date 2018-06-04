package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment

class AssignmentTypeRestrictionsCollector {
	
	val termRestrictionsCollector = new TermTypeRestrictionsCollector();
	
	def TypeRestrictions collect(VariableAssignment assignment) {
		val result = new TypeRestrictions();
		
		val isAttributeWildCard = assignment.attribute === null;
		val isValueWildCard = assignment.value === null;
		
		if(isAttributeWildCard) {
			result.addAttributeRestriction(new AttributeDataTypeRestriction(assignment.variable.datatype));
			if(!isValueWildCard) {
				result.addAttributeRestriction(new AttributeValueSetTypeRestriction(assignment.value.containingType));				
			}
		}
		termRestrictionsCollector.collect(assignment.term, result);		
		return result;
	}
}