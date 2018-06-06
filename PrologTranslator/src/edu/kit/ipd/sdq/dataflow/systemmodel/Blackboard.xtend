package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.WeakHashMap
import java.util.Set
import java.util.Collections
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TermTypeRestrictionsCollector

class Blackboard {
	
	val dataTypeAttributesCache = new WeakHashMap<DataType, Set<Attribute>>();
	val typeRestrictionsCache = new WeakHashMap<LogicTerm, TypeRestrictions>();
	
	val termTypeRestrictionsCollector = new TermTypeRestrictionsCollector(this);
	
	def void clear() {
		dataTypeAttributesCache.clear();
		typeRestrictionsCache.clear();
	}
	
	def Set<Attribute> getDataTypeAttributes(DataType dt) {
		var result = dataTypeAttributesCache.get(dt);
		if(result === null) {
			result = Collections.newSetFromMap(new WeakHashMap<Attribute, Boolean>());
			result.addAll(dt.attributes);
			dataTypeAttributesCache.put(dt, result);
		}
		return Collections.unmodifiableSet(result);
	}
	
	def TypeRestrictions getTermTypeRestrictions(LogicTerm term) {
		var result = typeRestrictionsCache.get(term);
		if(result === null) {
			result = termTypeRestrictionsCollector.collect(term);
			typeRestrictionsCache.put(term, result);
		}
		return result;
	}
	
}