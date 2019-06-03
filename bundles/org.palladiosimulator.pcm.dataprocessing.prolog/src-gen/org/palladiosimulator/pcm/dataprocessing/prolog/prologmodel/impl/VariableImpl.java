/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl()
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
		return PrologmodelPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDatatype()
	{
		if (datatype != null && datatype.eIsProxy())
		{
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrologmodelPackage.VARIABLE__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype()
	{
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(DataType newDatatype)
	{
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE__DATATYPE, oldDatatype, datatype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.VARIABLE__NAME, oldName, name));
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
			case PrologmodelPackage.VARIABLE__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case PrologmodelPackage.VARIABLE__NAME:
				return getName();
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
			case PrologmodelPackage.VARIABLE__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case PrologmodelPackage.VARIABLE__NAME:
				setName((String)newValue);
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
			case PrologmodelPackage.VARIABLE__DATATYPE:
				setDatatype((DataType)null);
				return;
			case PrologmodelPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
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
			case PrologmodelPackage.VARIABLE__DATATYPE:
				return datatype != null;
			case PrologmodelPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //VariableImpl
