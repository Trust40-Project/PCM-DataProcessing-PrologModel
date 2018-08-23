package edu.kit.ipd.sdq.dataflow.systemmodel

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

@ToString
class Configuration {
	
	@Accessors
	boolean optimizedNegations = true;
	@Accessors
	boolean shorterAssignments = true;
	
	@Accessors
	boolean argumentAndReturnValueIndexing = true;
}