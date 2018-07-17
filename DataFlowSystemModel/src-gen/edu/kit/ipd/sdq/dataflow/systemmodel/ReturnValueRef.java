/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getValue <em>Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getReturnValueRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='returnValueIsContainedInTargetOperation isAttributePartOfReturnValue isValuePartOfAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot returnValueIsContainedInTargetOperation='call.callee.returnValues-&gt;includes(returnValue)' isAttributePartOfReturnValue='(not attribute.oclIsUndefined()) implies returnValue.datatype.attributes-&gt;includes(attribute)' isValuePartOfAttribute='(not attribute.oclIsUndefined() and not value.oclIsUndefined())\n\t\t\t\t\t\t\t\t\t\t\timplies attribute.type.values-&gt;includes(value)'"
 * @generated
 */
public interface ReturnValueRef extends LogicTerm {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' reference.
	 * @see #setReturnValue(Variable)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getReturnValueRef_ReturnValue()
	 * @model required="true"
	 * @generated
	 */
	Variable getReturnValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getReturnValue <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Variable value);

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
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getReturnValueRef_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getAttribute <em>Attribute</em>}' reference.
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
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getReturnValueRef_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(OperationCall)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getReturnValueRef_Call()
	 * @model required="true"
	 * @generated
	 */
	OperationCall getCall();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(OperationCall value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tlet assi = containingAssignment in\n\t\t\t\tif(assi.oclIsUndefined() or assi.oclContainer().oclIsUndefined()) then\n\t\t\t\t\tCaller.allInstances().calls-&gt;asSet()\n\t\t\t\telse \n\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(OperationCall)) then\n\t\t\t\t\t\tlet call = assi.oclContainer().oclAsType(OperationCall) in\n\t\t\t\t\t\tlet callIdx = call.caller.calls-&gt;indexOf(call) in\n\t\t\t\t\t\tif(callIdx = 1) then\n\t\t\t\t\t\t\tSet{}\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tcall.caller.calls-&gt;subOrderedSet(1, callIdx-1)-&gt;asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\telse\n\t\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(Caller)) then\n\t\t\t\t\t\t\tassi.oclContainer().oclAsType(Caller).calls-&gt;asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tCaller.allInstances().calls-&gt;asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<OperationCall> getPossibleCalls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(call.oclIsUndefined()) then\n\t\t\t\t\tgetPossibleCalls().callee.returnValues-&gt;asSet()\n\t\t\t\telse\n\t\t\t\t\tcall.callee.returnValues-&gt;asSet()\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Variable> getPossibleReturnValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif returnValue.oclIsUndefined() then\n\t\t\t\t\tgetPossibleReturnValues().datatype.attributes-&gt;asSet()\n\t\t\t\telse\n\t\t\t\t\treturnValue.datatype.attributes-&gt;asSet()\n\t\t\t\tendif'"
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

} // ReturnValueRef
