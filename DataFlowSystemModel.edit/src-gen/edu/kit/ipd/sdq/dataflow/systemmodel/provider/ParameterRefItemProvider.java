/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.Caller;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterRefItemProvider extends LogicTermItemProvider {
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
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParameterPropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						SystemModelPackage.Literals.PARAMETER_REF__PARAMETER, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property

						Optional<ParameterRef> thiz = Util.tryCast(ParameterRef.class, thisObject);
						Optional<Caller> containingCaller = thiz
								.flatMap(obj -> Util.getContainerOfType(obj, Caller.class));
						//this ref is either part of a operation call which in turn is part of a caller or part of a caller itself
						if (containingCaller.isPresent()) {
							if (containingCaller.get() instanceof Operation) {
								return ((Operation) containingCaller.get()).getParameters();
							} else {
								return Collections.emptyList();
							}
						} else {
							return super.getChoiceOfValues(object);
						}

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
						SystemModelPackage.Literals.PARAMETER_REF__ATTRIBUTE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						//the values are dependent on the selected property
						return Util.getOrElse(
								Util.tryCast(ParameterRef.class, thisObject).map(ParameterRef::getParameter)
										.map(Variable::getDatatype).map(DataType::getAttributes).map(Util::addNull),
								() -> super.getChoiceOfValues(object));
					}

				});
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ParameterRef_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ParameterRef_value_feature",
								"_UI_ParameterRef_type"),
						SystemModelPackage.Literals.PARAMETER_REF__VALUE, true, false, true, null, null, null));
	}

	/**
	 * This returns ParameterRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterRef"));
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
		Optional<ParameterRef> thiz = Util.tryCast(ParameterRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("Parameter: ");
		result.append(thiz.map(ParameterRef::getParameter).map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(ParameterRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(ParameterRef::getValue).map(Value::getName).orElse("[V]"));
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

		switch (notification.getFeatureID(ParameterRef.class)) {
		case SystemModelPackage.PARAMETER_REF__PARAMETER:
		case SystemModelPackage.PARAMETER_REF__ATTRIBUTE:
		case SystemModelPackage.PARAMETER_REF__VALUE:
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
