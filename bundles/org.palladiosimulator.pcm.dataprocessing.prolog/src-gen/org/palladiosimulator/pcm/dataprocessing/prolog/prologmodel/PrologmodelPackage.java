/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel;

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
 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PrologmodelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prologmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/prolog/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prologmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrologmodelPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getSystem()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AttributeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getValue()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.CallerImpl <em>Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.CallerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getCaller()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOperation()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getVariable()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DataTypeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getDataType()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getProperty()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyDefinitionImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getPropertyDefinition()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOperationCall()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getVariableAssignment()
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
	 * The operation id for the '<em>Is Attribute Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___IS_ATTRIBUTE_WILDCARD = 3;

	/**
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT___IS_VALUE_WILDCARD = 4;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueSetTypeImpl <em>Value Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueSetTypeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getValueSetType()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.LogicTermImpl <em>Logic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.LogicTermImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getLogicTerm()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.TrueImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getTrue()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.FalseImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getFalse()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AndImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getAnd()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OrImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOr()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.NotImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getNot()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ParameterRefImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getParameterRef()
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
	 * The operation id for the '<em>Is Attribute Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF___IS_ATTRIBUTE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF___IS_VALUE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getPropertyRef()
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
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF___IS_VALUE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemUsageImpl <em>System Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemUsageImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getSystemUsage()
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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl <em>Return Value Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getReturnValueRef()
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
	 * The operation id for the '<em>Is Attribute Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___IS_ATTRIBUTE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF___IS_VALUE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Return Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.StateRefImpl <em>State Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.StateRefImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getStateRef()
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
	 * The operation id for the '<em>Is Attribute Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF___IS_ATTRIBUTE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF___IS_VALUE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl <em>Default State Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getDefaultStateRef()
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
	 * The operation id for the '<em>Is Attribute Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF___IS_ATTRIBUTE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Value Wildcard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF___IS_VALUE_WILDCARD = LOGIC_TERM_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Default State Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_REF_OPERATION_COUNT = LOGIC_TERM_OPERATION_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getAttributes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getDatatypes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getOperations()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getProperties()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getTypes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getSystemusages <em>Systemusages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemusages</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System#getSystemusages()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Systemusages();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getName()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value#getContainingType()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_ContainingType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getReturnValues()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getPropertyDefinitions <em>Property Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Definitions</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getPropertyDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PropertyDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getReturnValueAssignments <em>Return Value Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Value Assignments</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getReturnValueAssignments()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getStateVariables <em>State Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variables</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getStateVariables()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_StateVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getDefaultStateDefinitions <em>Default State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default State Definitions</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getDefaultStateDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DefaultStateDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getPostExecutionStateDefinitions <em>Post Execution State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Execution State Definitions</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation#getPostExecutionStateDefinitions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_PostExecutionStateDefinitions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable#getDatatype()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType#getAttributes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Definition</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition
	 * @generated
	 */
	EClass getPropertyDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getProperty()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_Property();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getPresentValues <em>Present Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Present Values</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getPresentValues()
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	EReference getPropertyDefinition_PresentValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition#getPossibleValues()
	 * @generated
	 */
	EOperation getPropertyDefinition__GetPossibleValues();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCallee()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Callee();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getParameterAssignments <em>Parameter Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Assignments</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getParameterAssignments()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_ParameterAssignments();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Caller</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getCaller()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Caller();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getName()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getPreCallStateDefinitions <em>Pre Call State Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Call State Definitions</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall#getPreCallStateDefinitions()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_PreCallStateDefinitions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getVariable()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Variable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getAttribute()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getValue()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getTerm()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Term();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleVariables()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleAttributes()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#getPossibleValues()
	 * @generated
	 */
	EOperation getVariableAssignment__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#isAttributeWildcard()
	 * @generated
	 */
	EOperation getVariableAssignment__IsAttributeWildcard();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment#isValueWildcard()
	 * @generated
	 */
	EOperation getVariableAssignment__IsValueWildcard();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType <em>Value Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType
	 * @generated
	 */
	EClass getValueSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getValues()
	 * @see #getValueSetType()
	 * @generated
	 */
	EReference getValueSetType_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType#getName()
	 * @see #getValueSetType()
	 * @generated
	 */
	EAttribute getValueSetType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm <em>Logic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Term</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm
	 * @generated
	 */
	EClass getLogicTerm();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm#getContainingAssignment <em>Containing Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Assignment</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm#getContainingAssignment()
	 * @see #getLogicTerm()
	 * @generated
	 */
	EReference getLogicTerm_ContainingAssignment();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And#getOperands()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Operands();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or#getOperands()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Operands();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not#getOperand()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Operand();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef
	 * @generated
	 */
	EClass getParameterRef();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getParameter()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Parameter();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getAttribute()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getValue()
	 * @see #getParameterRef()
	 * @generated
	 */
	EReference getParameterRef_Value();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleParameters() <em>Get Possible Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Parameters</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleParameters()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleParameters();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#getPossibleValues()
	 * @generated
	 */
	EOperation getParameterRef__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#isAttributeWildcard()
	 * @generated
	 */
	EOperation getParameterRef__IsAttributeWildcard();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef#isValueWildcard()
	 * @generated
	 */
	EOperation getParameterRef__IsValueWildcard();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef
	 * @generated
	 */
	EClass getPropertyRef();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getOperation()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getValue()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Value();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getProperty()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EReference getPropertyRef_Property();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getPossibleProperties() <em>Get Possible Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Properties</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getPossibleProperties()
	 * @generated
	 */
	EOperation getPropertyRef__GetPossibleProperties();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#getPossibleValues()
	 * @generated
	 */
	EOperation getPropertyRef__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef#isValueWildcard()
	 * @generated
	 */
	EOperation getPropertyRef__IsValueWildcard();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caller</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller
	 * @generated
	 */
	EClass getCaller();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getCalls()
	 * @see #getCaller()
	 * @generated
	 */
	EReference getCaller_Calls();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller#getName()
	 * @see #getCaller()
	 * @generated
	 */
	EAttribute getCaller_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage <em>System Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Usage</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage
	 * @generated
	 */
	EClass getSystemUsage();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef <em>Return Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value Ref</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef
	 * @generated
	 */
	EClass getReturnValueRef();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getReturnValue()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_ReturnValue();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getAttribute()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getValue()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Value();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getCall()
	 * @see #getReturnValueRef()
	 * @generated
	 */
	EReference getReturnValueRef_Call();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleCalls() <em>Get Possible Calls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Calls</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleCalls()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleCalls();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleReturnValues() <em>Get Possible Return Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Return Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleReturnValues()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleReturnValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#getPossibleValues()
	 * @generated
	 */
	EOperation getReturnValueRef__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#isAttributeWildcard()
	 * @generated
	 */
	EOperation getReturnValueRef__IsAttributeWildcard();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef#isValueWildcard()
	 * @generated
	 */
	EOperation getReturnValueRef__IsValueWildcard();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef <em>State Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Ref</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef
	 * @generated
	 */
	EClass getStateRef();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getStateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Variable</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getStateVariable()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_StateVariable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getAttribute()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getValue()
	 * @see #getStateRef()
	 * @generated
	 */
	EReference getStateRef_Value();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleVariables()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#getPossibleValues()
	 * @generated
	 */
	EOperation getStateRef__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#isAttributeWildcard()
	 * @generated
	 */
	EOperation getStateRef__IsAttributeWildcard();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef#isValueWildcard()
	 * @generated
	 */
	EOperation getStateRef__IsValueWildcard();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef <em>Default State Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default State Ref</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef
	 * @generated
	 */
	EClass getDefaultStateRef();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getStateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Variable</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getStateVariable()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_StateVariable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getAttribute()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getValue()
	 * @see #getDefaultStateRef()
	 * @generated
	 */
	EReference getDefaultStateRef_Value();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleVariables() <em>Get Possible Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Variables</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleVariables()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleVariables();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleAttributes() <em>Get Possible Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Attributes</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleAttributes()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleAttributes();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleValues() <em>Get Possible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Values</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#getPossibleValues()
	 * @generated
	 */
	EOperation getDefaultStateRef__GetPossibleValues();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#isAttributeWildcard() <em>Is Attribute Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#isAttributeWildcard()
	 * @generated
	 */
	EOperation getDefaultStateRef__IsAttributeWildcard();

	/**
	 * Returns the meta object for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#isValueWildcard() <em>Is Value Wildcard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Wildcard</em>' operation.
	 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef#isValueWildcard()
	 * @generated
	 */
	EOperation getDefaultStateRef__IsValueWildcard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrologmodelFactory getPrologmodelFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getSystem()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AttributeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getValue()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOperation()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DataTypeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getDataType()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyDefinitionImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getPropertyDefinition()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OperationCallImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOperationCall()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.VariableAssignmentImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getVariableAssignment()
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
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_VARIABLES = eINSTANCE.getVariableAssignment__GetPossibleVariables();

		/**
		 * The meta object literal for the '<em><b>Get Possible Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_ATTRIBUTES = eINSTANCE.getVariableAssignment__GetPossibleAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Possible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___GET_POSSIBLE_VALUES = eINSTANCE.getVariableAssignment__GetPossibleValues();

		/**
		 * The meta object literal for the '<em><b>Is Attribute Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___IS_ATTRIBUTE_WILDCARD = eINSTANCE.getVariableAssignment__IsAttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_ASSIGNMENT___IS_VALUE_WILDCARD = eINSTANCE.getVariableAssignment__IsValueWildcard();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueSetTypeImpl <em>Value Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ValueSetTypeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getValueSetType()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.LogicTermImpl <em>Logic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.LogicTermImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getLogicTerm()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.TrueImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.FalseImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.AndImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getAnd()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.OrImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getOr()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.NotImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getNot()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ParameterRefImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getParameterRef()
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
		 * The meta object literal for the '<em><b>Is Attribute Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REF___IS_ATTRIBUTE_WILDCARD = eINSTANCE.getParameterRef__IsAttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_REF___IS_VALUE_WILDCARD = eINSTANCE.getParameterRef__IsValueWildcard();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl <em>Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PropertyRefImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getPropertyRef()
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
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_REF___IS_VALUE_WILDCARD = eINSTANCE.getPropertyRef__IsValueWildcard();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.CallerImpl <em>Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.CallerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getCaller()
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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemUsageImpl <em>System Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.SystemUsageImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getSystemUsage()
		 * @generated
		 */
		EClass SYSTEM_USAGE = eINSTANCE.getSystemUsage();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl <em>Return Value Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.ReturnValueRefImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getReturnValueRef()
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
		EOperation RETURN_VALUE_REF___GET_POSSIBLE_RETURN_VALUES = eINSTANCE.getReturnValueRef__GetPossibleReturnValues();

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
		 * The meta object literal for the '<em><b>Is Attribute Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___IS_ATTRIBUTE_WILDCARD = eINSTANCE.getReturnValueRef__IsAttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_VALUE_REF___IS_VALUE_WILDCARD = eINSTANCE.getReturnValueRef__IsValueWildcard();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.StateRefImpl <em>State Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.StateRefImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getStateRef()
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
		 * The meta object literal for the '<em><b>Is Attribute Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_REF___IS_ATTRIBUTE_WILDCARD = eINSTANCE.getStateRef__IsAttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_REF___IS_VALUE_WILDCARD = eINSTANCE.getStateRef__IsValueWildcard();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl <em>Default State Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.DefaultStateRefImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.impl.PrologmodelPackageImpl#getDefaultStateRef()
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

		/**
		 * The meta object literal for the '<em><b>Is Attribute Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_STATE_REF___IS_ATTRIBUTE_WILDCARD = eINSTANCE.getDefaultStateRef__IsAttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Is Value Wildcard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFAULT_STATE_REF___IS_VALUE_WILDCARD = eINSTANCE.getDefaultStateRef__IsValueWildcard();

	}

} //PrologmodelPackage
