/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAssignmentItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.VariableAssignmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VariableAssignment_variable_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_variable_feature",
						"_UI_VariableAssignment_type"),
				PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__VARIABLE, true, false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object thisObject) {
				return ((VariableAssignment) thisObject).getPossibleVariables();
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
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_VariableAssignment_attribute_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_attribute_feature",
						"_UI_VariableAssignment_type"),
				PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__ATTRIBUTE, true, false, true, null, null, null) {

			@Override
			public Collection<?> getChoiceOfValues(Object thisObject) {
				return ((VariableAssignment) thisObject).getPossibleAttributes();
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
						getResourceLocator(), getString("_UI_VariableAssignment_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_value_feature",
								"_UI_VariableAssignment_type"),
						PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__VALUE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((VariableAssignment) thisObject).getPossibleValues();
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
		Optional<VariableAssignment> assignment = Util.tryCast(VariableAssignment.class, object);
		Optional<Variable> var = assignment.map(VariableAssignment::getVariable);
		String varName = var.map(Variable::getName).orElse("");
		String attribName = assignment.map(VariableAssignment::getAttribute).map(Attribute::getName).orElse("*");
		String valueName = assignment.map(VariableAssignment::getValue).map(Value::getName).orElse("*");
		return getString("_UI_VariableAssignment_type") + ": " + varName + "." + attribName + "." + valueName;
	}
	
}
