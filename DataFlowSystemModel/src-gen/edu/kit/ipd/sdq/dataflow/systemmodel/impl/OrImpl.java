/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.impl;

import edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm;
import edu.kit.ipd.sdq.dataflow.systemmodel.Or;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl#getSecondOperand <em>Second Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrImpl extends LogicTermImpl implements Or {
	/**
	 * The cached value of the '{@link #getFirstOperand() <em>First Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOperand()
	 * @generated
	 * @ordered
	 */
	protected LogicTerm firstOperand;

	/**
	 * The cached value of the '{@link #getSecondOperand() <em>Second Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOperand()
	 * @generated
	 * @ordered
	 */
	protected LogicTerm secondOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemModelPackage.Literals.OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicTerm getFirstOperand() {
		return firstOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstOperand(LogicTerm newFirstOperand, NotificationChain msgs) {
		LogicTerm oldFirstOperand = firstOperand;
		firstOperand = newFirstOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemModelPackage.OR__FIRST_OPERAND, oldFirstOperand, newFirstOperand);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOperand(LogicTerm newFirstOperand) {
		if (newFirstOperand != firstOperand) {
			NotificationChain msgs = null;
			if (firstOperand != null)
				msgs = ((InternalEObject) firstOperand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemModelPackage.OR__FIRST_OPERAND, null, msgs);
			if (newFirstOperand != null)
				msgs = ((InternalEObject) newFirstOperand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SystemModelPackage.OR__FIRST_OPERAND, null, msgs);
			msgs = basicSetFirstOperand(newFirstOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.OR__FIRST_OPERAND, newFirstOperand,
					newFirstOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicTerm getSecondOperand() {
		return secondOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondOperand(LogicTerm newSecondOperand, NotificationChain msgs) {
		LogicTerm oldSecondOperand = secondOperand;
		secondOperand = newSecondOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemModelPackage.OR__SECOND_OPERAND, oldSecondOperand, newSecondOperand);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOperand(LogicTerm newSecondOperand) {
		if (newSecondOperand != secondOperand) {
			NotificationChain msgs = null;
			if (secondOperand != null)
				msgs = ((InternalEObject) secondOperand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemModelPackage.OR__SECOND_OPERAND, null, msgs);
			if (newSecondOperand != null)
				msgs = ((InternalEObject) newSecondOperand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SystemModelPackage.OR__SECOND_OPERAND, null, msgs);
			msgs = basicSetSecondOperand(newSecondOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.OR__SECOND_OPERAND,
					newSecondOperand, newSecondOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemModelPackage.OR__FIRST_OPERAND:
			return basicSetFirstOperand(null, msgs);
		case SystemModelPackage.OR__SECOND_OPERAND:
			return basicSetSecondOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemModelPackage.OR__FIRST_OPERAND:
			return getFirstOperand();
		case SystemModelPackage.OR__SECOND_OPERAND:
			return getSecondOperand();
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
		case SystemModelPackage.OR__FIRST_OPERAND:
			setFirstOperand((LogicTerm) newValue);
			return;
		case SystemModelPackage.OR__SECOND_OPERAND:
			setSecondOperand((LogicTerm) newValue);
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
		case SystemModelPackage.OR__FIRST_OPERAND:
			setFirstOperand((LogicTerm) null);
			return;
		case SystemModelPackage.OR__SECOND_OPERAND:
			setSecondOperand((LogicTerm) null);
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
		case SystemModelPackage.OR__FIRST_OPERAND:
			return firstOperand != null;
		case SystemModelPackage.OR__SECOND_OPERAND:
			return secondOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //OrImpl
