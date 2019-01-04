/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAssignmentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addVariablePropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableAssignment_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_variable_feature", "_UI_VariableAssignment_type"),
				 PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableAssignment_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_attribute_feature", "_UI_VariableAssignment_type"),
				 PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableAssignment_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_value_feature", "_UI_VariableAssignment_type"),
				 PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VariableAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_VariableAssignment_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(VariableAssignment.class))
		{
			case PrologmodelPackage.VARIABLE_ASSIGNMENT__TERM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createParameterRef()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createPropertyRef()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createReturnValueRef()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createStateRef()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.VARIABLE_ASSIGNMENT__TERM,
				 PrologmodelFactory.eINSTANCE.createDefaultStateRef()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return PrologmodelEditPlugin.INSTANCE;
	}

}
