/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getParameterRef()
 * @model
 * @generated
 */
public interface ParameterRef extends LogicTerm {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Variable)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getParameterRef_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Variable getParameter();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Variable value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getParameterRef_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getParameterRef_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet assi = containingAssignment in\n\t\t\t\tif(assi.oclIsUndefined() or assi.oclContainer().oclIsUndefined()) then\n\t\t\t\t\tOperation.allInstances().parameters-&gt;asSet()\n\t\t\t\telse \n\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(OperationCall)) then\n\t\t\t\t\t\tlet caller = assi.oclContainer().oclAsType(OperationCall).caller in\n\t\t\t\t\t\tif (caller.oclIsKindOf(Operation)) then\n\t\t\t\t\t\t\tcaller.oclAsType(Operation).parameters-&gt;asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tSet{}\t\t\t\t\t\n\t\t\t\t\t\tendif\n\t\t\t\t\telse\n\t\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(Operation)) then\n\t\t\t\t\t\t\tassi.oclContainer().oclAsType(Operation).parameters-&gt;asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tOperation.allInstances().parameters-&gt;asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Variable> getPossibleParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif parameter.oclIsUndefined() then\n\t\t\t\t\tgetPossibleParameters().datatype.attributes-&gt;asSet()\n\t\t\t\telse\n\t\t\t\t\tparameter.datatype.attributes-&gt;asSet()\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Attribute> getPossibleAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes().type.values-&gt;asSet()\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values-&gt;asSet()\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Value> getPossibleValues();

} // ParameterRef
