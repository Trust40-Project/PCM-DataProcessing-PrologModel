/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.util;

import edu.kit.ipd.sdq.dataflow.systemmodel.And;
import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.Caller;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.False;
import edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm;
import edu.kit.ipd.sdq.dataflow.systemmodel.Not;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.Or;
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.Property;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage;
import edu.kit.ipd.sdq.dataflow.systemmodel.True;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;
import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage
 * @generated
 */
public class SystemModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemModelValidator INSTANCE = new SystemModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.ipd.sdq.dataflow.systemmodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SystemModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SystemModelPackage.SYSTEM:
			return validateSystem((edu.kit.ipd.sdq.dataflow.systemmodel.System) value, diagnostics, context);
		case SystemModelPackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case SystemModelPackage.VALUE:
			return validateValue((Value) value, diagnostics, context);
		case SystemModelPackage.OPERATION:
			return validateOperation((Operation) value, diagnostics, context);
		case SystemModelPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case SystemModelPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case SystemModelPackage.PROPERTY:
			return validateProperty((Property) value, diagnostics, context);
		case SystemModelPackage.PROPERTY_DEFINITION:
			return validatePropertyDefinition((PropertyDefinition) value, diagnostics, context);
		case SystemModelPackage.OPERATION_CALL:
			return validateOperationCall((OperationCall) value, diagnostics, context);
		case SystemModelPackage.VARIABLE_ASSIGNMENT:
			return validateVariableAssignment((VariableAssignment) value, diagnostics, context);
		case SystemModelPackage.VALUE_SET_TYPE:
			return validateValueSetType((ValueSetType) value, diagnostics, context);
		case SystemModelPackage.LOGIC_TERM:
			return validateLogicTerm((LogicTerm) value, diagnostics, context);
		case SystemModelPackage.TRUE:
			return validateTrue((True) value, diagnostics, context);
		case SystemModelPackage.FALSE:
			return validateFalse((False) value, diagnostics, context);
		case SystemModelPackage.AND:
			return validateAnd((And) value, diagnostics, context);
		case SystemModelPackage.OR:
			return validateOr((Or) value, diagnostics, context);
		case SystemModelPackage.NOT:
			return validateNot((Not) value, diagnostics, context);
		case SystemModelPackage.PARAMETER_REF:
			return validateParameterRef((ParameterRef) value, diagnostics, context);
		case SystemModelPackage.PROPERTY_REF:
			return validatePropertyRef((PropertyRef) value, diagnostics, context);
		case SystemModelPackage.CALLER:
			return validateCaller((Caller) value, diagnostics, context);
		case SystemModelPackage.SYSTEM_USAGE:
			return validateSystemUsage((SystemUsage) value, diagnostics, context);
		case SystemModelPackage.RETURN_VALUE_REF:
			return validateReturnValueRef((ReturnValueRef) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(edu.kit.ipd.sdq.dataflow.systemmodel.System system, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_attributeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_datatypeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_propertyNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_valueSetTypeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSystem_operationAndSystemUsageNamesUnique(system, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the attributeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__ATTRIBUTE_NAMES_UNIQUE__EEXPRESSION = "attributes->isUnique(name)";

	/**
	 * Validates the attributeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_attributeNamesUnique(edu.kit.ipd.sdq.dataflow.systemmodel.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.SYSTEM, system, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "attributeNamesUnique",
				SYSTEM__ATTRIBUTE_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the datatypeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__DATATYPE_NAMES_UNIQUE__EEXPRESSION = "datatypes->isUnique(name)";

	/**
	 * Validates the datatypeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_datatypeNamesUnique(edu.kit.ipd.sdq.dataflow.systemmodel.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.SYSTEM, system, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "datatypeNamesUnique",
				SYSTEM__DATATYPE_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the propertyNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__PROPERTY_NAMES_UNIQUE__EEXPRESSION = "properties->isUnique(name)";

	/**
	 * Validates the propertyNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_propertyNamesUnique(edu.kit.ipd.sdq.dataflow.systemmodel.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.SYSTEM, system, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "propertyNamesUnique",
				SYSTEM__PROPERTY_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the valueSetTypeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__VALUE_SET_TYPE_NAMES_UNIQUE__EEXPRESSION = "types->isUnique(name)";

	/**
	 * Validates the valueSetTypeNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_valueSetTypeNamesUnique(edu.kit.ipd.sdq.dataflow.systemmodel.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.SYSTEM, system, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "valueSetTypeNamesUnique",
				SYSTEM__VALUE_SET_TYPE_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the operationAndSystemUsageNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__OPERATION_AND_SYSTEM_USAGE_NAMES_UNIQUE__EEXPRESSION = "operations->union(systemusages)->isUnique(name)";

	/**
	 * Validates the operationAndSystemUsageNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_operationAndSystemUsageNamesUnique(edu.kit.ipd.sdq.dataflow.systemmodel.System system,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.SYSTEM, system, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "operationAndSystemUsageNamesUnique",
				SYSTEM__OPERATION_AND_SYSTEM_USAGE_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperation_parameterNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperation_returnValueNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperation_noDuplicatePropertyDefinitions(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperation_noCyclesInCallGraph(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the parameterNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__PARAMETER_NAMES_UNIQUE__EEXPRESSION = "parameters->isUnique(name)";

	/**
	 * Validates the parameterNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_parameterNamesUnique(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.OPERATION, operation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "parameterNamesUnique",
				OPERATION__PARAMETER_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the returnValueNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__RETURN_VALUE_NAMES_UNIQUE__EEXPRESSION = "returnValues->isUnique(name)";

	/**
	 * Validates the returnValueNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_returnValueNamesUnique(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.OPERATION, operation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "returnValueNamesUnique",
				OPERATION__RETURN_VALUE_NAMES_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the noDuplicatePropertyDefinitions constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__NO_DUPLICATE_PROPERTY_DEFINITIONS__EEXPRESSION = "propertyDefinitions->isUnique(property)";

	/**
	 * Validates the noDuplicatePropertyDefinitions constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_noDuplicatePropertyDefinitions(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.OPERATION, operation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "noDuplicatePropertyDefinitions",
				OPERATION__NO_DUPLICATE_PROPERTY_DEFINITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the noCyclesInCallGraph constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__NO_CYCLES_IN_CALL_GRAPH__EEXPRESSION = " self.calls->closure(call | call.callee.calls).callee->excludes(self)";

	/**
	 * Validates the noCyclesInCallGraph constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_noCyclesInCallGraph(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SystemModelPackage.Literals.OPERATION, operation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "noCyclesInCallGraph",
				OPERATION__NO_CYCLES_IN_CALL_GRAPH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyDefinition(PropertyDefinition propertyDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCall(OperationCall operationCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment(VariableAssignment variableAssignment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetType(ValueSetType valueSetType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicTerm(LogicTerm logicTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrue(True true_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(true_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFalse(False false_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(false_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(not, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRef(ParameterRef parameterRef, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRef(PropertyRef propertyRef, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaller(Caller caller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUsage(SystemUsage systemUsage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef(ReturnValueRef returnValueRef, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnValueRef, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SystemModelValidator
