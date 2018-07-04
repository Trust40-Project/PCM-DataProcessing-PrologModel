/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm#getContainingAssignment <em>Containing Assignment</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getLogicTerm()
 * @model abstract="true"
 * @generated
 */
public interface LogicTerm extends EObject {

	/**
	 * Returns the value of the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Assignment</em>' reference.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getLogicTerm_ContainingAssignment()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self-&gt;closure(elem | elem.oclContainer())-&gt;any(self-&gt;oclIsTypeOf(VariableAssignment))-&gt;oclAsType(VariableAssignment)'"
	 * @generated
	 */
	VariableAssignment getContainingAssignment();
} // LogicTerm
