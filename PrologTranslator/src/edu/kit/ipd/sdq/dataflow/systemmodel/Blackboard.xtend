package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.WeakHashMap
import java.util.Set
import java.util.Collections

class Blackboard {
	
	WeakHashMap<DataType, Set<Attribute>> dataTypeAttributesCache = new WeakHashMap<DataType, Set<Attribute>>();
	
	def Set<Attribute> getDataTypeAttributes(DataType dt) {
		var result = dataTypeAttributesCache.get(dt);
		if(result === null) {
			result = Collections.newSetFromMap(new WeakHashMap<Attribute, Boolean>());
			result.addAll(dt.attributes);
			dataTypeAttributesCache.put(dt, result);
		}
		return Collections.unmodifiableSet(result);
	}
	
}