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

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyRefImpl extends LogicTermImpl implements PropertyRef
{
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyRefImpl()
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
		return PrologmodelPackage.Literals.PROPERTY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation()
	{
		if (operation != null && operation.eIsProxy())
		{
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.PROPERTY_REF__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation()
	{
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation)
	{
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.PROPERTY_REF__OPERATION, oldOperation, operation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.PROPERTY_REF__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.PROPERTY_REF__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty()
	{
		if (property != null && property.eIsProxy())
		{
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.PROPERTY_REF__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty()
	{
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty)
	{
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.PROPERTY_REF__PROPERTY, oldProperty, property));
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleProperties() <em>Get Possible Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleProperties()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_PROPERTIES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.PROPERTY_REF___GET_POSSIBLE_PROPERTIES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getPossibleProperties()
	{
		try
		{
			return (EList<Property>)GET_POSSIBLE_PROPERTIES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VALUES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.PROPERTY_REF___GET_POSSIBLE_VALUES).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALUE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.PROPERTY_REF___IS_VALUE_WILDCARD).getInvocationDelegate();

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
			case PrologmodelPackage.PROPERTY_REF__CONTAINING_ASSIGNMENT:
				if (resolve) return getContainingAssignment();
				return basicGetContainingAssignment();
			case PrologmodelPackage.PROPERTY_REF__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case PrologmodelPackage.PROPERTY_REF__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PrologmodelPackage.PROPERTY_REF__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
			case PrologmodelPackage.PROPERTY_REF__OPERATION:
				setOperation((Operation)newValue);
				return;
			case PrologmodelPackage.PROPERTY_REF__VALUE:
				setValue((Value)newValue);
				return;
			case PrologmodelPackage.PROPERTY_REF__PROPERTY:
				setProperty((Property)newValue);
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
			case PrologmodelPackage.PROPERTY_REF__OPERATION:
				setOperation((Operation)null);
				return;
			case PrologmodelPackage.PROPERTY_REF__VALUE:
				setValue((Value)null);
				return;
			case PrologmodelPackage.PROPERTY_REF__PROPERTY:
				setProperty((Property)null);
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
			case PrologmodelPackage.PROPERTY_REF__CONTAINING_ASSIGNMENT:
				return CONTAINING_ASSIGNMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PrologmodelPackage.PROPERTY_REF__OPERATION:
				return operation != null;
			case PrologmodelPackage.PROPERTY_REF__VALUE:
				return value != null;
			case PrologmodelPackage.PROPERTY_REF__PROPERTY:
				return property != null;
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
			case PrologmodelPackage.PROPERTY_REF___GET_POSSIBLE_PROPERTIES:
				return getPossibleProperties();
			case PrologmodelPackage.PROPERTY_REF___GET_POSSIBLE_VALUES:
				return getPossibleValues();
			case PrologmodelPackage.PROPERTY_REF___IS_VALUE_WILDCARD:
				return isValueWildcard();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //PropertyRefImpl
