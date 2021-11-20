/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.provider;


import fr.irisa.dslCsv.DslCsvFactory;
import fr.irisa.dslCsv.DslCsvPackage;
import fr.irisa.dslCsv.Save;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.dslCsv.Save} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SaveItemProvider extends FuncCallItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DslCsvPackage.Literals.SAVE__FILENAME);
			childrenFeatures.add(DslCsvPackage.Literals.SAVE__FILE);
			childrenFeatures.add(DslCsvPackage.Literals.SAVE__SEP);
			childrenFeatures.add(DslCsvPackage.Literals.SAVE__SAVE_HEADER);
			childrenFeatures.add(DslCsvPackage.Literals.SAVE__SAVE_ID);
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
	 * This returns Save.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Save"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Save_type");
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

		switch (notification.getFeatureID(Save.class)) {
			case DslCsvPackage.SAVE__FILENAME:
			case DslCsvPackage.SAVE__FILE:
			case DslCsvPackage.SAVE__SEP:
			case DslCsvPackage.SAVE__SAVE_HEADER:
			case DslCsvPackage.SAVE__SAVE_ID:
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
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILENAME,
				 DslCsvFactory.eINSTANCE.createAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__FILE,
				 DslCsvFactory.eINSTANCE.createAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SEP,
				 DslCsvFactory.eINSTANCE.createAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_HEADER,
				 DslCsvFactory.eINSTANCE.createAcquire()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createNop()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createFuncCall()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createDim()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createFeatures()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createMean()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createUnselect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DslCsvPackage.Literals.SAVE__SAVE_ID,
				 DslCsvFactory.eINSTANCE.createAcquire()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DslCsvPackage.Literals.SAVE__FILENAME ||
			childFeature == DslCsvPackage.Literals.SAVE__FILE ||
			childFeature == DslCsvPackage.Literals.SAVE__SEP ||
			childFeature == DslCsvPackage.Literals.SAVE__SAVE_HEADER ||
			childFeature == DslCsvPackage.Literals.SAVE__SAVE_ID;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}