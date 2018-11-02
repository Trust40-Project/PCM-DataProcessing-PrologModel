package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache

/**
 * Superclass for all attribute type restrictions.
 */
interface AttributeRestriction {
	
	/**
	 * Checks whether the given Attribute fulfills the restrictions imposed by this instance.
	 * The blackboard is used as cache.
	 * 
	 * @param cache The TranslatioCache to use for speeding up reoccuring lookups
	 * @param attribute The attribute to check for a match
	 */
	def boolean doesAttributeMatch(TranslationCache cache, Attribute attribute);
	
	/**
	 * Return a prolog goal which represents this exact restriction in Prolog code.
	 * For example given the attributeVariable 'A' and teh restriction that this attribute needs to have the type 'mytype', the return code would be 'attributeDataType(A,'mytype')'.
	 * 
	 * @param attributeVariable The Prolog variable which is used to match the restrictions
	 */
	def String getPredicateForRestriction(String attributeVariable);
	
}
