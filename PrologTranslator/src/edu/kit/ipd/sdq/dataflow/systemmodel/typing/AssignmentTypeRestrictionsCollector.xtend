package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment
import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard

class AssignmentTypeRestrictionsCollector {
	
	val Blackboard bb;
	
	new(Blackboard bb) {
		this.bb = bb;
	}
	
	def TypeRestrictions collect(VariableAssignment assignment) {
		var TypeRestrictions result;
		try {
			result = bb.getTermTypeRestrictions(assignment.term).duplicate();
		}catch(Exception e) {
			println("test")
		}
		
		val isAttributeWildCard = assignment.attribute === null;
		val isValueWildCard = assignment.value === null;
		
		if(isAttributeWildCard) {
			result.addAttributeRestriction(new AttributeDataTypeRestriction(assignment.variable.datatype));
			if(!isValueWildCard) {
				result.addAttributeRestriction(new AttributeValueSetTypeRestriction(assignment.value.containingType));				
			}
		}
		return result;
	}
}