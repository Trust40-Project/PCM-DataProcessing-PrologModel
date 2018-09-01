package edu.kit.ipd.sdq.dataflow.systemmodel

/**
 * Specifies using which predicates state variables are accessed.
 */
enum StateAccessMode {
	/**
	 * Use the preCallState-predicate.
	 */
	PRECALL,
	/**
	 * Use the postCallState-predicate.
	 */
	POSTCALL
}