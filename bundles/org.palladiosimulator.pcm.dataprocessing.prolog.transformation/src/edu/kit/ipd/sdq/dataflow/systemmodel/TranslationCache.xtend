package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TermTypeRestrictionsCollector
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import java.util.Collections
import java.util.Set
import java.util.WeakHashMap
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm

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
	
	def Set<Attribute> getDataTypeAttributes(DataType dt) {
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
