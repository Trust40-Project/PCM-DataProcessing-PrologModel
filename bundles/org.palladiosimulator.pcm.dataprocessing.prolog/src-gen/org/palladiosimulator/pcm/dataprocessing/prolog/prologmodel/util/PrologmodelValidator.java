/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage
 * @generated
 */
public class PrologmodelValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PrologmodelValidator INSTANCE = new PrologmodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel";

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
	public PrologmodelValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return PrologmodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID) {
			case PrologmodelPackage.SYSTEM:
				return validateSystem((org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System)value, diagnostics, context);
			case PrologmodelPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case PrologmodelPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case PrologmodelPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case PrologmodelPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case PrologmodelPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case PrologmodelPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case PrologmodelPackage.PROPERTY_DEFINITION:
				return validatePropertyDefinition((PropertyDefinition)value, diagnostics, context);
			case PrologmodelPackage.OPERATION_CALL:
				return validateOperationCall((OperationCall)value, diagnostics, context);
			case PrologmodelPackage.VARIABLE_ASSIGNMENT:
				return validateVariableAssignment((VariableAssignment)value, diagnostics, context);
			case PrologmodelPackage.VALUE_SET_TYPE:
				return validateValueSetType((ValueSetType)value, diagnostics, context);
			case PrologmodelPackage.LOGIC_TERM:
				return validateLogicTerm((LogicTerm)value, diagnostics, context);
			case PrologmodelPackage.TRUE:
				return validateTrue((True)value, diagnostics, context);
			case PrologmodelPackage.FALSE:
				return validateFalse((False)value, diagnostics, context);
			case PrologmodelPackage.AND:
				return validateAnd((And)value, diagnostics, context);
			case PrologmodelPackage.OR:
				return validateOr((Or)value, diagnostics, context);
			case PrologmodelPackage.NOT:
				return validateNot((Not)value, diagnostics, context);
			case PrologmodelPackage.PARAMETER_REF:
				return validateParameterRef((ParameterRef)value, diagnostics, context);
			case PrologmodelPackage.PROPERTY_REF:
				return validatePropertyRef((PropertyRef)value, diagnostics, context);
			case PrologmodelPackage.CALLER:
				return validateCaller((Caller)value, diagnostics, context);
			case PrologmodelPackage.SYSTEM_USAGE:
				return validateSystemUsage((SystemUsage)value, diagnostics, context);
			case PrologmodelPackage.RETURN_VALUE_REF:
				return validateReturnValueRef((ReturnValueRef)value, diagnostics, context);
			case PrologmodelPackage.STATE_REF:
				return validateStateRef((StateRef)value, diagnostics, context);
			case PrologmodelPackage.DEFAULT_STATE_REF:
				return validateDefaultStateRef((DefaultStateRef)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_attributeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_datatypeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_propertyNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_valueSetTypeNamesUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_operationAndSystemUsageNamesUnique(system, diagnostics, context);
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
	public boolean validateSystem_attributeNamesUnique(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "attributeNamesUnique",
				 SYSTEM__ATTRIBUTE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateSystem_datatypeNamesUnique(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "datatypeNamesUnique",
				 SYSTEM__DATATYPE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateSystem_propertyNamesUnique(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "propertyNamesUnique",
				 SYSTEM__PROPERTY_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateSystem_valueSetTypeNamesUnique(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "valueSetTypeNamesUnique",
				 SYSTEM__VALUE_SET_TYPE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the operationAndSystemUsageNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__OPERATION_AND_SYSTEM_USAGE_NAMES_UNIQUE__EEXPRESSION = "operations->selectByKind(Caller)->asBag()->union(systemusages->selectByKind(Caller)->asBag())->isUnique(name)";

	/**
	 * Validates the operationAndSystemUsageNamesUnique constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_operationAndSystemUsageNamesUnique(org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System system, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "operationAndSystemUsageNamesUnique",
				 SYSTEM__OPERATION_AND_SYSTEM_USAGE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCaller_callNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_parameterNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_returnValueNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_stateNamesUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_noDuplicatePropertyDefinitions(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_noCyclesInCallGraph(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_onlyConstantDefaultStateDefinitions(operation, diagnostics, context);
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
	public boolean validateOperation_parameterNamesUnique(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "parameterNamesUnique",
				 OPERATION__PARAMETER_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateOperation_returnValueNamesUnique(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "returnValueNamesUnique",
				 OPERATION__RETURN_VALUE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stateNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__STATE_NAMES_UNIQUE__EEXPRESSION = "stateVariables->isUnique(name)";

	/**
	 * Validates the stateNamesUnique constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_stateNamesUnique(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stateNamesUnique",
				 OPERATION__STATE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateOperation_noDuplicatePropertyDefinitions(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noDuplicatePropertyDefinitions",
				 OPERATION__NO_DUPLICATE_PROPERTY_DEFINITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateOperation_noCyclesInCallGraph(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noCyclesInCallGraph",
				 OPERATION__NO_CYCLES_IN_CALL_GRAPH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyConstantDefaultStateDefinitions constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__ONLY_CONSTANT_DEFAULT_STATE_DEFINITIONS__EEXPRESSION = "defaultStateDefinitions.term.oclAsType(ecore::EObject)->closure(t : ecore::EObject | t.oclAsType(ecore::EObject).eContents()->selectByKind(ecore::EObject))->forAll(\n" +
		"\toclIsKindOf(True) or\n" +
		"\toclIsKindOf(False) or\n" +
		"\toclIsKindOf(And) or\n" +
		"\toclIsKindOf(Or) or\n" +
		"\toclIsKindOf(Not) or\n" +
		"\toclIsKindOf(PropertyRef)\n" +
		")";

	/**
	 * Validates the onlyConstantDefaultStateDefinitions constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_onlyConstantDefaultStateDefinitions(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyConstantDefaultStateDefinitions",
				 OPERATION__ONLY_CONSTANT_DEFAULT_STATE_DEFINITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyDefinition(PropertyDefinition propertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(propertyDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyDefinition_valuesPartOfPropertyType(propertyDefinition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the valuesPartOfPropertyType constraint of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_DEFINITION__VALUES_PART_OF_PROPERTY_TYPE__EEXPRESSION = "getPossibleValues()->includesAll(presentValues)";

	/**
	 * Validates the valuesPartOfPropertyType constraint of '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyDefinition_valuesPartOfPropertyType(PropertyDefinition propertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PROPERTY_DEFINITION,
				 propertyDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "valuesPartOfPropertyType",
				 PROPERTY_DEFINITION__VALUES_PART_OF_PROPERTY_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCall(OperationCall operationCall, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(operationCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(variableAssignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_isVariableValid(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_isAttributeValid(variableAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAssignment_isValueValid(variableAssignment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isVariableValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE_ASSIGNMENT__IS_VARIABLE_VALID__EEXPRESSION = "getPossibleVariables()->includes(variable)";

	/**
	 * Validates the isVariableValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment_isVariableValid(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT,
				 variableAssignment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isVariableValid",
				 VARIABLE_ASSIGNMENT__IS_VARIABLE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAttributeValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE_ASSIGNMENT__IS_ATTRIBUTE_VALID__EEXPRESSION = "getPossibleAttributes()->includes(attribute)";

	/**
	 * Validates the isAttributeValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment_isAttributeValid(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT,
				 variableAssignment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttributeValid",
				 VARIABLE_ASSIGNMENT__IS_ATTRIBUTE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE_ASSIGNMENT__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAssignment_isValueValid(VariableAssignment variableAssignment, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT,
				 variableAssignment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 VARIABLE_ASSIGNMENT__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetType(ValueSetType valueSetType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(valueSetType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSetType, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSetType_valueNamesUnique(valueSetType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the valueNamesUnique constraint of '<em>Value Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_SET_TYPE__VALUE_NAMES_UNIQUE__EEXPRESSION = "values->isUnique(name)";

	/**
	 * Validates the valueNamesUnique constraint of '<em>Value Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetType_valueNamesUnique(ValueSetType valueSetType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.VALUE_SET_TYPE,
				 valueSetType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "valueNamesUnique",
				 VALUE_SET_TYPE__VALUE_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicTerm(LogicTerm logicTerm, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(logicTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrue(True true_, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(true_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFalse(False false_, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(false_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(not, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRef(ParameterRef parameterRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(parameterRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterRef_isParameterValid(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterRef_isAttributeValid(parameterRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterRef_isValueValid(parameterRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isParameterValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_REF__IS_PARAMETER_VALID__EEXPRESSION = "getPossibleParameters()->includes(parameter)";

	/**
	 * Validates the isParameterValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRef_isParameterValid(ParameterRef parameterRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PARAMETER_REF,
				 parameterRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isParameterValid",
				 PARAMETER_REF__IS_PARAMETER_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAttributeValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_REF__IS_ATTRIBUTE_VALID__EEXPRESSION = "getPossibleAttributes()->includes(attribute)";

	/**
	 * Validates the isAttributeValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRef_isAttributeValid(ParameterRef parameterRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PARAMETER_REF,
				 parameterRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttributeValid",
				 PARAMETER_REF__IS_ATTRIBUTE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_REF__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRef_isValueValid(ParameterRef parameterRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PARAMETER_REF,
				 parameterRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 PARAMETER_REF__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRef(PropertyRef propertyRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(propertyRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyRef_isPropertyValid(propertyRef, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyRef_isValueValid(propertyRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isPropertyValid constraint of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_REF__IS_PROPERTY_VALID__EEXPRESSION = "getPossibleProperties()->includes(property)";

	/**
	 * Validates the isPropertyValid constraint of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRef_isPropertyValid(PropertyRef propertyRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PROPERTY_REF,
				 propertyRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isPropertyValid",
				 PROPERTY_REF__IS_PROPERTY_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_REF__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRef_isValueValid(PropertyRef propertyRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.PROPERTY_REF,
				 propertyRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 PROPERTY_REF__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaller(Caller caller, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(caller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caller, diagnostics, context);
		if (result || diagnostics != null) result &= validateCaller_callNamesUnique(caller, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the callNamesUnique constraint of '<em>Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALLER__CALL_NAMES_UNIQUE__EEXPRESSION = "calls->isUnique(name)";

	/**
	 * Validates the callNamesUnique constraint of '<em>Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaller_callNamesUnique(Caller caller, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.CALLER,
				 caller,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "callNamesUnique",
				 CALLER__CALL_NAMES_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUsage(SystemUsage systemUsage, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(systemUsage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validateCaller_callNamesUnique(systemUsage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef(ReturnValueRef returnValueRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(returnValueRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValueRef_isCallValid(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValueRef_isReturnValueValid(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValueRef_isAttributeValid(returnValueRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateReturnValueRef_isValueValid(returnValueRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isCallValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RETURN_VALUE_REF__IS_CALL_VALID__EEXPRESSION = "getPossibleCalls()->includes(call)";

	/**
	 * Validates the isCallValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef_isCallValid(ReturnValueRef returnValueRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.RETURN_VALUE_REF,
				 returnValueRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isCallValid",
				 RETURN_VALUE_REF__IS_CALL_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isReturnValueValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RETURN_VALUE_REF__IS_RETURN_VALUE_VALID__EEXPRESSION = "getPossibleReturnValues()->includes(returnValue)";

	/**
	 * Validates the isReturnValueValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef_isReturnValueValid(ReturnValueRef returnValueRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.RETURN_VALUE_REF,
				 returnValueRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isReturnValueValid",
				 RETURN_VALUE_REF__IS_RETURN_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAttributeValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RETURN_VALUE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION = "getPossibleAttributes()->includes(attribute)";

	/**
	 * Validates the isAttributeValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef_isAttributeValid(ReturnValueRef returnValueRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.RETURN_VALUE_REF,
				 returnValueRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttributeValid",
				 RETURN_VALUE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RETURN_VALUE_REF__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>Return Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnValueRef_isValueValid(ReturnValueRef returnValueRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.RETURN_VALUE_REF,
				 returnValueRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 RETURN_VALUE_REF__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateRef(StateRef stateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(stateRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateRef_isStateVariableValid(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateRef_isAttributeValid(stateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateRef_isValueValid(stateRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isStateVariableValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_REF__IS_STATE_VARIABLE_VALID__EEXPRESSION = "getPossibleVariables()->includes(stateVariable)";

	/**
	 * Validates the isStateVariableValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateRef_isStateVariableValid(StateRef stateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.STATE_REF,
				 stateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isStateVariableValid",
				 STATE_REF__IS_STATE_VARIABLE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAttributeValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION = "getPossibleAttributes()->includes(attribute)";

	/**
	 * Validates the isAttributeValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateRef_isAttributeValid(StateRef stateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.STATE_REF,
				 stateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttributeValid",
				 STATE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_REF__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateRef_isValueValid(StateRef stateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.STATE_REF,
				 stateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 STATE_REF__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStateRef(DefaultStateRef defaultStateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(defaultStateRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefaultStateRef_isStateVariableValid(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefaultStateRef_isAttributeValid(defaultStateRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefaultStateRef_isValueValid(defaultStateRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isStateVariableValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEFAULT_STATE_REF__IS_STATE_VARIABLE_VALID__EEXPRESSION = "getPossibleVariables()->includes(stateVariable)";

	/**
	 * Validates the isStateVariableValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStateRef_isStateVariableValid(DefaultStateRef defaultStateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.DEFAULT_STATE_REF,
				 defaultStateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isStateVariableValid",
				 DEFAULT_STATE_REF__IS_STATE_VARIABLE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isAttributeValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEFAULT_STATE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION = "getPossibleAttributes()->includes(attribute)";

	/**
	 * Validates the isAttributeValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStateRef_isAttributeValid(DefaultStateRef defaultStateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.DEFAULT_STATE_REF,
				 defaultStateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isAttributeValid",
				 DEFAULT_STATE_REF__IS_ATTRIBUTE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isValueValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEFAULT_STATE_REF__IS_VALUE_VALID__EEXPRESSION = "getPossibleValues()->includes(value)";

	/**
	 * Validates the isValueValid constraint of '<em>Default State Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStateRef_isValueValid(DefaultStateRef defaultStateRef, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(PrologmodelPackage.Literals.DEFAULT_STATE_REF,
				 defaultStateRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isValueValid",
				 DEFAULT_STATE_REF__IS_VALUE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PrologmodelValidator
