/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getParameterAssignments <em>Parameter Assignments</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getPreCallStateDefinitions <em>Pre Call State Definitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall()
 * @model
 * @generated
 */
public interface OperationCall extends EObject
{
	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(Operation)
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall_Callee()
	 * @model required="true"
	 * @generated
	 */
	Operation getCallee();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Assignments</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall_ParameterAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getParameterAssignments();

	/**
	 * Returns the value of the '<em><b>Caller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' container reference.
	 * @see #setCaller(Caller)
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall_Caller()
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getCalls
	 * @model opposite="calls" required="true" transient="false"
	 * @generated
	 */
	Caller getCaller();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCaller <em>Caller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' container reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(Caller value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pre Call State Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Call State Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Call State Definitions</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOperationCall_PreCallStateDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getPreCallStateDefinitions();

} // OperationCall
