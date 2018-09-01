package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.DataType
import org.eclipse.xtend.lib.annotations.Data
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache

/**
 * Restriction that an unbound Attribute-Variable in an assignment rule must be part of a DataType.
 */
 @Data
class AttributeDataTypeRestriction implements AttributeRestriction {
	
	DataType requiredContainingDataType;
	
	override doesAttributeMatch(TranslationCache bb, Attribute attribute) {
		return bb.getDataTypeAttributes(requiredContainingDataType).contains(attribute);
	}
	
	override getPredicateForRestriction(String attributeVariable) {
		return '''dataTypeAttribute('«requiredContainingDataType.name»', «attributeVariable»)''';	
	}
	
}
