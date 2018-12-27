/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAssignmentImpl extends MinimalEObjectImpl.Container implements VariableAssignment
{
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

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
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected LogicTerm term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAssignmentImpl()
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
		return PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable()
	{
		if (variable != null && variable.eIsProxy())
		{
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable()
	{
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable)
	{
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE, oldVariable, variable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicTerm getTerm()
	{
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(LogicTerm newTerm, NotificationChain msgs)
	{
		LogicTerm oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(LogicTerm newTerm)
	{
		if (newTerm != term)
		{
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM, newTerm, newTerm));
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleVariables()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VARIABLES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_ATTRIBUTES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_VALUES__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate IS_ATTRIBUTE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT___IS_ATTRIBUTE_WILDCARD).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate IS_VALUE_WILDCARD__EINVOCATION_DELEGATE = ((EOperation.Internal)PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT___IS_VALUE_WILDCARD).getInvocationDelegate();

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				return basicSetTerm(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				return getTerm();
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
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE:
				setValue((Value)newValue);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				setTerm((LogicTerm)newValue);
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
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE:
				setVariable((Variable)null);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE:
				setValue((Value)null);
				return;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				setTerm((LogicTerm)null);
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
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VARIABLE:
				return variable != null;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__ATTRIBUTE:
				return attribute != null;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__VALUE:
				return value != null;
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				return term != null;
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
			case PrologmodelPackage.VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES:
				return getPossibleVariables();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES:
				return getPossibleAttributes();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES:
				return getPossibleValues();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT___IS_ATTRIBUTE_WILDCARD:
				return isAttributeWildcard();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT___IS_VALUE_WILDCARD:
				return isValueWildcard();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //VariableAssignmentImpl
