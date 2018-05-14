/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Caller#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getCaller()
 * @model abstract="true"
 * @generated
 */
public interface Caller extends EObject {
	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getCaller_Calls()
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCaller
	 * @model opposite="caller" containment="true"
	 * @generated
	 */
	EList<OperationCall> getCalls();

} // Caller
