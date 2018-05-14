/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.impl;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.Property;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage;
import edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl#getSystemusages <em>Systemusages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements edu.kit.ipd.sdq.dataflow.systemmodel.System {
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
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemModelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemModelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					SystemModelPackage.SYSTEM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DataType>(DataType.class, this,
					SystemModelPackage.SYSTEM__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this,
					SystemModelPackage.SYSTEM__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					SystemModelPackage.SYSTEM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ValueSetType>(ValueSetType.class, this,
					SystemModelPackage.SYSTEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUsage> getSystemusages() {
		if (systemusages == null) {
			systemusages = new EObjectContainmentEList<SystemUsage>(SystemUsage.class, this,
					SystemModelPackage.SYSTEM__SYSTEMUSAGES);
		}
		return systemusages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemModelPackage.SYSTEM__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.SYSTEM__DATATYPES:
			return ((InternalEList<?>) getDatatypes()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.SYSTEM__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.SYSTEM__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.SYSTEM__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.SYSTEM__SYSTEMUSAGES:
			return ((InternalEList<?>) getSystemusages()).basicRemove(otherEnd, msgs);
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
		case SystemModelPackage.SYSTEM__NAME:
			return getName();
		case SystemModelPackage.SYSTEM__ATTRIBUTES:
			return getAttributes();
		case SystemModelPackage.SYSTEM__DATATYPES:
			return getDatatypes();
		case SystemModelPackage.SYSTEM__OPERATIONS:
			return getOperations();
		case SystemModelPackage.SYSTEM__PROPERTIES:
			return getProperties();
		case SystemModelPackage.SYSTEM__TYPES:
			return getTypes();
		case SystemModelPackage.SYSTEM__SYSTEMUSAGES:
			return getSystemusages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemModelPackage.SYSTEM__NAME:
			setName((String) newValue);
			return;
		case SystemModelPackage.SYSTEM__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case SystemModelPackage.SYSTEM__DATATYPES:
			getDatatypes().clear();
			getDatatypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case SystemModelPackage.SYSTEM__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends Operation>) newValue);
			return;
		case SystemModelPackage.SYSTEM__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case SystemModelPackage.SYSTEM__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends ValueSetType>) newValue);
			return;
		case SystemModelPackage.SYSTEM__SYSTEMUSAGES:
			getSystemusages().clear();
			getSystemusages().addAll((Collection<? extends SystemUsage>) newValue);
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
		case SystemModelPackage.SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SystemModelPackage.SYSTEM__ATTRIBUTES:
			getAttributes().clear();
			return;
		case SystemModelPackage.SYSTEM__DATATYPES:
			getDatatypes().clear();
			return;
		case SystemModelPackage.SYSTEM__OPERATIONS:
			getOperations().clear();
			return;
		case SystemModelPackage.SYSTEM__PROPERTIES:
			getProperties().clear();
			return;
		case SystemModelPackage.SYSTEM__TYPES:
			getTypes().clear();
			return;
		case SystemModelPackage.SYSTEM__SYSTEMUSAGES:
			getSystemusages().clear();
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
		case SystemModelPackage.SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SystemModelPackage.SYSTEM__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case SystemModelPackage.SYSTEM__DATATYPES:
			return datatypes != null && !datatypes.isEmpty();
		case SystemModelPackage.SYSTEM__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case SystemModelPackage.SYSTEM__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case SystemModelPackage.SYSTEM__TYPES:
			return types != null && !types.isEmpty();
		case SystemModelPackage.SYSTEM__SYSTEMUSAGES:
			return systemusages != null && !systemusages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
