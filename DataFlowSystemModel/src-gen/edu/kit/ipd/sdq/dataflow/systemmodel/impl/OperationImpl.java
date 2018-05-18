/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.impl;

import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;
import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl#getReturnValues <em>Return Values</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl#getPropertyDefinitions <em>Property Definitions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl#getReturnValueAssignments <em>Return Value Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends CallerImpl implements Operation {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> parameters;

	/**
	 * The cached value of the '{@link #getReturnValues() <em>Return Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> returnValues;

	/**
	 * The cached value of the '{@link #getPropertyDefinitions() <em>Property Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDefinition> propertyDefinitions;

	/**
	 * The cached value of the '{@link #getReturnValueAssignments() <em>Return Value Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> returnValueAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Variable>(Variable.class, this,
					SystemModelPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReturnValues() {
		if (returnValues == null) {
			returnValues = new EObjectContainmentEList<Variable>(Variable.class, this,
					SystemModelPackage.OPERATION__RETURN_VALUES);
		}
		return returnValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyDefinition> getPropertyDefinitions() {
		if (propertyDefinitions == null) {
			propertyDefinitions = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this,
					SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS);
		}
		return propertyDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAssignment> getReturnValueAssignments() {
		if (returnValueAssignments == null) {
			returnValueAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this,
					SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS);
		}
		return returnValueAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemModelPackage.OPERATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.OPERATION__RETURN_VALUES:
			return ((InternalEList<?>) getReturnValues()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS:
			return ((InternalEList<?>) getPropertyDefinitions()).basicRemove(otherEnd, msgs);
		case SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			return ((InternalEList<?>) getReturnValueAssignments()).basicRemove(otherEnd, msgs);
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
		case SystemModelPackage.OPERATION__PARAMETERS:
			return getParameters();
		case SystemModelPackage.OPERATION__RETURN_VALUES:
			return getReturnValues();
		case SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS:
			return getPropertyDefinitions();
		case SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			return getReturnValueAssignments();
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
		case SystemModelPackage.OPERATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Variable>) newValue);
			return;
		case SystemModelPackage.OPERATION__RETURN_VALUES:
			getReturnValues().clear();
			getReturnValues().addAll((Collection<? extends Variable>) newValue);
			return;
		case SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS:
			getPropertyDefinitions().clear();
			getPropertyDefinitions().addAll((Collection<? extends PropertyDefinition>) newValue);
			return;
		case SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			getReturnValueAssignments().clear();
			getReturnValueAssignments().addAll((Collection<? extends VariableAssignment>) newValue);
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
		case SystemModelPackage.OPERATION__PARAMETERS:
			getParameters().clear();
			return;
		case SystemModelPackage.OPERATION__RETURN_VALUES:
			getReturnValues().clear();
			return;
		case SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS:
			getPropertyDefinitions().clear();
			return;
		case SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			getReturnValueAssignments().clear();
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
		case SystemModelPackage.OPERATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case SystemModelPackage.OPERATION__RETURN_VALUES:
			return returnValues != null && !returnValues.isEmpty();
		case SystemModelPackage.OPERATION__PROPERTY_DEFINITIONS:
			return propertyDefinitions != null && !propertyDefinitions.isEmpty();
		case SystemModelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			return returnValueAssignments != null && !returnValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
