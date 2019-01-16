package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.TranslationCache
import org.eclipse.xtend.lib.annotations.Data
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType

/**
 * Restriction that an unbound Attribute-Variable in an assignment rule must be of a certain ValueSetType.
 */
 @Data
class AttributeValueSetTypeRestriction implements AttributeRestriction {
	
	ValueSetType requiredValueSetType;
	
	override doesAttributeMatch(TranslationCache bb, Attribute attribute) {
		return attribute.type == requiredValueSetType;
	}
	
	override getPredicateForRestriction(String attributeVariable) {
		return '''attributeType(«attributeVariable», '«requiredValueSetType.name»')''';	
	}
	
}