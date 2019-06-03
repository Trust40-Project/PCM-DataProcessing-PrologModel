/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default State Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl#getStateVariable <em>State Variable</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultStateRefImpl extends LogicTermImpl implements DefaultStateRef
{
	/**
	 * The cached value of the '{@link #getStateVariable() <em>State Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable stateVariable;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultStateRefImpl()
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
		return PrologmodelPackage.Literals.DEFAULT_STATE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getStateVariable()
	{
		if (stateVariable != null && stateVariable.eIsProxy())
		{
			InternalEObject oldStateVariable = (InternalEObject)stateVariable;
			stateVariable = (Variable)eResolveProxy(oldStateVariable);
			if (stateVariable != oldStateVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE, oldStateVariable, stateVariable));
			}
		}
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetStateVariable()
	{
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateVariable(Variable newStateVariable)
	{
		Variable oldStateVariable = stateVariable;
		stateVariable = newStateVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE, oldStateVariable, stateVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute()
	{
		if (attribute != null && attribute.eIsProxy())
		{
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute()
	{
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Attribute newAttribute)
	{
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getValue()
	{
		if (value != null && value.eIsProxy())
		{
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.DEFAULT_STATE_REF__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Value newValue)
	{
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.DEFAULT_STATE_REF__VALUE, oldValue, value));
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleVariables()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VARIABLES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.DEFAULT_STATE_REF___GET_POSSIBLE_VARIABLES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Variable> getPossibleVariables()
	{
		try
		{
			return (EList<Variable>)GET_POSSIBLE_VARIABLES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_ATTRIBUTES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.DEFAULT_STATE_REF___GET_POSSIBLE_ATTRIBUTES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getPossibleAttributes()
	{
		try
		{
			return (EList<Attribute>)GET_POSSIBLE_ATTRIBUTES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VALUES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.DEFAULT_STATE_REF___GET_POSSIBLE_VALUES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Value> getPossibleValues()
	{
		try
		{
			return (EList<Value>)GET_POSSIBLE_VALUES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ATTRIBUTE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.DEFAULT_STATE_REF___IS_ATTRIBUTE_WILDCARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAttributeWildcard()
	{
		try
		{
			return (Boolean)IS_ATTRIBUTE_WILDCARD__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALUE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.DEFAULT_STATE_REF___IS_VALUE_WILDCARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValueWildcard()
	{
		try
		{
			return (Boolean)IS_VALUE_WILDCARD__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
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
			case PrologmodelPackage.DEFAULT_STATE_REF__CONTAINING_ASSIGNMENT:
				if (resolve) return getContainingAssignment();
				return basicGetContainingAssignment();
			case PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE:
				if (resolve) return getStateVariable();
				return basicGetStateVariable();
			case PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case PrologmodelPackage.DEFAULT_STATE_REF__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE:
				setStateVariable((Variable)newValue);
				return;
			case PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case PrologmodelPackage.DEFAULT_STATE_REF__VALUE:
				setValue((Value)newValue);
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
			case PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE:
				setStateVariable((Variable)null);
				return;
			case PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case PrologmodelPackage.DEFAULT_STATE_REF__VALUE:
				setValue((Value)null);
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
			case PrologmodelPackage.DEFAULT_STATE_REF__CONTAINING_ASSIGNMENT:
				return CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PrologmodelPackage.DEFAULT_STATE_REF__STATE_VARIABLE:
				return stateVariable != null;
			case PrologmodelPackage.DEFAULT_STATE_REF__ATTRIBUTE:
				return attribute != null;
			case PrologmodelPackage.DEFAULT_STATE_REF__VALUE:
				return value != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case PrologmodelPackage.DEFAULT_STATE_REF___GET_POSSIBLE_VARIABLES:
				return getPossibleVariables();
			case PrologmodelPackage.DEFAULT_STATE_REF___GET_POSSIBLE_ATTRIBUTES:
				return getPossibleAttributes();
			case PrologmodelPackage.DEFAULT_STATE_REF___GET_POSSIBLE_VALUES:
				return getPossibleValues();
			case PrologmodelPackage.DEFAULT_STATE_REF___IS_ATTRIBUTE_WILDCARD:
				return isAttributeWildcard();
			case PrologmodelPackage.DEFAULT_STATE_REF___IS_VALUE_WILDCARD:
				return isValueWildcard();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //DefaultStateRefImpl
