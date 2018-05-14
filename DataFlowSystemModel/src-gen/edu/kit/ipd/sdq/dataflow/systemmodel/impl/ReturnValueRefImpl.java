/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.impl;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Value Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnValueRefImpl extends LogicTermImpl implements ReturnValueRef {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Variable parameter;

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
	protected ReturnValueRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemModelPackage.Literals.RETURN_VALUE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Variable) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemModelPackage.RETURN_VALUE_REF__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Variable newParameter) {
		Variable oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.RETURN_VALUE_REF__PARAMETER,
					oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject) attribute;
			attribute = (Attribute) eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE,
					oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (Value) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemModelPackage.RETURN_VALUE_REF__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.RETURN_VALUE_REF__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall getCall() {
		if (call != null && call.eIsProxy()) {
			InternalEObject oldCall = (InternalEObject) call;
			call = (OperationCall) eResolveProxy(oldCall);
			if (call != oldCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemModelPackage.RETURN_VALUE_REF__CALL,
							oldCall, call));
			}
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall basicGetCall() {
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCall(OperationCall newCall) {
		OperationCall oldCall = call;
		call = newCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.RETURN_VALUE_REF__CALL, oldCall,
					call));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemModelPackage.RETURN_VALUE_REF__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE:
			if (resolve)
				return getAttribute();
			return basicGetAttribute();
		case SystemModelPackage.RETURN_VALUE_REF__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
		case SystemModelPackage.RETURN_VALUE_REF__CALL:
			if (resolve)
				return getCall();
			return basicGetCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemModelPackage.RETURN_VALUE_REF__PARAMETER:
			setParameter((Variable) newValue);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE:
			setAttribute((Attribute) newValue);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__VALUE:
			setValue((Value) newValue);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__CALL:
			setCall((OperationCall) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SystemModelPackage.RETURN_VALUE_REF__PARAMETER:
			setParameter((Variable) null);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE:
			setAttribute((Attribute) null);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__VALUE:
			setValue((Value) null);
			return;
		case SystemModelPackage.RETURN_VALUE_REF__CALL:
			setCall((OperationCall) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SystemModelPackage.RETURN_VALUE_REF__PARAMETER:
			return parameter != null;
		case SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE:
			return attribute != null;
		case SystemModelPackage.RETURN_VALUE_REF__VALUE:
			return value != null;
		case SystemModelPackage.RETURN_VALUE_REF__CALL:
			return call != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnValueRefImpl
