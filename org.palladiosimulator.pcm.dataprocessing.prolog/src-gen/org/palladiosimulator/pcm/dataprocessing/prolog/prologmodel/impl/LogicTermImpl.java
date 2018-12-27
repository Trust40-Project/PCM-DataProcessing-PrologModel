/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.LogicTermImpl#getContainingAssignment <em>Containing Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LogicTermImpl extends MinimalEObjectImpl.Container implements LogicTerm
{
	/**
	 * The cached setting delegate for the '{@link #getContainingAssignment() <em>Containing Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingAssignment()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_ASSIGNMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PrologmodelPackage.Literals.LOGIC_TERM__CONTAINING_ASSIGNMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicTermImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PrologmodelPackage.Literals.LOGIC_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment getContainingAssignment()
	{
		return (VariableAssignment)CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment basicGetContainingAssignment()
	{
		return (VariableAssignment)CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PrologmodelPackage.LOGIC_TERM__CONTAINING_ASSIGNMENT:
				if (resolve) return getContainingAssignment();
				return basicGetContainingAssignment();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PrologmodelPackage.LOGIC_TERM__CONTAINING_ASSIGNMENT:
				return CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return eDynamicIsSet(featureID);
	}

} //LogicTermImpl
