/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.provider;

import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.Property;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition;
import edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.ValueSetType;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyRefItemProvider extends LogicTermItemProvider {
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
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperationPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PropertyRef_operation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PropertyRef_operation_feature",
								"_UI_PropertyRef_type"),
						SystemModelPackage.Literals.PROPERTY_REF__OPERATION, true, false, true, null, null, null));
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
						SystemModelPackage.Literals.PROPERTY_REF__VALUE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return Util.getOrElse(
								Util.tryCast(PropertyRef.class, thisObject).map(PropertyRef::getProperty)
										.map(Property::getType).map(ValueSetType::getValues).map(Util::addNull),
								() -> super.getChoiceOfValues(object));
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
						SystemModelPackage.Literals.PROPERTY_REF__PROPERTY, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return Util.getOrElse(
								Util.tryCast(PropertyRef.class, thisObject).map(PropertyRef::getOperation)
										.map(Operation::getPropertyDefinitions)
										.map(propDefs -> propDefs.stream().map(PropertyDefinition::getProperty)
												.filter(p -> p != null).collect(Collectors.toList())),
								() -> super.getChoiceOfValues(object));
					}

				});
	}

	/**
	 * This returns PropertyRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyRef"));
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
		Optional<PropertyRef> thiz = Util.tryCast(PropertyRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("Property: ");
		result.append(thiz.map(PropertyRef::getOperation).map(Operation::getName).orElse("")).append('.');
		result.append(thiz.map(PropertyRef::getProperty).map(Property::getName).orElse("")).append('.');
		result.append(thiz.map(PropertyRef::getValue).map(Value::getName).orElse("[V]"));
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

		switch (notification.getFeatureID(PropertyRef.class)) {
		case SystemModelPackage.PROPERTY_REF__OPERATION:
		case SystemModelPackage.PROPERTY_REF__VALUE:
		case SystemModelPackage.PROPERTY_REF__PROPERTY:
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
