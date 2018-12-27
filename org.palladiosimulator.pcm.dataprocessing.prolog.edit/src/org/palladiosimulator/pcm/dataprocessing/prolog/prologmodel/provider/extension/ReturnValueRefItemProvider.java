/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnValueRefItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.ReturnValueRefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnValueRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Return Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addReturnValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReturnValueRef_returnValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReturnValueRef_returnValue_feature",
								"_UI_ReturnValueRef_type"),
						PrologmodelPackage.Literals.RETURN_VALUE_REF__RETURN_VALUE, true, false, true, null, null,
						null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((ReturnValueRef) thisObject).getPossibleReturnValues();
					}

				});
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReturnValueRef_attribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReturnValueRef_attribute_feature",
								"_UI_ReturnValueRef_type"),
						PrologmodelPackage.Literals.RETURN_VALUE_REF__ATTRIBUTE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((ReturnValueRef) thisObject).getPossibleAttributes();
					}
				});
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReturnValueRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReturnValueRef_value_feature",
								"_UI_ReturnValueRef_type"),
						PrologmodelPackage.Literals.RETURN_VALUE_REF__VALUE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((ReturnValueRef) thisObject).getPossibleValues();
					}
				});
	}

	/**
	 * This adds a property descriptor for the Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReturnValueRef_call_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReturnValueRef_call_feature",
								"_UI_ReturnValueRef_type"),
						PrologmodelPackage.Literals.RETURN_VALUE_REF__CALL, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((ReturnValueRef) thisObject).getPossibleCalls();
					}
				});
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object thisObject) {
		Optional<ReturnValueRef> thiz = Util.tryCast(ReturnValueRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("ReturnValue: ");
		result.append(thiz.map(ReturnValueRef::getCall).map(OperationCall::getName).orElse("")).append(".");
		result.append(thiz.map(ReturnValueRef::getReturnValue).map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(ReturnValueRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(ReturnValueRef::getValue).map(Value::getName).orElse("[V]"));
		return result.toString();
	}

}
