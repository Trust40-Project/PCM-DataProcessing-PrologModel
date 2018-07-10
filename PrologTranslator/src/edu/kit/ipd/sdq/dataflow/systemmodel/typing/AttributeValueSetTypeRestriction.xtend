package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType
import org.eclipse.xtend.lib.annotations.Data
import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute

/**
 * Restriction that an unbound Attribute-Variable in an assignment rule must be of a certain ValueSetType.
 */
 @Data
class AttributeValueSetTypeRestriction implements AttributeRestriction {
	
	ValueSetType requiredValueSetType;
	
	override doesAttributeMatch(Blackboard bb, Attribute attribute) {
		return attribute.type == requiredValueSetType;
	}
	
	override getPredicateForRestriction(String attributeVariable) {
		return '''attributeType(«attributeVariable», '«requiredValueSetType.name»')''';	
	}
	
}