/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getReturnValues <em>Return Values</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getPropertyDefinitions <em>Property Definitions</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getReturnValueAssignments <em>Return Value Assignments</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getDefaultStateDefinitions <em>Default State Definitions</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl#getPostExecutionStateDefinitions <em>Post Execution State Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends CallerImpl implements Operation
{
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
	 * The cached value of the '{@link #getStateVariables() <em>State Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> stateVariables;

	/**
	 * The cached value of the '{@link #getDefaultStateDefinitions() <em>Default State Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStateDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> defaultStateDefinitions;

	/**
	 * The cached value of the '{@link #getPostExecutionStateDefinitions() <em>Post Execution State Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionStateDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> postExecutionStateDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl()
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
		return PrologmodelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getParameters()
	{
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Variable>(Variable.class, this, PrologmodelPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReturnValues()
	{
		if (returnValues == null) {
			returnValues = new EObjectContainmentEList<Variable>(Variable.class, this, PrologmodelPackage.OPERATION__RETURN_VALUES);
		}
		return returnValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyDefinition> getPropertyDefinitions()
	{
		if (propertyDefinitions == null) {
			propertyDefinitions = new EObjectContainmentEList<PropertyDefinition>(PropertyDefinition.class, this, PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS);
		}
		return propertyDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAssignment> getReturnValueAssignments()
	{
		if (returnValueAssignments == null) {
			returnValueAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS);
		}
		return returnValueAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getStateVariables()
	{
		if (stateVariables == null) {
			stateVariables = new EObjectContainmentEList<Variable>(Variable.class, this, PrologmodelPackage.OPERATION__STATE_VARIABLES);
		}
		return stateVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAssignment> getDefaultStateDefinitions()
	{
		if (defaultStateDefinitions == null) {
			defaultStateDefinitions = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS);
		}
		return defaultStateDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAssignment> getPostExecutionStateDefinitions()
	{
		if (postExecutionStateDefinitions == null) {
			postExecutionStateDefinitions = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS);
		}
		return postExecutionStateDefinitions;
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
			case PrologmodelPackage.OPERATION__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
				return ((InternalEList<?>)getReturnValues()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
				return ((InternalEList<?>)getPropertyDefinitions()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getReturnValueAssignments()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
				return ((InternalEList<?>)getStateVariables()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
				return ((InternalEList<?>)getDefaultStateDefinitions()).basicRemove(otherEnd, msgs);
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
				return ((InternalEList<?>)getPostExecutionStateDefinitions()).basicRemove(otherEnd, msgs);
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
			case PrologmodelPackage.OPERATION__CALLS:
				return getCalls();
			case PrologmodelPackage.OPERATION__NAME:
				return getName();
			case PrologmodelPackage.OPERATION__PARAMETERS:
				return getParameters();
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
				return getReturnValues();
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
				return getPropertyDefinitions();
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
				return getReturnValueAssignments();
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
				return getStateVariables();
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
				return getDefaultStateDefinitions();
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
				return getPostExecutionStateDefinitions();
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
			case PrologmodelPackage.OPERATION__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case PrologmodelPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case PrologmodelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Variable>)newValue);
				return;
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
				getReturnValues().clear();
				getReturnValues().addAll((Collection<? extends Variable>)newValue);
				return;
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
				getPropertyDefinitions().clear();
				getPropertyDefinitions().addAll((Collection<? extends PropertyDefinition>)newValue);
				return;
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
				getReturnValueAssignments().clear();
				getReturnValueAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
				return;
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
				getStateVariables().clear();
				getStateVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
				getDefaultStateDefinitions().clear();
				getDefaultStateDefinitions().addAll((Collection<? extends VariableAssignment>)newValue);
				return;
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
				getPostExecutionStateDefinitions().clear();
				getPostExecutionStateDefinitions().addAll((Collection<? extends VariableAssignment>)newValue);
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
			case PrologmodelPackage.OPERATION__CALLS:
				getCalls().clear();
				return;
			case PrologmodelPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PrologmodelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
				getReturnValues().clear();
				return;
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
				getPropertyDefinitions().clear();
				return;
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
				getReturnValueAssignments().clear();
				return;
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
				getStateVariables().clear();
				return;
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
				getDefaultStateDefinitions().clear();
				return;
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
				getPostExecutionStateDefinitions().clear();
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
			case PrologmodelPackage.OPERATION__CALLS:
				return calls != null && !calls.isEmpty();
			case PrologmodelPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PrologmodelPackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
				return returnValues != null && !returnValues.isEmpty();
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
				return propertyDefinitions != null && !propertyDefinitions.isEmpty();
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
				return returnValueAssignments != null && !returnValueAssignments.isEmpty();
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
				return stateVariables != null && !stateVariables.isEmpty();
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
				return defaultStateDefinitions != null && !defaultStateDefinitions.isEmpty();
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
				return postExecutionStateDefinitions != null && !postExecutionStateDefinitions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //OperationImpl
