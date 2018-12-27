/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
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
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getValue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' container reference.
	 * @see #setContainingType(ValueSetType)
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getValue_ContainingType()
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	ValueSetType getContainingType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getContainingType <em>Containing Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Type</em>' container reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(ValueSetType value);

} // Value
