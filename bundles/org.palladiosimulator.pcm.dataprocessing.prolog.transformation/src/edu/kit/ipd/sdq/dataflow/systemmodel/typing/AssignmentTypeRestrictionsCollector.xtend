package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment

/**
 * Collects the type restrictions for Assignments.
 * These Restrictions define for which Variable-Attribute-Value combination an assignment applies.
 */
class AssignmentTypeRestrictionsCollector {
	
	val TranslationCache cache;
	
	new(TranslationCache cache) {
		this.cache = cache;
	}
	
	def TypeRestrictions collect(VariableAssignment assignment) {
		var TypeRestrictions result = cache.getTermTypeRestrictions(assignment.term).duplicate();		
		if(assignment.isAttributeWildcard) {
			result.addAttributeRestriction(new AttributeDataTypeRestriction(assignment.variable.datatype));
			if(!assignment.isValueWildcard) {
				result.addAttributeRestriction(new AttributeValueSetTypeRestriction(assignment.value.containingType));				
			}
		}
		return result;
	}
}