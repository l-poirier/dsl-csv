/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.impl;

import fr.irisa.dslCsv.DslCsvPackage;
import fr.irisa.dslCsv.Expression;
import fr.irisa.dslCsv.Row;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.impl.RowImpl#getFile <em>File</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.impl.RowImpl#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends FuncCallImpl implements Row
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
   * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector()
   * @generated
   * @ordered
   */
  protected Expression vector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RowImpl()
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
    return DslCsvPackage.Literals.ROW;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslCsvPackage.ROW__FILE, oldFile, newFile);
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
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.ROW__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.ROW__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslCsvPackage.ROW__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getVector()
  {
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector(Expression newVector, NotificationChain msgs)
  {
    Expression oldVector = vector;
    vector = newVector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslCsvPackage.ROW__VECTOR, oldVector, newVector);
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
  public void setVector(Expression newVector)
  {
    if (newVector != vector)
    {
      NotificationChain msgs = null;
      if (vector != null)
        msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.ROW__VECTOR, null, msgs);
      if (newVector != null)
        msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslCsvPackage.ROW__VECTOR, null, msgs);
      msgs = basicSetVector(newVector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslCsvPackage.ROW__VECTOR, newVector, newVector));
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
      case DslCsvPackage.ROW__FILE:
        return basicSetFile(null, msgs);
      case DslCsvPackage.ROW__VECTOR:
        return basicSetVector(null, msgs);
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
      case DslCsvPackage.ROW__FILE:
        return getFile();
      case DslCsvPackage.ROW__VECTOR:
        return getVector();
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
      case DslCsvPackage.ROW__FILE:
        setFile((Expression)newValue);
        return;
      case DslCsvPackage.ROW__VECTOR:
        setVector((Expression)newValue);
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
      case DslCsvPackage.ROW__FILE:
        setFile((Expression)null);
        return;
      case DslCsvPackage.ROW__VECTOR:
        setVector((Expression)null);
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
      case DslCsvPackage.ROW__FILE:
        return file != null;
      case DslCsvPackage.ROW__VECTOR:
        return vector != null;
    }
    return super.eIsSet(featureID);
  }

} //RowImpl