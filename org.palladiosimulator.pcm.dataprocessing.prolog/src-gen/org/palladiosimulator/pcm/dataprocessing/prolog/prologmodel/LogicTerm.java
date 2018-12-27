/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm#getContainingAssignment <em>Containing Assignment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getLogicTerm()
 * @model abstract="true"
 * @generated
 */
public interface LogicTerm extends EObject
{
	/**
	 * Returns the value of the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Assignment</em>' reference.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#getLogicTerm_ContainingAssignment()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let cont = self.oclAsSet()-&gt;closure(elem | elem.oclContainer())-&gt;any(e | e.oclIsKindOf(VariableAssignment)) in\n\t\t\t\tif(cont.oclIsInvalid()) then \n\t\t\t\t\tnull\n\t\t\t\telse \n\t\t\t\t\tcont.oclAsType(VariableAssignment)\n\t\t\t\tendif'"
	 * @generated
	 */
	VariableAssignment getContainingAssignment();

} // LogicTerm
