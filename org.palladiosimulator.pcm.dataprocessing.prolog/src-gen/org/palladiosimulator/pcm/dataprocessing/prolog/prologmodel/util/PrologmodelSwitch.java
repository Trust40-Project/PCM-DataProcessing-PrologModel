/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.False;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.True;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage
 * @generated
 */
public class PrologmodelSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrologmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrologmodelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = PrologmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case PrologmodelPackage.SYSTEM:
			{
				org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system = (org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.ATTRIBUTE:
			{
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.VALUE:
			{
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.OPERATION:
			{
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseCaller(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.VARIABLE:
			{
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.DATA_TYPE:
			{
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.PROPERTY:
			{
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.PROPERTY_DEFINITION:
			{
				PropertyDefinition propertyDefinition = (PropertyDefinition)theEObject;
				T result = casePropertyDefinition(propertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.OPERATION_CALL:
			{
				OperationCall operationCall = (OperationCall)theEObject;
				T result = caseOperationCall(operationCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.VARIABLE_ASSIGNMENT:
			{
				VariableAssignment variableAssignment = (VariableAssignment)theEObject;
				T result = caseVariableAssignment(variableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.VALUE_SET_TYPE:
			{
				ValueSetType valueSetType = (ValueSetType)theEObject;
				T result = caseValueSetType(valueSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.LOGIC_TERM:
			{
				LogicTerm logicTerm = (LogicTerm)theEObject;
				T result = caseLogicTerm(logicTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.TRUE:
			{
				True true_ = (True)theEObject;
				T result = caseTrue(true_);
				if (result == null) result = caseLogicTerm(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.FALSE:
			{
				False false_ = (False)theEObject;
				T result = caseFalse(false_);
				if (result == null) result = caseLogicTerm(false_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.AND:
			{
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseLogicTerm(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.OR:
			{
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseLogicTerm(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.NOT:
			{
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseLogicTerm(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.PARAMETER_REF:
			{
				ParameterRef parameterRef = (ParameterRef)theEObject;
				T result = caseParameterRef(parameterRef);
				if (result == null) result = caseLogicTerm(parameterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.PROPERTY_REF:
			{
				PropertyRef propertyRef = (PropertyRef)theEObject;
				T result = casePropertyRef(propertyRef);
				if (result == null) result = caseLogicTerm(propertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.CALLER:
			{
				Caller caller = (Caller)theEObject;
				T result = caseCaller(caller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.SYSTEM_USAGE:
			{
				SystemUsage systemUsage = (SystemUsage)theEObject;
				T result = caseSystemUsage(systemUsage);
				if (result == null) result = caseCaller(systemUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.RETURN_VALUE_REF:
			{
				ReturnValueRef returnValueRef = (ReturnValueRef)theEObject;
				T result = caseReturnValueRef(returnValueRef);
				if (result == null) result = caseLogicTerm(returnValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.STATE_REF:
			{
				StateRef stateRef = (StateRef)theEObject;
				T result = caseStateRef(stateRef);
				if (result == null) result = caseLogicTerm(stateRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrologmodelPackage.DEFAULT_STATE_REF:
			{
				DefaultStateRef defaultStateRef = (DefaultStateRef)theEObject;
				T result = caseDefaultStateRef(defaultStateRef);
				if (result == null) result = caseLogicTerm(defaultStateRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDefinition(PropertyDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCall(OperationCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignment(VariableAssignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetType(ValueSetType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicTerm(LogicTerm object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrue(True object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalse(False object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRef(ParameterRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRef(PropertyRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaller(Caller object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUsage(SystemUsage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnValueRef(ReturnValueRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateRef(StateRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default State Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultStateRef(DefaultStateRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //PrologmodelSwitch
