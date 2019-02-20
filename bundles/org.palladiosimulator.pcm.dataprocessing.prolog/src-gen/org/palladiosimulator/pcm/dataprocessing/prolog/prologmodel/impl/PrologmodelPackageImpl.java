/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.util.PrologmodelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrologmodelPackageImpl extends EPackageImpl implements PrologmodelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultStateRefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrologmodelPackageImpl()
	{
		super(eNS_URI, PrologmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PrologmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrologmodelPackage init()
	{
		if (isInited) return (PrologmodelPackage)EPackage.Registry.INSTANCE.getEPackage(PrologmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrologmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrologmodelPackageImpl thePrologmodelPackage = registeredPrologmodelPackage instanceof PrologmodelPackageImpl ? (PrologmodelPackageImpl)registeredPrologmodelPackage : new PrologmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePrologmodelPackage.createPackageContents();

		// Initialize created meta-data
		thePrologmodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePrologmodelPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PrologmodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePrologmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrologmodelPackage.eNS_URI, thePrologmodelPackage);
		return thePrologmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem()
	{
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name()
	{
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Attributes()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Datatypes()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Operations()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Properties()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Types()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Systemusages()
	{
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute()
	{
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type()
	{
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name()
	{
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue()
	{
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Name()
	{
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_ContainingType()
	{
		return (EReference)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation()
	{
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnValues()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_PropertyDefinitions()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnValueAssignments()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_StateVariables()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_DefaultStateDefinitions()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_PostExecutionStateDefinitions()
	{
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable()
	{
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Datatype()
	{
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name()
	{
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType()
	{
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Attributes()
	{
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Name()
	{
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty()
	{
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type()
	{
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name()
	{
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyDefinition()
	{
		return propertyDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyDefinition_Property()
	{
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyDefinition_PresentValues()
	{
		return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyDefinition__GetPossibleValues()
	{
		return propertyDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCall()
	{
		return operationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Callee()
	{
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_ParameterAssignments()
	{
		return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Caller()
	{
		return (EReference)operationCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationCall_Name()
	{
		return (EAttribute)operationCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_PreCallStateDefinitions()
	{
		return (EReference)operationCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment()
	{
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Variable()
	{
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Attribute()
	{
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Value()
	{
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Term()
	{
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAssignment__GetPossibleVariables()
	{
		return variableAssignmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAssignment__GetPossibleAttributes()
	{
		return variableAssignmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAssignment__GetPossibleValues()
	{
		return variableAssignmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAssignment__IsAttributeWildcard()
	{
		return variableAssignmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAssignment__IsValueWildcard()
	{
		return variableAssignmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetType()
	{
		return valueSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetType_Values()
	{
		return (EReference)valueSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetType_Name()
	{
		return (EAttribute)valueSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicTerm()
	{
		return logicTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicTerm_ContainingAssignment()
	{
		return (EReference)logicTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue()
	{
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalse()
	{
		return falseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd()
	{
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Operands()
	{
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr()
	{
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Operands()
	{
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot()
	{
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Operand()
	{
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRef()
	{
		return parameterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterRef_Parameter()
	{
		return (EReference)parameterRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterRef_Attribute()
	{
		return (EReference)parameterRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterRef_Value()
	{
		return (EReference)parameterRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterRef__GetPossibleParameters()
	{
		return parameterRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterRef__GetPossibleAttributes()
	{
		return parameterRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterRef__GetPossibleValues()
	{
		return parameterRefEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterRef__IsAttributeWildcard()
	{
		return parameterRefEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterRef__IsValueWildcard()
	{
		return parameterRefEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRef()
	{
		return propertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRef_Operation()
	{
		return (EReference)propertyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRef_Value()
	{
		return (EReference)propertyRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyRef_Property()
	{
		return (EReference)propertyRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyRef__GetPossibleProperties()
	{
		return propertyRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyRef__GetPossibleValues()
	{
		return propertyRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyRef__IsValueWildcard()
	{
		return propertyRefEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaller()
	{
		return callerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaller_Calls()
	{
		return (EReference)callerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaller_Name()
	{
		return (EAttribute)callerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUsage()
	{
		return systemUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValueRef()
	{
		return returnValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnValueRef_ReturnValue()
	{
		return (EReference)returnValueRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnValueRef_Attribute()
	{
		return (EReference)returnValueRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnValueRef_Value()
	{
		return (EReference)returnValueRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnValueRef_Call()
	{
		return (EReference)returnValueRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__GetPossibleCalls()
	{
		return returnValueRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__GetPossibleReturnValues()
	{
		return returnValueRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__GetPossibleAttributes()
	{
		return returnValueRefEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__GetPossibleValues()
	{
		return returnValueRefEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__IsAttributeWildcard()
	{
		return returnValueRefEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnValueRef__IsValueWildcard()
	{
		return returnValueRefEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateRef()
	{
		return stateRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateRef_StateVariable()
	{
		return (EReference)stateRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateRef_Attribute()
	{
		return (EReference)stateRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateRef_Value()
	{
		return (EReference)stateRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateRef__GetPossibleVariables()
	{
		return stateRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateRef__GetPossibleAttributes()
	{
		return stateRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateRef__GetPossibleValues()
	{
		return stateRefEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateRef__IsAttributeWildcard()
	{
		return stateRefEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateRef__IsValueWildcard()
	{
		return stateRefEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultStateRef()
	{
		return defaultStateRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultStateRef_StateVariable()
	{
		return (EReference)defaultStateRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultStateRef_Attribute()
	{
		return (EReference)defaultStateRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultStateRef_Value()
	{
		return (EReference)defaultStateRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultStateRef__GetPossibleVariables()
	{
		return defaultStateRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultStateRef__GetPossibleAttributes()
	{
		return defaultStateRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultStateRef__GetPossibleValues()
	{
		return defaultStateRefEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultStateRef__IsAttributeWildcard()
	{
		return defaultStateRefEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultStateRef__IsValueWildcard()
	{
		return defaultStateRefEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrologmodelFactory getPrologmodelFactory()
	{
		return (PrologmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__ATTRIBUTES);
		createEReference(systemEClass, SYSTEM__DATATYPES);
		createEReference(systemEClass, SYSTEM__OPERATIONS);
		createEReference(systemEClass, SYSTEM__PROPERTIES);
		createEReference(systemEClass, SYSTEM__TYPES);
		createEReference(systemEClass, SYSTEM__SYSTEMUSAGES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__NAME);
		createEReference(valueEClass, VALUE__CONTAINING_TYPE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEReference(operationEClass, OPERATION__RETURN_VALUES);
		createEReference(operationEClass, OPERATION__PROPERTY_DEFINITIONS);
		createEReference(operationEClass, OPERATION__RETURN_VALUE_ASSIGNMENTS);
		createEReference(operationEClass, OPERATION__STATE_VARIABLES);
		createEReference(operationEClass, OPERATION__DEFAULT_STATE_DEFINITIONS);
		createEReference(operationEClass, OPERATION__POST_EXECUTION_STATE_DEFINITIONS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__DATATYPE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__ATTRIBUTES);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__NAME);

		propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__PROPERTY);
		createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__PRESENT_VALUES);
		createEOperation(propertyDefinitionEClass, PROPERTY_DEFINITION___GET_POSSIBLE_VALUES);

		operationCallEClass = createEClass(OPERATION_CALL);
		createEReference(operationCallEClass, OPERATION_CALL__CALLEE);
		createEReference(operationCallEClass, OPERATION_CALL__PARAMETER_ASSIGNMENTS);
		createEReference(operationCallEClass, OPERATION_CALL__CALLER);
		createEAttribute(operationCallEClass, OPERATION_CALL__NAME);
		createEReference(operationCallEClass, OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__ATTRIBUTE);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VALUE);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__TERM);
		createEOperation(variableAssignmentEClass, VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES);
		createEOperation(variableAssignmentEClass, VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES);
		createEOperation(variableAssignmentEClass, VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES);
		createEOperation(variableAssignmentEClass, VARIABLE_ASSIGNMENT___IS_ATTRIBUTE_WILDCARD);
		createEOperation(variableAssignmentEClass, VARIABLE_ASSIGNMENT___IS_VALUE_WILDCARD);

		valueSetTypeEClass = createEClass(VALUE_SET_TYPE);
		createEReference(valueSetTypeEClass, VALUE_SET_TYPE__VALUES);
		createEAttribute(valueSetTypeEClass, VALUE_SET_TYPE__NAME);

		logicTermEClass = createEClass(LOGIC_TERM);
		createEReference(logicTermEClass, LOGIC_TERM__CONTAINING_ASSIGNMENT);

		trueEClass = createEClass(TRUE);

		falseEClass = createEClass(FALSE);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OPERANDS);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OPERANDS);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__OPERAND);

		parameterRefEClass = createEClass(PARAMETER_REF);
		createEReference(parameterRefEClass, PARAMETER_REF__PARAMETER);
		createEReference(parameterRefEClass, PARAMETER_REF__ATTRIBUTE);
		createEReference(parameterRefEClass, PARAMETER_REF__VALUE);
		createEOperation(parameterRefEClass, PARAMETER_REF___GET_POSSIBLE_PARAMETERS);
		createEOperation(parameterRefEClass, PARAMETER_REF___GET_POSSIBLE_ATTRIBUTES);
		createEOperation(parameterRefEClass, PARAMETER_REF___GET_POSSIBLE_VALUES);
		createEOperation(parameterRefEClass, PARAMETER_REF___IS_ATTRIBUTE_WILDCARD);
		createEOperation(parameterRefEClass, PARAMETER_REF___IS_VALUE_WILDCARD);

		propertyRefEClass = createEClass(PROPERTY_REF);
		createEReference(propertyRefEClass, PROPERTY_REF__OPERATION);
		createEReference(propertyRefEClass, PROPERTY_REF__VALUE);
		createEReference(propertyRefEClass, PROPERTY_REF__PROPERTY);
		createEOperation(propertyRefEClass, PROPERTY_REF___GET_POSSIBLE_PROPERTIES);
		createEOperation(propertyRefEClass, PROPERTY_REF___GET_POSSIBLE_VALUES);
		createEOperation(propertyRefEClass, PROPERTY_REF___IS_VALUE_WILDCARD);

		callerEClass = createEClass(CALLER);
		createEReference(callerEClass, CALLER__CALLS);
		createEAttribute(callerEClass, CALLER__NAME);

		systemUsageEClass = createEClass(SYSTEM_USAGE);

		returnValueRefEClass = createEClass(RETURN_VALUE_REF);
		createEReference(returnValueRefEClass, RETURN_VALUE_REF__RETURN_VALUE);
		createEReference(returnValueRefEClass, RETURN_VALUE_REF__ATTRIBUTE);
		createEReference(returnValueRefEClass, RETURN_VALUE_REF__VALUE);
		createEReference(returnValueRefEClass, RETURN_VALUE_REF__CALL);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___GET_POSSIBLE_CALLS);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___GET_POSSIBLE_ATTRIBUTES);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___GET_POSSIBLE_VALUES);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___IS_ATTRIBUTE_WILDCARD);
		createEOperation(returnValueRefEClass, RETURN_VALUE_REF___IS_VALUE_WILDCARD);

		stateRefEClass = createEClass(STATE_REF);
		createEReference(stateRefEClass, STATE_REF__STATE_VARIABLE);
		createEReference(stateRefEClass, STATE_REF__ATTRIBUTE);
		createEReference(stateRefEClass, STATE_REF__VALUE);
		createEOperation(stateRefEClass, STATE_REF___GET_POSSIBLE_VARIABLES);
		createEOperation(stateRefEClass, STATE_REF___GET_POSSIBLE_ATTRIBUTES);
		createEOperation(stateRefEClass, STATE_REF___GET_POSSIBLE_VALUES);
		createEOperation(stateRefEClass, STATE_REF___IS_ATTRIBUTE_WILDCARD);
		createEOperation(stateRefEClass, STATE_REF___IS_VALUE_WILDCARD);

		defaultStateRefEClass = createEClass(DEFAULT_STATE_REF);
		createEReference(defaultStateRefEClass, DEFAULT_STATE_REF__STATE_VARIABLE);
		createEReference(defaultStateRefEClass, DEFAULT_STATE_REF__ATTRIBUTE);
		createEReference(defaultStateRefEClass, DEFAULT_STATE_REF__VALUE);
		createEOperation(defaultStateRefEClass, DEFAULT_STATE_REF___GET_POSSIBLE_VARIABLES);
		createEOperation(defaultStateRefEClass, DEFAULT_STATE_REF___GET_POSSIBLE_ATTRIBUTES);
		createEOperation(defaultStateRefEClass, DEFAULT_STATE_REF___GET_POSSIBLE_VALUES);
		createEOperation(defaultStateRefEClass, DEFAULT_STATE_REF___IS_ATTRIBUTE_WILDCARD);
		createEOperation(defaultStateRefEClass, DEFAULT_STATE_REF___IS_VALUE_WILDCARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getCaller());
		trueEClass.getESuperTypes().add(this.getLogicTerm());
		falseEClass.getESuperTypes().add(this.getLogicTerm());
		andEClass.getESuperTypes().add(this.getLogicTerm());
		orEClass.getESuperTypes().add(this.getLogicTerm());
		notEClass.getESuperTypes().add(this.getLogicTerm());
		parameterRefEClass.getESuperTypes().add(this.getLogicTerm());
		propertyRefEClass.getESuperTypes().add(this.getLogicTerm());
		systemUsageEClass.getESuperTypes().add(this.getCaller());
		returnValueRefEClass.getESuperTypes().add(this.getLogicTerm());
		stateRefEClass.getESuperTypes().add(this.getLogicTerm());
		defaultStateRefEClass.getESuperTypes().add(this.getLogicTerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Datatypes(), this.getDataType(), null, "datatypes", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Operations(), this.getOperation(), null, "operations", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Properties(), this.getProperty(), null, "properties", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Types(), this.getValueSetType(), null, "types", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Systemusages(), this.getSystemUsage(), null, "systemusages", null, 0, -1, org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Type(), this.getValueSetType(), null, "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_ContainingType(), this.getValueSetType(), this.getValueSetType_Values(), "containingType", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Parameters(), this.getVariable(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnValues(), this.getVariable(), null, "returnValues", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_PropertyDefinitions(), this.getPropertyDefinition(), null, "propertyDefinitions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnValueAssignments(), this.getVariableAssignment(), null, "returnValueAssignments", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_StateVariables(), this.getVariable(), null, "stateVariables", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_DefaultStateDefinitions(), this.getVariableAssignment(), null, "defaultStateDefinitions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_PostExecutionStateDefinitions(), this.getVariableAssignment(), null, "postExecutionStateDefinitions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Datatype(), this.getDataType(), null, "datatype", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Type(), this.getValueSetType(), null, "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDefinition_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyDefinition_PresentValues(), this.getValue(), null, "presentValues", null, 0, -1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPropertyDefinition__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCall_Callee(), this.getOperation(), null, "callee", null, 1, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_ParameterAssignments(), this.getVariableAssignment(), null, "parameterAssignments", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_Caller(), this.getCaller(), this.getCaller_Calls(), "caller", null, 1, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_PreCallStateDefinitions(), this.getVariableAssignment(), null, "preCallStateDefinitions", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Value(), this.getValue(), null, "value", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Term(), this.getLogicTerm(), null, "term", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVariableAssignment__GetPossibleVariables(), this.getVariable(), "getPossibleVariables", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVariableAssignment__GetPossibleAttributes(), this.getAttribute(), "getPossibleAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVariableAssignment__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVariableAssignment__IsAttributeWildcard(), ecorePackage.getEBoolean(), "isAttributeWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVariableAssignment__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueSetTypeEClass, ValueSetType.class, "ValueSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetType_Values(), this.getValue(), this.getValue_ContainingType(), "values", null, 0, -1, ValueSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSetType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicTermEClass, LogicTerm.class, "LogicTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicTerm_ContainingAssignment(), this.getVariableAssignment(), null, "containingAssignment", null, 0, 1, LogicTerm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Operands(), this.getLogicTerm(), null, "operands", null, 2, 2, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Operands(), this.getLogicTerm(), null, "operands", null, 2, 2, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Operand(), this.getLogicTerm(), null, "operand", null, 1, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterRef_Parameter(), this.getVariable(), null, "parameter", null, 1, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterRef_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterRef_Value(), this.getValue(), null, "value", null, 0, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterRef__GetPossibleParameters(), this.getVariable(), "getPossibleParameters", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getParameterRef__GetPossibleAttributes(), this.getAttribute(), "getPossibleAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getParameterRef__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getParameterRef__IsAttributeWildcard(), ecorePackage.getEBoolean(), "isAttributeWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterRef__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyRefEClass, PropertyRef.class, "PropertyRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyRef_Operation(), this.getOperation(), null, "operation", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRef_Value(), this.getValue(), null, "value", null, 0, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRef_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPropertyRef__GetPossibleProperties(), this.getProperty(), "getPossibleProperties", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPropertyRef__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPropertyRef__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callerEClass, Caller.class, "Caller", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaller_Calls(), this.getOperationCall(), this.getOperationCall_Caller(), "calls", null, 0, -1, Caller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaller_Name(), ecorePackage.getEString(), "name", null, 0, 1, Caller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUsageEClass, SystemUsage.class, "SystemUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnValueRefEClass, ReturnValueRef.class, "ReturnValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnValueRef_ReturnValue(), this.getVariable(), null, "returnValue", null, 1, 1, ReturnValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnValueRef_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, ReturnValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnValueRef_Value(), this.getValue(), null, "value", null, 0, 1, ReturnValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnValueRef_Call(), this.getOperationCall(), null, "call", null, 1, 1, ReturnValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReturnValueRef__GetPossibleCalls(), this.getOperationCall(), "getPossibleCalls", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReturnValueRef__GetPossibleReturnValues(), this.getVariable(), "getPossibleReturnValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReturnValueRef__GetPossibleAttributes(), this.getAttribute(), "getPossibleAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReturnValueRef__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReturnValueRef__IsAttributeWildcard(), ecorePackage.getEBoolean(), "isAttributeWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReturnValueRef__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateRefEClass, StateRef.class, "StateRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateRef_StateVariable(), this.getVariable(), null, "stateVariable", null, 1, 1, StateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateRef_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, StateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateRef_Value(), this.getValue(), null, "value", null, 0, 1, StateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStateRef__GetPossibleVariables(), this.getVariable(), "getPossibleVariables", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStateRef__GetPossibleAttributes(), this.getAttribute(), "getPossibleAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStateRef__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStateRef__IsAttributeWildcard(), ecorePackage.getEBoolean(), "isAttributeWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStateRef__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultStateRefEClass, DefaultStateRef.class, "DefaultStateRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultStateRef_StateVariable(), this.getVariable(), null, "stateVariable", null, 1, 1, DefaultStateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultStateRef_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, DefaultStateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultStateRef_Value(), this.getValue(), null, "value", null, 0, 1, DefaultStateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDefaultStateRef__GetPossibleVariables(), this.getVariable(), "getPossibleVariables", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDefaultStateRef__GetPossibleAttributes(), this.getAttribute(), "getPossibleAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDefaultStateRef__GetPossibleValues(), this.getValue(), "getPossibleValues", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDefaultStateRef__IsAttributeWildcard(), ecorePackage.getEBoolean(), "isAttributeWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDefaultStateRef__IsValueWildcard(), ecorePackage.getEBoolean(), "isValueWildcard", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "constraints", "attributeNamesUnique datatypeNamesUnique propertyNamesUnique valueSetTypeNamesUnique operationAndSystemUsageNamesUnique"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "constraints", "parameterNamesUnique returnValueNamesUnique stateNamesUnique noDuplicatePropertyDefinitions noCyclesInCallGraph onlyConstantDefaultStateDefinitions"
		   });
		addAnnotation
		  (propertyDefinitionEClass,
		   source,
		   new String[] {
			   "constraints", "valuesPartOfPropertyType"
		   });
		addAnnotation
		  (variableAssignmentEClass,
		   source,
		   new String[] {
			   "constraints", "isVariableValid isAttributeValid isValueValid"
		   });
		addAnnotation
		  (valueSetTypeEClass,
		   source,
		   new String[] {
			   "constraints", "valueNamesUnique"
		   });
		addAnnotation
		  (parameterRefEClass,
		   source,
		   new String[] {
			   "constraints", "isParameterValid isAttributeValid isValueValid"
		   });
		addAnnotation
		  (propertyRefEClass,
		   source,
		   new String[] {
			   "constraints", "isPropertyValid isValueValid"
		   });
		addAnnotation
		  (callerEClass,
		   source,
		   new String[] {
			   "constraints", "callNamesUnique"
		   });
		addAnnotation
		  (returnValueRefEClass,
		   source,
		   new String[] {
			   "constraints", "isCallValid isReturnValueValid isAttributeValid isValueValid"
		   });
		addAnnotation
		  (stateRefEClass,
		   source,
		   new String[] {
			   "constraints", "isStateVariableValid isAttributeValid isValueValid"
		   });
		addAnnotation
		  (defaultStateRefEClass,
		   source,
		   new String[] {
			   "constraints", "isStateVariableValid isAttributeValid isValueValid"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "attributeNamesUnique", "attributes->isUnique(name)",
			   "datatypeNamesUnique", "datatypes->isUnique(name)",
			   "propertyNamesUnique", "properties->isUnique(name)",
			   "valueSetTypeNamesUnique", "types->isUnique(name)",
			   "operationAndSystemUsageNamesUnique", "operations->selectByKind(Caller)->asBag()->union(systemusages->selectByKind(Caller)->asBag())->isUnique(name)"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "parameterNamesUnique", "parameters->isUnique(name)",
			   "returnValueNamesUnique", "returnValues->isUnique(name)",
			   "stateNamesUnique", "stateVariables->isUnique(name)",
			   "noDuplicatePropertyDefinitions", "propertyDefinitions->isUnique(property)",
			   "noCyclesInCallGraph", " self.calls->closure(call | call.callee.calls).callee->excludes(self)",
			   "onlyConstantDefaultStateDefinitions", "defaultStateDefinitions.term.oclAsType(ecore::EObject)->closure(t : ecore::EObject | t.oclAsType(ecore::EObject).eContents()->selectByKind(ecore::EObject))->forAll(\n\toclIsKindOf(True) or\n\toclIsKindOf(False) or\n\toclIsKindOf(And) or\n\toclIsKindOf(Or) or\n\toclIsKindOf(Not) or\n\toclIsKindOf(PropertyRef)\n)"
		   });
		addAnnotation
		  (propertyDefinitionEClass,
		   source,
		   new String[] {
			   "valuesPartOfPropertyType", "getPossibleValues()->includesAll(presentValues)"
		   });
		addAnnotation
		  (getPropertyDefinition__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif property.oclIsUndefined() then\n\t\t\t\t\tProperty.allInstances().type.values->asSet()\n\t\t\t\telse\n\t\t\t\t\tproperty.type.values->asSet()\n\t\t\t\tendif"
		   });
		addAnnotation
		  (variableAssignmentEClass,
		   source,
		   new String[] {
			   "isVariableValid", "getPossibleVariables()->includes(variable)",
			   "isAttributeValid", "getPossibleAttributes()->includes(attribute)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getVariableAssignment__GetPossibleVariables(),
		   source,
		   new String[] {
			   "body", "if(self.oclAsType(ecore::EObject).eContainer().oclIsUndefined()) then\n\tVariable.allInstances()->asSet()\nelse \n\tif(self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(OperationCall)) then\n\t\tif self.oclAsType(ecore::EObject).eContainer().oclAsType(OperationCall).parameterAssignments->includes(self) then\n\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(OperationCall).callee.parameters->asSet()\n\t\telse\n\t\t\tOperation.allInstances().stateVariables->asSet()\n\t\tendif\n\telse\n\t\tif(self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Operation)) then\n\t\t\tif self.oclAsType(ecore::EObject).eContainer().oclAsType(Operation).returnValueAssignments->includes(self) then\n\t\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Operation).returnValues->asSet()\n\t\t\telse\n\t\t\t\tif self.oclAsType(ecore::EObject).eContainer().oclAsType(Operation).defaultStateDefinitions->includes(self) then\n\t\t\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Operation).stateVariables->asSet()\n\t\t\t\telse\n\t\t\t\t\tOperation.allInstances().stateVariables->asSet()\n\t\t\t\tendif\n\t\t\tendif\n\t\telse\n\t\t\tVariable.allInstances()->asSet()\n\t\tendif\n\tendif\nendif"
		   });
		addAnnotation
		  (getVariableAssignment__GetPossibleAttributes(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif variable.oclIsUndefined() then\n\t\t\t\t\tgetPossibleVariables().datatype.attributes->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tvariable.datatype.attributes->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getVariableAssignment__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()->reject(oclIsUndefined()).type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getVariableAssignment__IsAttributeWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tattribute.oclIsUndefined()"
		   });
		addAnnotation
		  (getVariableAssignment__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
		addAnnotation
		  (valueSetTypeEClass,
		   source,
		   new String[] {
			   "valueNamesUnique", "values->isUnique(name)"
		   });
		addAnnotation
		  (getLogicTerm_ContainingAssignment(),
		   source,
		   new String[] {
			   "derivation", "let cont = self.oclAsSet()->selectByKind(ecore::EObject)->closure(elem | elem.oclAsType(ecore::EObject).eContainer())->any(e | e.oclIsKindOf(VariableAssignment)) in\n\t\t\t\tif(cont.oclIsInvalid()) then \n\t\t\t\t\tnull\n\t\t\t\telse \n\t\t\t\t\tcont.oclAsType(VariableAssignment)\n\t\t\t\tendif"
		   });
		addAnnotation
		  (parameterRefEClass,
		   source,
		   new String[] {
			   "isParameterValid", "getPossibleParameters()->includes(parameter)",
			   "isAttributeValid", "getPossibleAttributes()->includes(attribute)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getParameterRef__GetPossibleParameters(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tlet assi = containingAssignment in\n\t\t\t\tif(assi.oclIsUndefined() or assi.oclContainer().oclIsUndefined()) then\n\t\t\t\t\tOperation.allInstances().parameters->asSet()\n\t\t\t\telse \n\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(OperationCall)) then\n\t\t\t\t\t\tlet caller = assi.oclContainer().oclAsType(OperationCall).caller in\n\t\t\t\t\t\tif (caller.oclIsKindOf(Operation)) then\n\t\t\t\t\t\t\tcaller.oclAsType(Operation).parameters->asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tSet{}\t\t\t\t\t\n\t\t\t\t\t\tendif\n\t\t\t\t\telse\n\t\t\t\t\t\tif(assi.oclContainer().oclIsKindOf(Operation)) then\n\t\t\t\t\t\t\tassi.oclContainer().oclAsType(Operation).parameters->asSet()\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tOperation.allInstances().parameters->asSet()\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getParameterRef__GetPossibleAttributes(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif parameter.oclIsUndefined() then\n\t\t\t\t\tgetPossibleParameters().datatype.attributes->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tparameter.datatype.attributes->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getParameterRef__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()->reject(oclIsUndefined()).type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getParameterRef__IsAttributeWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tattribute.oclIsUndefined()"
		   });
		addAnnotation
		  (getParameterRef__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
		addAnnotation
		  (propertyRefEClass,
		   source,
		   new String[] {
			   "isPropertyValid", "getPossibleProperties()->includes(property)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getPropertyRef__GetPossibleProperties(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif operation.oclIsUndefined() then\n\t\t\t\t\tOperation.allInstances().propertyDefinitions.property->asSet()\n\t\t\t\telse\n\t\t\t\t\toperation.propertyDefinitions.property->asSet()\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getPropertyRef__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif property.oclIsUndefined() then\n\t\t\t\t\tgetPossibleProperties().type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tproperty.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getPropertyRef__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
		addAnnotation
		  (callerEClass,
		   source,
		   new String[] {
			   "callNamesUnique", "calls->isUnique(name)"
		   });
		addAnnotation
		  (returnValueRefEClass,
		   source,
		   new String[] {
			   "isCallValid", "getPossibleCalls()->includes(call)",
			   "isReturnValueValid", "getPossibleReturnValues()->includes(returnValue)",
			   "isAttributeValid", "getPossibleAttributes()->includes(attribute)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getReturnValueRef__GetPossibleCalls(),
		   source,
		   new String[] {
			   "body", "if(containingAssignment.oclIsUndefined() or containingAssignment.oclAsType(ecore::EObject).eContainer().oclIsUndefined()) then\n\tCaller.allInstances().calls->asSet()\nelse \n\tif(containingAssignment.oclAsType(ecore::EObject).eContainer().oclIsKindOf(OperationCall)) then\n\t\tlet call = containingAssignment.oclAsType(ecore::EObject).eContainer().oclAsType(OperationCall) in\n\t\tlet callIdx = call.caller.calls->indexOf(call) in\n\t\tif(callIdx = 1) then\n\t\t\tSet{}\n\t\telse \n\t\t\tcall.caller.calls->subOrderedSet(1, callIdx-1)->asSet()\n\t\tendif\n\telse\n\t\tif(containingAssignment.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Caller)) then\n\t\t\tcontainingAssignment.oclAsType(ecore::EObject).eContainer().oclAsType(Caller).calls->asSet()\n\t\telse\n\t\t\tCaller.allInstances().calls->asSet()\n\t\tendif\n\tendif\nendif"
		   });
		addAnnotation
		  (getReturnValueRef__GetPossibleReturnValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif(call.oclIsUndefined()) then\n\t\t\t\t\tgetPossibleCalls().callee.returnValues->asSet()\n\t\t\t\telse\n\t\t\t\t\tcall.callee.returnValues->asSet()\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getReturnValueRef__GetPossibleAttributes(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif returnValue.oclIsUndefined() then\n\t\t\t\t\tgetPossibleReturnValues().datatype.attributes->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\treturnValue.datatype.attributes->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getReturnValueRef__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()->reject(oclIsUndefined()).type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getReturnValueRef__IsAttributeWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tattribute.oclIsUndefined()"
		   });
		addAnnotation
		  (getReturnValueRef__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
		addAnnotation
		  (stateRefEClass,
		   source,
		   new String[] {
			   "isStateVariableValid", "getPossibleVariables()->includes(stateVariable)",
			   "isAttributeValid", "getPossibleAttributes()->includes(attribute)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getStateRef__GetPossibleVariables(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tOperation.allInstances().stateVariables->asSet()"
		   });
		addAnnotation
		  (getStateRef__GetPossibleAttributes(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif stateVariable.oclIsUndefined() then\n\t\t\t\t\tgetPossibleVariables().datatype.attributes->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tstateVariable.datatype.attributes->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getStateRef__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()->reject(oclIsUndefined()).type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getStateRef__IsAttributeWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tattribute.oclIsUndefined()"
		   });
		addAnnotation
		  (getStateRef__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
		addAnnotation
		  (defaultStateRefEClass,
		   source,
		   new String[] {
			   "isStateVariableValid", "getPossibleVariables()->includes(stateVariable)",
			   "isAttributeValid", "getPossibleAttributes()->includes(attribute)",
			   "isValueValid", "getPossibleValues()->includes(value)"
		   });
		addAnnotation
		  (getDefaultStateRef__GetPossibleVariables(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tOperation.allInstances().stateVariables->asSet()"
		   });
		addAnnotation
		  (getDefaultStateRef__GetPossibleAttributes(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif stateVariable.oclIsUndefined() then\n\t\t\t\t\tgetPossibleVariables().datatype.attributes->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tstateVariable.datatype.attributes->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getDefaultStateRef__GetPossibleValues(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()->reject(oclIsUndefined()).type.values->asSet()->union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values->asSet()->union(Set{null})\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getDefaultStateRef__IsAttributeWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tattribute.oclIsUndefined()"
		   });
		addAnnotation
		  (getDefaultStateRef__IsValueWildcard(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tvalue.oclIsUndefined()"
		   });
	}

} //PrologmodelPackageImpl
