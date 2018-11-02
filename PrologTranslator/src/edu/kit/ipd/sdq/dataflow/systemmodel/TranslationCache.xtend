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
	
	val dataTypeAttributesCache = new WeakHashMap<DataType, Set<Attribute>>();
	val typeRestrictionsCache = new WeakHashMap<LogicTerm, TypeRestrictions>();
	
	val termTypeRestrictionsCollector = new TermTypeRestrictionsCollector(this);
	
	def void clear() {
		dataTypeAttributesCache.clear();
		typeRestrictionsCache.clear();
	}
	
	def Set<edu.kit.ipd.sdq.dataflow.systemmodel.Attribute> getDataTypeAttributes(DataType dt) {
		val result = dataTypeAttributesCache.computeIfAbsent(dt, [type |
			val set = Collections.newSetFromMap(new WeakHashMap<Attribute, Boolean>());
			set.addAll(type.attributes);
			return set;
		]);
		return Collections.unmodifiableSet(result);
	}
	
	def TypeRestrictions getTermTypeRestrictions(LogicTerm term) {
		val result = typeRestrictionsCache.computeIfAbsent(term, [ t |
			 termTypeRestrictionsCollector.collect(t)
		]);
		return result;
	}
	
}
