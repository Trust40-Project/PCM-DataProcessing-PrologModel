/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl#getParameterAssignments <em>Parameter Assignments</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl#getPreCallStateDefinitions <em>Pre Call State Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallImpl extends MinimalEObjectImpl.Container implements OperationCall
{
	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected Operation callee;

	/**
	 * The cached value of the '{@link #getParameterAssignments() <em>Parameter Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> parameterAssignments;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreCallStateDefinitions() <em>Pre Call State Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCallStateDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> preCallStateDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallImpl()
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
		return PrologmodelPackage.Literals.OPERATION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getCallee()
	{
		if (callee != null && callee.eIsProxy())
		{
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (Operation)eResolveProxy(oldCallee);
			if (callee != oldCallee)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.OPERATION_CALL__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetCallee()
	{
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallee(Operation newCallee)
	{
		Operation oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.OPERATION_CALL__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableAssignment> getParameterAssignments()
	{
		if (parameterAssignments == null)
		{
			parameterAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS);
		}
		return parameterAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Caller getCaller()
	{
		if (eContainerFeatureID() != PrologmodelPackage.OPERATION_CALL__CALLER) return null;
		return (Caller)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaller(Caller newCaller, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newCaller, PrologmodelPackage.OPERATION_CALL__CALLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaller(Caller newCaller)
	{
		if (newCaller != eInternalContainer() || (eContainerFeatureID() != PrologmodelPackage.OPERATION_CALL__CALLER && newCaller != null))
		{
			if (EcoreUtil.isAncestor(this, newCaller))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCaller != null)
				msgs = ((InternalEObject)newCaller).eInverseAdd(this, PrologmodelPackage.CALLER__CALLS, Caller.class, msgs);
			msgs = basicSetCaller(newCaller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.OPERATION_CALL__CALLER, newCaller, newCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.OPERATION_CALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableAssignment> getPreCallStateDefinitions()
	{
		if (preCallStateDefinitions == null)
		{
			preCallStateDefinitions = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS);
		}
		return preCallStateDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCaller((Caller)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS:
				return ((InternalEList<?>)getParameterAssignments()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				return basicSetCaller(null, msgs);
			case PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS:
				return ((InternalEList<?>)getPreCallStateDefinitions()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				return eInternalContainer().eInverseRemove(this, PrologmodelPackage.CALLER__CALLS, Caller.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			case PrologmodelPackage.OPERATION_CALL__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS:
				return getParameterAssignments();
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				return getCaller();
			case PrologmodelPackage.OPERATION_CALL__NAME:
				return getName();
			case PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS:
				return getPreCallStateDefinitions();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PrologmodelPackage.OPERATION_CALL__CALLEE:
				setCallee((Operation)newValue);
				return;
			case PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS:
				getParameterAssignments().clear();
				getParameterAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
				return;
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				setCaller((Caller)newValue);
				return;
			case PrologmodelPackage.OPERATION_CALL__NAME:
				setName((String)newValue);
				return;
			case PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS:
				getPreCallStateDefinitions().clear();
				getPreCallStateDefinitions().addAll((Collection<? extends VariableAssignment>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PrologmodelPackage.OPERATION_CALL__CALLEE:
				setCallee((Operation)null);
				return;
			case PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS:
				getParameterAssignments().clear();
				return;
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				setCaller((Caller)null);
				return;
			case PrologmodelPackage.OPERATION_CALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS:
				getPreCallStateDefinitions().clear();
				return;
		}
		eDynamicUnset(featureID);
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
			case PrologmodelPackage.OPERATION_CALL__CALLEE:
				return callee != null;
			case PrologmodelPackage.OPERATION_CALL__PARAMETER_ASSIGNMENTS:
				return parameterAssignments != null && !parameterAssignments.isEmpty();
			case PrologmodelPackage.OPERATION_CALL__CALLER:
				return getCaller() != null;
			case PrologmodelPackage.OPERATION_CALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PrologmodelPackage.OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS:
				return preCallStateDefinitions != null && !preCallStateDefinitions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationCallImpl
