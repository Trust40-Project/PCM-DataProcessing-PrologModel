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
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Value Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnValueRefImpl extends LogicTermImpl implements ReturnValueRef
{
	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Variable returnValue;

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
	 * The cached value of the '{@link #getCall() <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected OperationCall call;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnValueRefImpl()
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
		return PrologmodelPackage.Literals.RETURN_VALUE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReturnValue()
	{
		if (returnValue != null && returnValue.eIsProxy())
		{
			InternalEObject oldReturnValue = (InternalEObject)returnValue;
			returnValue = (Variable)eResolveProxy(oldReturnValue);
			if (returnValue != oldReturnValue)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE, oldReturnValue, returnValue));
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReturnValue()
	{
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(Variable newReturnValue)
	{
		Variable oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute()
	{
		if (attribute != null && attribute.eIsProxy())
		{
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE, oldAttribute, attribute));
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
	public void setAttribute(Attribute newAttribute)
	{
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue()
	{
		if (value != null && value.eIsProxy())
		{
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.RETURN_VALUE_REF__VALUE, oldValue, value));
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
	public void setValue(Value newValue)
	{
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.RETURN_VALUE_REF__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall getCall()
	{
		if (call != null && call.eIsProxy())
		{
			InternalEObject oldCall = (InternalEObject)call;
			call = (OperationCall)eResolveProxy(oldCall);
			if (call != oldCall)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.RETURN_VALUE_REF__CALL, oldCall, call));
			}
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall basicGetCall()
	{
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCall(OperationCall newCall)
	{
		OperationCall oldCall = call;
		call = newCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.RETURN_VALUE_REF__CALL, oldCall, call));
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleCalls() <em>Get Possible Calls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleCalls()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_CALLS__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___GET_POSSIBLE_CALLS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationCall> getPossibleCalls()
	{
		try
		{
			return (EList<OperationCall>)GET_POSSIBLE_CALLS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleReturnValues() <em>Get Possible Return Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleReturnValues()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_RETURN_VALUES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Variable> getPossibleReturnValues()
	{
		try
		{
			return (EList<Variable>)GET_POSSIBLE_RETURN_VALUES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_ATTRIBUTES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___GET_POSSIBLE_ATTRIBUTES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VALUES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___GET_POSSIBLE_VALUES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
	protected static final EOperation.Internal.InvocationDelegate IS_ATTRIBUTE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___IS_ATTRIBUTE_WILDCARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	protected static final EOperation.Internal.InvocationDelegate IS_VALUE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.RETURN_VALUE_REF___IS_VALUE_WILDCARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case PrologmodelPackage.RETURN_VALUE_REF__CONTAINING_ASSIGNMENT:
				if (resolve) return getContainingAssignment();
				return basicGetContainingAssignment();
			case PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE:
				if (resolve) return getReturnValue();
				return basicGetReturnValue();
			case PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case PrologmodelPackage.RETURN_VALUE_REF__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PrologmodelPackage.RETURN_VALUE_REF__CALL:
				if (resolve) return getCall();
				return basicGetCall();
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
			case PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE:
				setReturnValue((Variable)newValue);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__VALUE:
				setValue((Value)newValue);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__CALL:
				setCall((OperationCall)newValue);
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
			case PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE:
				setReturnValue((Variable)null);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__VALUE:
				setValue((Value)null);
				return;
			case PrologmodelPackage.RETURN_VALUE_REF__CALL:
				setCall((OperationCall)null);
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
			case PrologmodelPackage.RETURN_VALUE_REF__CONTAINING_ASSIGNMENT:
				return CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PrologmodelPackage.RETURN_VALUE_REF__RETURN_VALUE:
				return returnValue != null;
			case PrologmodelPackage.RETURN_VALUE_REF__ATTRIBUTE:
				return attribute != null;
			case PrologmodelPackage.RETURN_VALUE_REF__VALUE:
				return value != null;
			case PrologmodelPackage.RETURN_VALUE_REF__CALL:
				return call != null;
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
			case PrologmodelPackage.RETURN_VALUE_REF___GET_POSSIBLE_CALLS:
				return getPossibleCalls();
			case PrologmodelPackage.RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES:
				return getPossibleReturnValues();
			case PrologmodelPackage.RETURN_VALUE_REF___GET_POSSIBLE_ATTRIBUTES:
				return getPossibleAttributes();
			case PrologmodelPackage.RETURN_VALUE_REF___GET_POSSIBLE_VALUES:
				return getPossibleValues();
			case PrologmodelPackage.RETURN_VALUE_REF___IS_ATTRIBUTE_WILDCARD:
				return isAttributeWildcard();
			case PrologmodelPackage.RETURN_VALUE_REF___IS_VALUE_WILDCARD:
				return isValueWildcard();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ReturnValueRefImpl
