/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getTerm <em>Term</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getIsAttributeWildcard <em>Is Attribute Wildcard</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getIsValueWildcard <em>Is Value Wildcard</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isVariableValid isAttributeValid isValueValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isVariableValid='getPossibleVariables()-&gt;includes(variable)' isAttributeValid='getPossibleAttributes()-&gt;includes(attribute)' isValueValid='getPossibleValues()-&gt;includes(value)'"
 * @generated
 */
public interface VariableAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

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
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getAttribute <em>Attribute</em>}' reference.
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
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(LogicTerm)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicTerm getTerm();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(LogicTerm value);

	/**
	 * Returns the value of the '<em><b>Is Attribute Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute Wildcard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute Wildcard</em>' attribute.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_IsAttributeWildcard()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='attribute.oclIsUndefined()'"
	 * @generated
	 */
	Boolean getIsAttributeWildcard();

	/**
	 * Returns the value of the '<em><b>Is Value Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Value Wildcard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Value Wildcard</em>' attribute.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getVariableAssignment_IsValueWildcard()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='attribute.oclIsUndefined()'"
	 * @generated
	 */
	Boolean getIsValueWildcard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet cont = self.oclContainer() in\n\t\t\t\tif(cont.oclIsUndefined()) then\n\t\t\t\t\tVariable.allInstances()-&gt;asSet()\n\t\t\t\telse \n\t\t\t\t\tif(cont.oclIsKindOf(OperationCall)) then\n\t\t\t\t\t\tif cont.oclAsType(OperationCall).parameterAssignments-&gt;includes(self) then\n\t\t\t\t\t\t\tcont.oclAsType(OperationCall).callee.parameters-&gt;asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tOperation.allInstances().stateVariables-&gt;asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\telse\n\t\t\t\t\t\tif(cont.oclIsKindOf(Operation)) then\n\t\t\t\t\t\t\tif cont.oclAsType(Operation).returnValueAssignments-&gt;includes(self) then\n\t\t\t\t\t\t\t\tcont.oclAsType(Operation).returnValues-&gt;asSet()\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif cont.oclAsType(Operation).defaultStateDefinitions-&gt;includes(self) then\n\t\t\t\t\t\t\t\t\tcont.oclAsType(Operation).stateVariables-&gt;asSet()\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tOperation.allInstances().stateVariables-&gt;asSet()\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tVariable.allInstances()-&gt;asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Variable> getPossibleVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif variable.oclIsUndefined() then\n\t\t\t\t\tgetPossibleVariables().datatype.attributes-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tvariable.datatype.attributes-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Attribute> getPossibleAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()-&gt;reject(oclIsUndefined()).type.values-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Value> getPossibleValues();

} // VariableAssignment
