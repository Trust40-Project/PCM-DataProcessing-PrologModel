/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyDefinitionItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.PropertyDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Present Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPresentValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PropertyDefinition_presentValues_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PropertyDefinition_presentValues_feature",
						"_UI_PropertyDefinition_type"),
				PrologmodelPackage.Literals.PROPERTY_DEFINITION__PRESENT_VALUES, true, false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object thisObject) {
				return ((PropertyDefinition) thisObject).getPossibleValues();
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
	public String getText(Object object) {
		return Util.getOrElse(
				Util.tryCast(PropertyDefinition.class, object).map(PropertyDefinition::getProperty)
						.map(Property::getName).map(n -> getString("_UI_PropertyDefinition_type") + ": " + n),
				() -> getString("_UI_PropertyDefinition_type"));
	}

}
