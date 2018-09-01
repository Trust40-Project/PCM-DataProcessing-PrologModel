package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.WeakHashMap
import java.util.Set
import java.util.Collections
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TermTypeRestrictionsCollector

/**
 * Caches translation information which is potentially expensive to compute.
 */
class TranslationCache {
	
	val dataTypeAttributesCache = new WeakHashMap<edu.kit.ipd.sdq.dataflow.systemmodel.DataType, Set<edu.kit.ipd.sdq.dataflow.systemmodel.Attribute>>();
	val typeRestrictionsCache = new WeakHashMap<edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm, TypeRestrictions>();
	
	val termTypeRestrictionsCollector = new TermTypeRestrictionsCollector(this);
	
	def void clear() {
		dataTypeAttributesCache.clear();
		typeRestrictionsCache.clear();
	}
	
	def Set<edu.kit.ipd.sdq.dataflow.systemmodel.Attribute> getDataTypeAttributes(edu.kit.ipd.sdq.dataflow.systemmodel.DataType dt) {
		var result = dataTypeAttributesCache.get(dt);
		if(result === null) {
			result = Collections.newSetFromMap(new WeakHashMap<edu.kit.ipd.sdq.dataflow.systemmodel.Attribute, Boolean>());
			result.addAll(dt.attributes);
			dataTypeAttributesCache.put(dt, result);
		}
		return Collections.unmodifiableSet(result);
	}
	
	def TypeRestrictions getTermTypeRestrictions(edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm term) {
		var result = typeRestrictionsCache.get(term);
		if(result === null) {
			result = termTypeRestrictionsCollector.collect(term);
			typeRestrictionsCache.put(term, result);
		}
		return result;
	}
	
}
