/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.provider;


import fr.irisa.dslCsv.Assign;
import fr.irisa.dslCsv.DslCsvFactory;
import fr.irisa.dslCsv.DslCsvPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.dslCsv.Assign} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignItemProvider(AdapterFactory adapterFactory) {
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

			addVarPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Var feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assign_var_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assign_var_feature", "_UI_Assign_type"),
				 DslCsvPackage.Literals.ASSIGN__VAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DslCsvPackage.Literals.ASSIGN__VAL);
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
	 * This returns Assign.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Assign"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Assign)object).getVar();
		return label == null || label.length() == 0 ?
			getString("_UI_Assign_type") :
			getString("_UI_Assign_type") + " " + label;
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

		switch (notification.getFeatureID(Assign.class)) {
			case DslCsvPackage.ASSIGN__VAR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DslCsvPackage.ASSIGN__VAL:
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
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.ASSIGN__VAL,
				 DslCsvFactory.eINSTANCE.createAcquire()));
	}

}
