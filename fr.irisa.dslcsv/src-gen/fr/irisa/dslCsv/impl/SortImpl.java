/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.impl;

import fr.irisa.dslCsv.DslCsvPackage;
import fr.irisa.dslCsv.Expression;
import fr.irisa.dslCsv.Sort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.impl.SortImpl#getFile <em>File</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.impl.SortImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortImpl extends FuncCallImpl implements Sort
{
  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected Expression file;

  /**
   * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriterion()
   * @generated
   * @ordered
   */
  protected Expression criterion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslCsvPackage.Literals.SORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile(Expression newFile, NotificationChain msgs)
  {
    Expression oldFile = file;
    file = newFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslCsvPackage.SORT__FILE, oldFile, newFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile(Expression newFile)
  {
    if (newFile != file)
    {
      NotificationChain msgs = null;
      if (file != null)
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.SORT__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.SORT__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslCsvPackage.SORT__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCriterion()
  {
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCriterion(Expression newCriterion, NotificationChain msgs)
  {
    Expression oldCriterion = criterion;
    criterion = newCriterion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslCsvPackage.SORT__CRITERION, oldCriterion, newCriterion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCriterion(Expression newCriterion)
  {
    if (newCriterion != criterion)
    {
      NotificationChain msgs = null;
      if (criterion != null)
        msgs = ((InternalEObject)criterion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.SORT__CRITERION, null, msgs);
      if (newCriterion != null)
        msgs = ((InternalEObject)newCriterion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.SORT__CRITERION, null, msgs);
      msgs = basicSetCriterion(newCriterion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslCsvPackage.SORT__CRITERION, newCriterion, newCriterion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslCsvPackage.SORT__FILE:
        return basicSetFile(null, msgs);
      case DslCsvPackage.SORT__CRITERION:
        return basicSetCriterion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslCsvPackage.SORT__FILE:
        return getFile();
      case DslCsvPackage.SORT__CRITERION:
        return getCriterion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslCsvPackage.SORT__FILE:
        setFile((Expression)newValue);
        return;
      case DslCsvPackage.SORT__CRITERION:
        setCriterion((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslCsvPackage.SORT__FILE:
        setFile((Expression)null);
        return;
      case DslCsvPackage.SORT__CRITERION:
        setCriterion((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslCsvPackage.SORT__FILE:
        return file != null;
      case DslCsvPackage.SORT__CRITERION:
        return criterion != null;
    }
    return super.eIsSet(featureID);
  }

} //SortImpl