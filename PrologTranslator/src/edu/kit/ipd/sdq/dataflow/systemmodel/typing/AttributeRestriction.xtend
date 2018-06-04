package edu.kit.ipd.sdq.dataflow.systemmodel.typing

import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute

interface AttributeRestriction {
	
	def boolean doesAttributeMatch(Blackboard bb, Attribute attribute);
	
}
