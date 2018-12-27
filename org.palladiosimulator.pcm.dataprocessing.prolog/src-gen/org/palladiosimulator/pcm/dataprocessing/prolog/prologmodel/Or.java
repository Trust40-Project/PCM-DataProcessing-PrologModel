/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends LogicTerm
{
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getOr_Operands()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<LogicTerm> getOperands();

} // Or
