/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

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
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getPresentValues <em>Present Values</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getPropertyDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valuesPartOfPropertyType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valuesPartOfPropertyType='getPossibleValues()-&gt;includesAll(presentValues)'"
 * @generated
 */
public interface PropertyDefinition extends EObject {
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
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getPropertyDefinition_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Present Values</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Present Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Values</em>' reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getPropertyDefinition_PresentValues()
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
