package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache

interface AttributeRestriction {
	
	/**
	 * Checks whether the given Attribute fulfills the restrictions imposed by this instance.
	 * The blackboard is used as cache.
	 */
	def boolean doesAttributeMatch(TranslationCache bb, Attribute attribute);
	
	/**
	 * Return a prolog goal which represents this exact restriction in Prolog code.
	 * For example given the attributeVariable 'A' and teh restriction that this attribute needs to have the type 'mytype', the return code would be 'attributeDataType(A,'mytype')'.
	 */
	def String getPredicateForRestriction(String attributeVariable);
	
}
