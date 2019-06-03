/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.False;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrologmodelFactoryImpl extends EFactoryImpl implements PrologmodelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrologmodelFactory init()
	{
		try
		{
			PrologmodelFactory thePrologmodelFactory = (PrologmodelFactory)EPackage.Registry.INSTANCE.getEFactory(PrologmodelPackage.eNS_URI);
			if (thePrologmodelFactory != null)
			{
				return thePrologmodelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrologmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrologmodelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case PrologmodelPackage.SYSTEM: return createSystem();
			case PrologmodelPackage.ATTRIBUTE: return createAttribute();
			case PrologmodelPackage.VALUE: return createValue();
			case PrologmodelPackage.OPERATION: return createOperation();
			case PrologmodelPackage.VARIABLE: return createVariable();
			case PrologmodelPackage.DATA_TYPE: return createDataType();
			case PrologmodelPackage.PROPERTY: return createProperty();
			case PrologmodelPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
			case PrologmodelPackage.OPERATION_CALL: return createOperationCall();
			case PrologmodelPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case PrologmodelPackage.VALUE_SET_TYPE: return createValueSetType();
			case PrologmodelPackage.TRUE: return createTrue();
			case PrologmodelPackage.FALSE: return createFalse();
			case PrologmodelPackage.AND: return createAnd();
			case PrologmodelPackage.OR: return createOr();
			case PrologmodelPackage.NOT: return createNot();
			case PrologmodelPackage.PARAMETER_REF: return createParameterRef();
			case PrologmodelPackage.PROPERTY_REF: return createPropertyRef();
			case PrologmodelPackage.SYSTEM_USAGE: return createSystemUsage();
			case PrologmodelPackage.RETURN_VALUE_REF: return createReturnValueRef();
			case PrologmodelPackage.STATE_REF: return createStateRef();
			case PrologmodelPackage.DEFAULT_STATE_REF: return createDefaultStateRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System createSystem()
	{
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute()
	{
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue()
	{
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable()
	{
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType()
	{
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty()
	{
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyDefinition createPropertyDefinition()
	{
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationCall createOperationCall()
	{
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignment createVariableAssignment()
	{
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetType createValueSetType()
	{
		ValueSetTypeImpl valueSetType = new ValueSetTypeImpl();
		return valueSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public True createTrue()
	{
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public False createFalse()
	{
		FalseImpl false_ = new FalseImpl();
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd()
	{
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr()
	{
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot()
	{
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterRef createParameterRef()
	{
		ParameterRefImpl parameterRef = new ParameterRefImpl();
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyRef createPropertyRef()
	{
		PropertyRefImpl propertyRef = new PropertyRefImpl();
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemUsage createSystemUsage()
	{
		SystemUsageImpl systemUsage = new SystemUsageImpl();
		return systemUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnValueRef createReturnValueRef()
	{
		ReturnValueRefImpl returnValueRef = new ReturnValueRefImpl();
		return returnValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateRef createStateRef()
	{
		StateRefImpl stateRef = new StateRefImpl();
		return stateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultStateRef createDefaultStateRef()
	{
		DefaultStateRefImpl defaultStateRef = new DefaultStateRefImpl();
		return defaultStateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrologmodelPackage getPrologmodelPackage()
	{
		return (PrologmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrologmodelPackage getPackage()
	{
		return PrologmodelPackage.eINSTANCE;
	}

} //PrologmodelFactoryImpl
