/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.provider;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.StateRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.StateRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateRefItemProvider extends LogicTermItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStateVariablePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addStateVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StateRef_stateVariable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StateRef_stateVariable_feature",
								"_UI_StateRef_type"),
						SystemModelPackage.Literals.STATE_REF__STATE_VARIABLE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return ((StateRef) object).getPossibleVariables();
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
						getResourceLocator(), getString("_UI_StateRef_attribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StateRef_attribute_feature",
								"_UI_StateRef_type"),
						SystemModelPackage.Literals.STATE_REF__ATTRIBUTE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return ((StateRef) object).getPossibleAttributes();
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
						getResourceLocator(), getString("_UI_StateRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StateRef_value_feature",
								"_UI_StateRef_type"),
						SystemModelPackage.Literals.STATE_REF__VALUE, true, false, true, null, null, null) {
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return ((StateRef) object).getPossibleValues();
					}
				});
	}

	/**
	 * This returns StateRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StateRef"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object thisObject) {
		Optional<StateRef> thiz = Util.tryCast(StateRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("State: ");
		Optional<Variable> var = thiz.map(StateRef::getStateVariable);
		result.append(var.map(Variable::eContainer).flatMap(obj -> Util.tryCast(Operation.class, obj))
				.map(Operation::getName).orElse("")).append('.');
		result.append(var.map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(StateRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(StateRef::getValue).map(Value::getName).orElse("[V]"));
		return result.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StateRef.class)) {
		case SystemModelPackage.STATE_REF__STATE_VARIABLE:
		case SystemModelPackage.STATE_REF__ATTRIBUTE:
		case SystemModelPackage.STATE_REF__VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
