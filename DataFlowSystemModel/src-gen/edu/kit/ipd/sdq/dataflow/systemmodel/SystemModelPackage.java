/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SystemModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systemmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/dataflow/systemmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "systemmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemModelPackage eINSTANCE = edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DATATYPES = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TYPES = 5;

	/**
	 * The feature id for the '<em><b>Systemusages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEMUSAGES = 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.AttributeImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CONTAINING_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.CallerImpl <em>Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.CallerImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getCaller()
	 * @generated
	 */
	int CALLER = 19;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__CALLS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CALLS = CALLER__CALLS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = CALLER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = CALLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUES = CALLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PROPERTY_DEFINITIONS = CALLER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Value Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUE_ASSIGNMENTS = CALLER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STATE_VARIABLES = CALLER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default State Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEFAULT_STATE_DEFINITIONS = CALLER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Post Execution State Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POST_EXECUTION_STATE_DEFINITIONS = CALLER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CALLER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = CALLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.DataTypeImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyDefinitionImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getPropertyDefinition()
	 * @generated
	 */
	int PROPERTY_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Present Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION__PRESENT_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION___GET_POSSIBLE_VALUES = 0;

	/**
	 * The number of operations of the '<em>Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationCallImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 8;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__CALLEE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PARAMETER_ASSIGNMENTS = 1;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__CALLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Pre Call State Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS = 4;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableAssignmentImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__TERM = 3;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Possible Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES = 0;

	/**
	 * The operation id for the '<em>Get Possible Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES = 1;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES = 2;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueSetTypeImpl <em>Value Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueSetTypeImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getValueSetType()
	 * @generated
	 */
	int VALUE_SET_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_TYPE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Value Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.LogicTermImpl <em>Logic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.LogicTermImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getLogicTerm()
	 * @generated
	 */
	int LOGIC_TERM = 11;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TERM__CONTAINING_ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Logic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.TrueImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 12;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.FalseImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getFalse()
	 * @generated
	 */
	int FALSE = 13;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.AndImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 14;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERANDS = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 15;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERANDS = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.NotImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 16;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ParameterRefImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getParameterRef()
	 * @generated
	 */
	int PARAMETER_REF = 17;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__PARAMETER = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__ATTRIBUTE = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__VALUE = LOGIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Possible Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF___GET_POSSIBLE_PARAMETERS = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Possible Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF___GET_POSSIBLE_ATTRIBUTES = LOGIC_TERM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF___GET_POSSIBLE_VALUES = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyRefImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getPropertyRef()
	 * @generated
	 */
	int PROPERTY_REF = 18;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__OPERATION = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__VALUE = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__PROPERTY = LOGIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Possible Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___GET_POSSIBLE_PROPERTIES = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___GET_POSSIBLE_VALUES = LOGIC_TERM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemUsageImpl <em>System Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemUsageImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getSystemUsage()
	 * @generated
	 */
	int SYSTEM_USAGE = 20;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USAGE__CALLS = CALLER__CALLS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USAGE__NAME = CALLER__NAME;

	/**
	 * The number of structural features of the '<em>System Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USAGE_FEATURE_COUNT = CALLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USAGE_OPERATION_COUNT = CALLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl <em>Return Value Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getReturnValueRef()
	 * @generated
	 */
	int RETURN_VALUE_REF = 21;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF__RETURN_VALUE = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF__ATTRIBUTE = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF__VALUE = LOGIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF__CALL = LOGIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Return Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Possible Calls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___GET_POSSIBLE_CALLS = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Possible Return Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES = LOGIC_TERM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Possible Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___GET_POSSIBLE_ATTRIBUTES = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___GET_POSSIBLE_VALUES = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Return Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.StateRefImpl <em>State Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.StateRefImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getStateRef()
	 * @generated
	 */
	int STATE_REF = 22;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>State Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF__STATE_VARIABLE = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF__ATTRIBUTE = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF__VALUE = LOGIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Possible Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF___GET_POSSIBLE_VARIABLES = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Possible Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF___GET_POSSIBLE_ATTRIBUTES = LOGIC_TERM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF___GET_POSSIBLE_VALUES = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.DefaultStateRefImpl <em>Default State Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.DefaultStateRefImpl
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getDefaultStateRef()
	 * @generated
	 */
	int DEFAULT_STATE_REF = 23;

	/**
	 * The feature id for the '<em><b>Containing Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF__CONTAINING_ASSIGNMENT = LOGIC_TERM__CONTAINING_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>State Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF__STATE_VARIABLE = LOGIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF__ATTRIBUTE = LOGIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF__VALUE = LOGIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF_FEATURE_COUNT = LOGIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Possible Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF___GET_POSSIBLE_VARIABLES = LOGIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Possible Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF___GET_POSSIBLE_ATTRIBUTES = LOGIC_TERM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Possible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF___GET_POSSIBLE_VALUES = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Default State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getAttributes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getDatatypes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getOperations()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getProperties()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getTypes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.System#getSystemusages <em>Systemusages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemusages</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.System#getSystemusages()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Systemusages();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Value#getName()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Name();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Value#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Value#getContainingType()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_ContainingType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValues()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValues();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPropertyDefinitions <em>Property Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Definitions</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPropertyDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PropertyDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValueAssignments <em>Return Value Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Value Assignments</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValueAssignments()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getStateVariables <em>State Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variables</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getStateVariables()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_StateVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getDefaultStateDefinitions <em>Default State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default State Definitions</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getDefaultStateDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DefaultStateDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPostExecutionStateDefinitions <em>Post Execution State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Execution State Definitions</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPostExecutionStateDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PostExecutionStateDefinitions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Variable#getDatatype()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DataType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DataType#getAttributes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Definition</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition
	 * @generated
	 */
	EClass getPropertyDefinition();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getProperty()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_Property();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getPresentValues <em>Present Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Present Values</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getPresentValues()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_PresentValues();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition#getPossibleValues()
	 * @generated
	 */
	EOperation getPropertyDefinition__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCallee()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Callee();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getParameterAssignments <em>Parameter Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Assignments</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getParameterAssignments()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_ParameterAssignments();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Caller</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getCaller()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Caller();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getName()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getPreCallStateDefinitions <em>Pre Call State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Call State Definitions</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall#getPreCallStateDefinitions()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_PreCallStateDefinitions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getVariable()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Variable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getAttribute()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Attribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getValue()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Value();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getTerm()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Term();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleVariables()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleAttributes()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment#getPossibleValues()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType <em>Value Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Type</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType
	 * @generated
	 */
	EClass getValueSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType#getValues()
	 * @see #getValueSetType()
	 * @generated
	 */
	EReference getValueSetType_Values();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType#getName()
	 * @see #getValueSetType()
	 * @generated
	 */
	EAttribute getValueSetType_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm <em>Logic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Term</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm
	 * @generated
	 */
	EClass getLogicTerm();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm#getContainingAssignment <em>Containing Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Assignment</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.LogicTerm#getContainingAssignment()
	 * @see #getLogicTerm()
	 * @generated
	 */
	EReference getLogicTerm_ContainingAssignment();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.And#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.And#getOperands()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Operands();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Or#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Or#getOperands()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Operands();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Not#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Not#getOperand()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Operand();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef
	 * @generated
	 */
	EClass getParameterRef();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getParameter()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Parameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getAttribute()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getValue()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Value();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleParameters() <em>Get Possible Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Parameters</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleParameters()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleParameters();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef#getPossibleValues()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef
	 * @generated
	 */
	EClass getPropertyRef();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getOperation()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Operation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getValue()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Value();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getProperty()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Property();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getPossibleProperties() <em>Get Possible Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Properties</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getPossibleProperties()
	 * @generated
	 */
	EOperation getPropertyRef__GetPossibleProperties();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef#getPossibleValues()
	 * @generated
	 */
	EOperation getPropertyRef__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Caller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caller</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Caller
	 * @generated
	 */
	EClass getCaller();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Caller#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Caller#getCalls()
	 * @see #getCaller()
	 * @generated
	 */
	EReference getCaller_Calls();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.dataflow.systemmodel.Caller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.Caller#getName()
	 * @see #getCaller()
	 * @generated
	 */
	EAttribute getCaller_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage <em>System Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Usage</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage
	 * @generated
	 */
	EClass getSystemUsage();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef <em>Return Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value Ref</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef
	 * @generated
	 */
	EClass getReturnValueRef();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getReturnValue()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_ReturnValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getAttribute()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getValue()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Value();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getCall()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Call();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleCalls() <em>Get Possible Calls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Calls</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleCalls()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleCalls();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleReturnValues() <em>Get Possible Return Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Return Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleReturnValues()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleReturnValues();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef#getPossibleValues()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef <em>State Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Ref</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef
	 * @generated
	 */
	EClass getStateRef();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getStateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Variable</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getStateVariable()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_StateVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getAttribute()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getValue()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_Value();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleVariables()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.StateRef#getPossibleValues()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef <em>Default State Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default State Ref</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef
	 * @generated
	 */
	EClass getDefaultStateRef();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getStateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Variable</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getStateVariable()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_StateVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getAttribute()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getValue()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_Value();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleVariables()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getPossibleValues()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemModelFactory getSystemModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ATTRIBUTES = eINSTANCE.getSystem_Attributes();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__DATATYPES = eINSTANCE.getSystem_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OPERATIONS = eINSTANCE.getSystem_Operations();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROPERTIES = eINSTANCE.getSystem_Properties();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TYPES = eINSTANCE.getSystem_Types();

		/**
		 * The meta object literal for the '<em><b>Systemusages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEMUSAGES = eINSTANCE.getSystem_Systemusages();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.AttributeImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__CONTAINING_TYPE = eINSTANCE.getValue_ContainingType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_VALUES = eINSTANCE.getOperation_ReturnValues();

		/**
		 * The meta object literal for the '<em><b>Property Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PROPERTY_DEFINITIONS = eINSTANCE.getOperation_PropertyDefinitions();

		/**
		 * The meta object literal for the '<em><b>Return Value Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_VALUE_ASSIGNMENTS = eINSTANCE.getOperation_ReturnValueAssignments();

		/**
		 * The meta object literal for the '<em><b>State Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__STATE_VARIABLES = eINSTANCE.getOperation_StateVariables();

		/**
		 * The meta object literal for the '<em><b>Default State Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__DEFAULT_STATE_DEFINITIONS = eINSTANCE.getOperation_DefaultStateDefinitions();

		/**
		 * The meta object literal for the '<em><b>Post Execution State Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__POST_EXECUTION_STATE_DEFINITIONS = eINSTANCE.getOperation_PostExecutionStateDefinitions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DATATYPE = eINSTANCE.getVariable_Datatype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.DataTypeImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__ATTRIBUTES = eINSTANCE.getDataType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyDefinitionImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getPropertyDefinition()
		 * @generated
		 */
		EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__PROPERTY = eINSTANCE.getPropertyDefinition_Property();

		/**
		 * The meta object literal for the '<em><b>Present Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DEFINITION__PRESENT_VALUES = eINSTANCE.getPropertyDefinition_PresentValues();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_DEFINITION___GET_POSSIBLE_VALUES = eINSTANCE.getPropertyDefinition__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OperationCallImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__CALLEE = eINSTANCE.getOperationCall_Callee();

		/**
		 * The meta object literal for the '<em><b>Parameter Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__PARAMETER_ASSIGNMENTS = eINSTANCE.getOperationCall_ParameterAssignments();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__CALLER = eINSTANCE.getOperationCall_Caller();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__NAME = eINSTANCE.getOperationCall_Name();

		/**
		 * The meta object literal for the '<em><b>Pre Call State Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__PRE_CALL_STATE_DEFINITIONS = eINSTANCE.getOperationCall_PreCallStateDefinitions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.VariableAssignmentImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VARIABLE = eINSTANCE.getVariableAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getVariableAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VALUE = eINSTANCE.getVariableAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__TERM = eINSTANCE.getVariableAssignment_Term();

		/**
		 * The meta object literal for the '<em><b>Get Possible Variables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES = eINSTANCE
				.getVariableAssignment__GetPossibleVariables();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES = eINSTANCE
				.getVariableAssignment__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES = eINSTANCE.getVariableAssignment__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueSetTypeImpl <em>Value Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ValueSetTypeImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getValueSetType()
		 * @generated
		 */
		EClass VALUE_SET_TYPE = eINSTANCE.getValueSetType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_TYPE__VALUES = eINSTANCE.getValueSetType_Values();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_TYPE__NAME = eINSTANCE.getValueSetType_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.LogicTermImpl <em>Logic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.LogicTermImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getLogicTerm()
		 * @generated
		 */
		EClass LOGIC_TERM = eINSTANCE.getLogicTerm();

		/**
		 * The meta object literal for the '<em><b>Containing Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_TERM__CONTAINING_ASSIGNMENT = eINSTANCE.getLogicTerm_ContainingAssignment();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.TrueImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.FalseImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.AndImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OPERANDS = eINSTANCE.getAnd_Operands();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.OrImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__OPERANDS = eINSTANCE.getOr_Operands();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.NotImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__OPERAND = eINSTANCE.getNot_Operand();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ParameterRefImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getParameterRef()
		 * @generated
		 */
		EClass PARAMETER_REF = eINSTANCE.getParameterRef();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REF__PARAMETER = eINSTANCE.getParameterRef_Parameter();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REF__ATTRIBUTE = eINSTANCE.getParameterRef_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REF__VALUE = eINSTANCE.getParameterRef_Value();

		/**
		 * The meta object literal for the '<em><b>Get Possible Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REF___GET_POSSIBLE_PARAMETERS = eINSTANCE.getParameterRef__GetPossibleParameters();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REF___GET_POSSIBLE_ATTRIBUTES = eINSTANCE.getParameterRef__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REF___GET_POSSIBLE_VALUES = eINSTANCE.getParameterRef__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyRefImpl <em>Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.PropertyRefImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getPropertyRef()
		 * @generated
		 */
		EClass PROPERTY_REF = eINSTANCE.getPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF__OPERATION = eINSTANCE.getPropertyRef_Operation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF__VALUE = eINSTANCE.getPropertyRef_Value();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF__PROPERTY = eINSTANCE.getPropertyRef_Property();

		/**
		 * The meta object literal for the '<em><b>Get Possible Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_REF___GET_POSSIBLE_PROPERTIES = eINSTANCE.getPropertyRef__GetPossibleProperties();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_REF___GET_POSSIBLE_VALUES = eINSTANCE.getPropertyRef__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.CallerImpl <em>Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.CallerImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getCaller()
		 * @generated
		 */
		EClass CALLER = eINSTANCE.getCaller();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLER__CALLS = eINSTANCE.getCaller_Calls();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLER__NAME = eINSTANCE.getCaller_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemUsageImpl <em>System Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemUsageImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getSystemUsage()
		 * @generated
		 */
		EClass SYSTEM_USAGE = eINSTANCE.getSystemUsage();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl <em>Return Value Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.ReturnValueRefImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getReturnValueRef()
		 * @generated
		 */
		EClass RETURN_VALUE_REF = eINSTANCE.getReturnValueRef();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE_REF__RETURN_VALUE = eINSTANCE.getReturnValueRef_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE_REF__ATTRIBUTE = eINSTANCE.getReturnValueRef_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE_REF__VALUE = eINSTANCE.getReturnValueRef_Value();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE_REF__CALL = eINSTANCE.getReturnValueRef_Call();

		/**
		 * The meta object literal for the '<em><b>Get Possible Calls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___GET_POSSIBLE_CALLS = eINSTANCE.getReturnValueRef__GetPossibleCalls();

		/**
		 * The meta object literal for the '<em><b>Get Possible Return Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES = eINSTANCE
				.getReturnValueRef__GetPossibleReturnValues();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___GET_POSSIBLE_ATTRIBUTES = eINSTANCE.getReturnValueRef__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___GET_POSSIBLE_VALUES = eINSTANCE.getReturnValueRef__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.StateRefImpl <em>State Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.StateRefImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getStateRef()
		 * @generated
		 */
		EClass STATE_REF = eINSTANCE.getStateRef();

		/**
		 * The meta object literal for the '<em><b>State Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_REF__STATE_VARIABLE = eINSTANCE.getStateRef_StateVariable();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_REF__ATTRIBUTE = eINSTANCE.getStateRef_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_REF__VALUE = eINSTANCE.getStateRef_Value();

		/**
		 * The meta object literal for the '<em><b>Get Possible Variables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_REF___GET_POSSIBLE_VARIABLES = eINSTANCE.getStateRef__GetPossibleVariables();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_REF___GET_POSSIBLE_ATTRIBUTES = eINSTANCE.getStateRef__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_REF___GET_POSSIBLE_VALUES = eINSTANCE.getStateRef__GetPossibleValues();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.impl.DefaultStateRefImpl <em>Default State Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.DefaultStateRefImpl
		 * @see edu.kit.ipd.sdq.dataflow.systemmodel.impl.SystemModelPackageImpl#getDefaultStateRef()
		 * @generated
		 */
		EClass DEFAULT_STATE_REF = eINSTANCE.getDefaultStateRef();

		/**
		 * The meta object literal for the '<em><b>State Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_STATE_REF__STATE_VARIABLE = eINSTANCE.getDefaultStateRef_StateVariable();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_STATE_REF__ATTRIBUTE = eINSTANCE.getDefaultStateRef_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_STATE_REF__VALUE = eINSTANCE.getDefaultStateRef_Value();

		/**
		 * The meta object literal for the '<em><b>Get Possible Variables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_STATE_REF___GET_POSSIBLE_VARIABLES = eINSTANCE.getDefaultStateRef__GetPossibleVariables();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_STATE_REF___GET_POSSIBLE_ATTRIBUTES = eINSTANCE.getDefaultStateRef__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_STATE_REF___GET_POSSIBLE_VALUES = eINSTANCE.getDefaultStateRef__GetPossibleValues();

	}

} //SystemModelPackage
