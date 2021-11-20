/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.provider;


import fr.irisa.dslCsv.DslCsvFactory;
import fr.irisa.dslCsv.DslCsvPackage;
import fr.irisa.dslCsv.Parenthesis;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.dslCsv.Parenthesis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParenthesisItemProvider extends BaseExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesisItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DslCsvPackage.Literals.PARENTHESIS__EXPR);
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
	 * This returns Parenthesis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parenthesis"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Parenthesis_type");
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

		switch (notification.getFeatureID(Parenthesis.class)) {
			case DslCsvPackage.PARENTHESIS__EXPR:
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
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.PARENTHESIS__EXPR,
				 DslCsvFactory.eINSTANCE.createAcquire()));
	}

}
