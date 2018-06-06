package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Set
import java.util.HashSet
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard

class TypeRestrictions {
	
	public static val NO_RESTRICTIONS = new TypeRestrictions();
	
	/**
	 * Specifies whether any term references the current stack-list.
	 * This required to prevent warnings about unused Variables in the Prolog Code.
	 */
	@Accessors
	boolean isStackReferenced = false;
	
	@Accessors(PUBLIC_GETTER,NONE)
	Set<AttributeRestriction> attributeRestrictions = new HashSet<AttributeRestriction>();
	
	def void addAttributeRestriction(AttributeRestriction restriction) {
		attributeRestrictions.add(restriction);
	}
	
	def boolean doesAttributeMatchRestrictions(Blackboard bb, Attribute attrib) {
		for(res : attributeRestrictions) {
			if(!res.doesAttributeMatch(bb, attrib)) {
				return false;
			}
		}
		return true;
	}
	
	def duplicate() {
		val copy = new TypeRestrictions();
		copy.isStackReferenced = this.isStackReferenced;
		copy.attributeRestrictions.addAll(this.attributeRestrictions);
		return copy;
	}
	
	def getMerged(TypeRestrictions other) {
		val copy = new TypeRestrictions();
		copy.isStackReferenced = this.isStackReferenced || other.isStackReferenced;
		copy.attributeRestrictions.addAll(this.attributeRestrictions);
		copy.attributeRestrictions.addAll(other.attributeRestrictions);
		return copy;
	}
	
	
}
