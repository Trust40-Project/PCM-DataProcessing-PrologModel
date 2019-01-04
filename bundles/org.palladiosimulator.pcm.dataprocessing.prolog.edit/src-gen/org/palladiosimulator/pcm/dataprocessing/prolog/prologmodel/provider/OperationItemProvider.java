/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider extends CallerItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__PARAMETERS);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__RETURN_VALUES);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__PROPERTY_DEFINITIONS);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__RETURN_VALUE_ASSIGNMENTS);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__STATE_VARIABLES);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__DEFAULT_STATE_DEFINITIONS);
			childrenFeatures.add(PrologmodelPackage.Literals.OPERATION__POST_EXECUTION_STATE_DEFINITIONS);
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operation"));
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
		String label = ((Operation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Operation_type") :
			getString("_UI_Operation_type") + " " + label;
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

		switch (notification.getFeatureID(Operation.class))
		{
			case PrologmodelPackage.OPERATION__PARAMETERS:
			case PrologmodelPackage.OPERATION__RETURN_VALUES:
			case PrologmodelPackage.OPERATION__PROPERTY_DEFINITIONS:
			case PrologmodelPackage.OPERATION__RETURN_VALUE_ASSIGNMENTS:
			case PrologmodelPackage.OPERATION__STATE_VARIABLES:
			case PrologmodelPackage.OPERATION__DEFAULT_STATE_DEFINITIONS:
			case PrologmodelPackage.OPERATION__POST_EXECUTION_STATE_DEFINITIONS:
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
				(PrologmodelPackage.Literals.OPERATION__PARAMETERS,
				 PrologmodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__RETURN_VALUES,
				 PrologmodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__PROPERTY_DEFINITIONS,
				 PrologmodelFactory.eINSTANCE.createPropertyDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__RETURN_VALUE_ASSIGNMENTS,
				 PrologmodelFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__STATE_VARIABLES,
				 PrologmodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__DEFAULT_STATE_DEFINITIONS,
				 PrologmodelFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(PrologmodelPackage.Literals.OPERATION__POST_EXECUTION_STATE_DEFINITIONS,
				 PrologmodelFactory.eINSTANCE.createVariableAssignment()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PrologmodelPackage.Literals.OPERATION__PARAMETERS ||
			childFeature == PrologmodelPackage.Literals.OPERATION__RETURN_VALUES ||
			childFeature == PrologmodelPackage.Literals.OPERATION__STATE_VARIABLES ||
			childFeature == PrologmodelPackage.Literals.OPERATION__RETURN_VALUE_ASSIGNMENTS ||
			childFeature == PrologmodelPackage.Literals.OPERATION__DEFAULT_STATE_DEFINITIONS ||
			childFeature == PrologmodelPackage.Literals.OPERATION__POST_EXECUTION_STATE_DEFINITIONS;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
