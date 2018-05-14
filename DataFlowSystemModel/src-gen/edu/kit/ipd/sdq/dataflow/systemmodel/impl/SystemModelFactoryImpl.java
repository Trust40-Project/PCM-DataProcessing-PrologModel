/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.impl;

import edu.kit.ipd.sdq.dataflow.systemmodel.And;
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.False;
import edu.kit.ipd.sdq.dataflow.systemmodel.Not;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.Or;
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.Property;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelFactory;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage;
import edu.kit.ipd.sdq.dataflow.systemmodel.True;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;
import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemModelFactoryImpl extends EFactoryImpl implements SystemModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemModelFactory init() {
		try {
			SystemModelFactory theSystemModelFactory = (SystemModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(SystemModelPackage.eNS_URI);
			if (theSystemModelFactory != null) {
				return theSystemModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SystemModelPackage.SYSTEM:
			return createSystem();
		case SystemModelPackage.ATTRIBUTE:
			return createAttribute();
		case SystemModelPackage.VALUE:
			return createValue();
		case SystemModelPackage.OPERATION:
			return createOperation();
		case SystemModelPackage.VARIABLE:
			return createVariable();
		case SystemModelPackage.DATA_TYPE:
			return createDataType();
		case SystemModelPackage.PROPERTY:
			return createProperty();
		case SystemModelPackage.PROPERTY_DEFINITION:
			return createPropertyDefinition();
		case SystemModelPackage.OPERATION_CALL:
			return createOperationCall();
		case SystemModelPackage.VARIABLE_ASSIGNMENT:
			return createVariableAssignment();
		case SystemModelPackage.VALUE_SET_TYPE:
			return createValueSetType();
		case SystemModelPackage.TRUE:
			return createTrue();
		case SystemModelPackage.FALSE:
			return createFalse();
		case SystemModelPackage.AND:
			return createAnd();
		case SystemModelPackage.OR:
			return createOr();
		case SystemModelPackage.NOT:
			return createNot();
		case SystemModelPackage.PARAMETER_REF:
			return createParameterRef();
		case SystemModelPackage.PROPERTY_REF:
			return createPropertyRef();
		case SystemModelPackage.SYSTEM_USAGE:
			return createSystemUsage();
		case SystemModelPackage.RETURN_VALUE_REF:
			return createReturnValueRef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.dataflow.systemmodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition createPropertyDefinition() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		return propertyDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetType createValueSetType() {
		ValueSetTypeImpl valueSetType = new ValueSetTypeImpl();
		return valueSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public False createFalse() {
		FalseImpl false_ = new FalseImpl();
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRef createParameterRef() {
		ParameterRefImpl parameterRef = new ParameterRefImpl();
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRef createPropertyRef() {
		PropertyRefImpl propertyRef = new PropertyRefImpl();
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUsage createSystemUsage() {
		SystemUsageImpl systemUsage = new SystemUsageImpl();
		return systemUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValueRef createReturnValueRef() {
		ReturnValueRefImpl returnValueRef = new ReturnValueRefImpl();
		return returnValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModelPackage getSystemModelPackage() {
		return (SystemModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemModelPackage getPackage() {
		return SystemModelPackage.eINSTANCE;
	}

} //SystemModelFactoryImpl
