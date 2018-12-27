/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getPresentValues <em>Present Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getPropertyDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valuesPartOfPropertyType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valuesPartOfPropertyType='getPossibleValues()-&gt;includesAll(presentValues)'"
 * @generated
 */
public interface PropertyDefinition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getPropertyDefinition_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Present Values</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Present Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Values</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getPropertyDefinition_PresentValues()
	 * @model
	 * @generated
	 */
	EList<Value> getPresentValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif property.oclIsUndefined() then\n\t\t\t\t\tProperty.allInstances().type.values-&gt;asSet()\n\t\t\t\telse\n\t\t\t\t\tproperty.type.values-&gt;asSet()\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Value> getPossibleValues();

} // PropertyDefinition
