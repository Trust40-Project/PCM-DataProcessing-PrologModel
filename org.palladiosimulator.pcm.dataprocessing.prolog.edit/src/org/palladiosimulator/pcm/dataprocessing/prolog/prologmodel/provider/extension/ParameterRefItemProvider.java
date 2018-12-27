/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterRefItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.ParameterRefItemProvider {
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}


	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterRef_parameter_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterRef_parameter_feature",
								"_UI_ParameterRef_type"),
						PrologmodelPackage.Literals.PARAMETER_REF__PARAMETER, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return ((ParameterRef) thisObject).getPossibleParameters();
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
						getResourceLocator(), getString("_UI_ParameterRef_attribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterRef_attribute_feature",
								"_UI_ParameterRef_type"),
						PrologmodelPackage.Literals.PARAMETER_REF__ATTRIBUTE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return ((ParameterRef) thisObject).getPossibleAttributes();
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
						getResourceLocator(), getString("_UI_ParameterRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterRef_value_feature",
								"_UI_ParameterRef_type"),
						PrologmodelPackage.Literals.PARAMETER_REF__VALUE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return ((ParameterRef) thisObject).getPossibleValues();
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
		Optional<ParameterRef> thiz = Util.tryCast(ParameterRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("Parameter: ");
		result.append(thiz.map(ParameterRef::getParameter).map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(ParameterRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(ParameterRef::getValue).map(Value::getName).orElse("[V]"));
		return result.toString();
	}

}
