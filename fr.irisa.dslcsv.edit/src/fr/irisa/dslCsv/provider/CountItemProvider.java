/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.provider;


import fr.irisa.dslCsv.Count;
import fr.irisa.dslCsv.DslCsvFactory;
import fr.irisa.dslCsv.DslCsvPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.dslCsv.Count} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CountItemProvider extends FuncCallItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountItemProvider(AdapterFactory adapterFactory) {
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DslCsvPackage.Literals.COUNT__VECTOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Count.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Count"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Count_type");
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

		switch (notification.getFeatureID(Count.class)) {
			case DslCsvPackage.COUNT__VECTOR:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.COUNT__VECTOR,
				 DslCsvFactory.eINSTANCE.createAcquire()));
	}

}
