/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyRefItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.PropertyRefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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
						getResourceLocator(), getString("_UI_PropertyRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PropertyRef_value_feature",
								"_UI_PropertyRef_type"),
						PrologmodelPackage.Literals.PROPERTY_REF__VALUE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return ((PropertyRef) thisObject).getPossibleValues();
					}

				});
	}

	/**
	 * This adds a property descriptor for the Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PropertyRef_property_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PropertyRef_property_feature",
								"_UI_PropertyRef_type"),
						PrologmodelPackage.Literals.PROPERTY_REF__PROPERTY, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((PropertyRef) thisObject).getPossibleProperties();
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
		Optional<PropertyRef> thiz = Util.tryCast(PropertyRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("Property: ");
		result.append(thiz.map(PropertyRef::getOperation).map(Operation::getName).orElse("")).append('.');
		result.append(thiz.map(PropertyRef::getProperty).map(Property::getName).orElse("")).append('.');
		result.append(thiz.map(PropertyRef::getValue).map(Value::getName).orElse("[V]"));
		return result.toString();
	}

}
