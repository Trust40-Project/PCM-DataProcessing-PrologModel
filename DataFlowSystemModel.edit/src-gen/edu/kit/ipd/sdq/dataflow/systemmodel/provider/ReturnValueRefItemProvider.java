/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel.provider;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Value;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnValueRefItemProvider extends LogicTermItemProvider {
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
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReturnValuePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addCallPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						SystemModelPackage.Literals.RETURN_VALUE_REF__RETURN_VALUE, true, false, true, null, null,
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
						SystemModelPackage.Literals.RETURN_VALUE_REF__ATTRIBUTE, true, false, true, null, null, null) {

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
						SystemModelPackage.Literals.RETURN_VALUE_REF__VALUE, true, false, true, null, null, null) {

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
						SystemModelPackage.Literals.RETURN_VALUE_REF__CALL, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object thisObject) {
						return ((ReturnValueRef) thisObject).getPossibleCalls();
					}
				});
	}

	/**
	 * This returns ReturnValueRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReturnValueRef"));
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
		Optional<ReturnValueRef> thiz = Util.tryCast(ReturnValueRef.class, thisObject);
		StringBuilder result = new StringBuilder();
		result.append("ReturnValue: ");
		result.append(thiz.map(ReturnValueRef::getCall).map(OperationCall::getName).orElse("")).append(".");
		result.append(thiz.map(ReturnValueRef::getReturnValue).map(Variable::getName).orElse("")).append(".");
		result.append(thiz.map(ReturnValueRef::getAttribute).map(Attribute::getName).orElse("[A]")).append('.');
		result.append(thiz.map(ReturnValueRef::getValue).map(Value::getName).orElse("[V]"));
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

		switch (notification.getFeatureID(ReturnValueRef.class)) {
		case SystemModelPackage.RETURN_VALUE_REF__RETURN_VALUE:
		case SystemModelPackage.RETURN_VALUE_REF__ATTRIBUTE:
		case SystemModelPackage.RETURN_VALUE_REF__VALUE:
		case SystemModelPackage.RETURN_VALUE_REF__CALL:
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
