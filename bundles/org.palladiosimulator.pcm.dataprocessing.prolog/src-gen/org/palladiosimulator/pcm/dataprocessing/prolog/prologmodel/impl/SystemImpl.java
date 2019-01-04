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
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl#getSystemusages <em>Systemusages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System
{
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatypes;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetType> types;

	/**
	 * The cached value of the '{@link #getSystemusages() <em>Systemusages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemusages()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUsage> systemusages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl()
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
		return PrologmodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrologmodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes()
	{
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, PrologmodelPackage.SYSTEM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatypes()
	{
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DataType>(DataType.class, this, PrologmodelPackage.SYSTEM__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations()
	{
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, PrologmodelPackage.SYSTEM__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties()
	{
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, PrologmodelPackage.SYSTEM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetType> getTypes()
	{
		if (types == null) {
			types = new EObjectContainmentEList<ValueSetType>(ValueSetType.class, this, PrologmodelPackage.SYSTEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUsage> getSystemusages()
	{
		if (systemusages == null) {
			systemusages = new EObjectContainmentEList<SystemUsage>(SystemUsage.class, this, PrologmodelPackage.SYSTEM__SYSTEMUSAGES);
		}
		return systemusages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case PrologmodelPackage.SYSTEM__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.SYSTEM__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.SYSTEM__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.SYSTEM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.SYSTEM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.SYSTEM__SYSTEMUSAGES:
				return ((InternalEList<?>)getSystemusages()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case PrologmodelPackage.SYSTEM__NAME:
				return getName();
			case PrologmodelPackage.SYSTEM__ATTRIBUTES:
				return getAttributes();
			case PrologmodelPackage.SYSTEM__DATATYPES:
				return getDatatypes();
			case PrologmodelPackage.SYSTEM__OPERATIONS:
				return getOperations();
			case PrologmodelPackage.SYSTEM__PROPERTIES:
				return getProperties();
			case PrologmodelPackage.SYSTEM__TYPES:
				return getTypes();
			case PrologmodelPackage.SYSTEM__SYSTEMUSAGES:
				return getSystemusages();
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
		switch (featureID) {
			case PrologmodelPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case PrologmodelPackage.SYSTEM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PrologmodelPackage.SYSTEM__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case PrologmodelPackage.SYSTEM__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case PrologmodelPackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case PrologmodelPackage.SYSTEM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ValueSetType>)newValue);
				return;
			case PrologmodelPackage.SYSTEM__SYSTEMUSAGES:
				getSystemusages().clear();
				getSystemusages().addAll((Collection<? extends SystemUsage>)newValue);
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
		switch (featureID) {
			case PrologmodelPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PrologmodelPackage.SYSTEM__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PrologmodelPackage.SYSTEM__DATATYPES:
				getDatatypes().clear();
				return;
			case PrologmodelPackage.SYSTEM__OPERATIONS:
				getOperations().clear();
				return;
			case PrologmodelPackage.SYSTEM__PROPERTIES:
				getProperties().clear();
				return;
			case PrologmodelPackage.SYSTEM__TYPES:
				getTypes().clear();
				return;
			case PrologmodelPackage.SYSTEM__SYSTEMUSAGES:
				getSystemusages().clear();
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
		switch (featureID) {
			case PrologmodelPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PrologmodelPackage.SYSTEM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PrologmodelPackage.SYSTEM__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case PrologmodelPackage.SYSTEM__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case PrologmodelPackage.SYSTEM__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case PrologmodelPackage.SYSTEM__TYPES:
				return types != null && !types.isEmpty();
			case PrologmodelPackage.SYSTEM__SYSTEMUSAGES:
				return systemusages != null && !systemusages.isEmpty();
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

} //SystemImpl
