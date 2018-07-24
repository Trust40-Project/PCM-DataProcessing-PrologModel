package edu.kit.ipd.sdq.dataflow.systemmodel

import org.eclipse.xtend.lib.annotations.Accessors

class Configuration {
	
	@Accessors
	boolean optimizedNegations = true;
	@Accessors
	boolean shorterAssignments = false;
	
	@Accessors
	boolean argumentAndReturnValueIndexing = false;
}