/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultStateRefItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.DefaultStateRefItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultStateRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the State Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addStateVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DefaultStateRef_stateVariable_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DefaultStateRef_stateVariable_feature",
						"_UI_DefaultStateRef_type"),
				PrologmodelPackage.Literals.DEFAULT_STATE_REF__STATE_VARIABLE, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return ((DefaultStateRef) object).getPossibleVariables();
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
						getResourceLocator(), getString("_UI_DefaultStateRef_attribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DefaultStateRef_attribute_feature",
								"_UI_DefaultStateRef_type"),
						PrologmodelPackage.Literals.DEFAULT_STATE_REF__ATTRIBUTE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return ((DefaultStateRef) object).getPossibleAttributes();
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
						getResourceLocator(), getString("_UI_DefaultStateRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DefaultStateRef_value_feature",
								"_UI_DefaultStateRef_type"),
						PrologmodelPackage.Literals.DEFAULT_STATE_REF__VALUE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return ((DefaultStateRef) object).getPossibleValues();
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
		Optional<DefaultStateRef> thiz = Util.tryCast(DefaultStateRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("Default-State: ");
		Optional<Variable> var = thiz.map(DefaultStateRef::getStateVariable);
		result.append(var.map(Variable::eContainer).flatMap(obj -> Util.tryCast(Operation.class, obj))
				.map(Operation::getName).orElse("")).append('.');
		result.append(var.map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(DefaultStateRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(DefaultStateRef::getValue).map(Value::getName).orElse("[V]"));
		return result.toString();
	}

}
