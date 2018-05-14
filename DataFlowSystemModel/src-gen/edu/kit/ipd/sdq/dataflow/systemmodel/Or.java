/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or#getSecondOperand <em>Second Operand</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends LogicTerm {
	/**
	 * Returns the value of the '<em><b>First Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Operand</em>' containment reference.
	 * @see #setFirstOperand(LogicTerm)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOr_FirstOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicTerm getFirstOperand();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or#getFirstOperand <em>First Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Operand</em>' containment reference.
	 * @see #getFirstOperand()
	 * @generated
	 */
	void setFirstOperand(LogicTerm value);

	/**
	 * Returns the value of the '<em><b>Second Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Operand</em>' containment reference.
	 * @see #setSecondOperand(LogicTerm)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOr_SecondOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicTerm getSecondOperand();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or#getSecondOperand <em>Second Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Operand</em>' containment reference.
	 * @see #getSecondOperand()
	 * @generated
	 */
	void setSecondOperand(LogicTerm value);

} // Or
