/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.impl;

import fr.irisa.dslCsv.ConstNat;
import fr.irisa.dslCsv.DslCsvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Nat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.impl.ConstNatImpl#getConstNat <em>Const Nat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstNatImpl extends BaseExpressionImpl implements ConstNat
{
  /**
   * The default value of the '{@link #getConstNat() <em>Const Nat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstNat()
   * @generated
   * @ordered
   */
  protected static final int CONST_NAT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConstNat() <em>Const Nat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstNat()
   * @generated
   * @ordered
   */
  protected int constNat = CONST_NAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstNatImpl()
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
    return DslCsvPackage.Literals.CONST_NAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getConstNat()
  {
    return constNat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstNat(int newConstNat)
  {
    int oldConstNat = constNat;
    constNat = newConstNat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslCsvPackage.CONST_NAT__CONST_NAT, oldConstNat, constNat));
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
      case DslCsvPackage.CONST_NAT__CONST_NAT:
        return getConstNat();
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
      case DslCsvPackage.CONST_NAT__CONST_NAT:
        setConstNat((Integer)newValue);
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
      case DslCsvPackage.CONST_NAT__CONST_NAT:
        setConstNat(CONST_NAT_EDEFAULT);
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
      case DslCsvPackage.CONST_NAT__CONST_NAT:
        return constNat != CONST_NAT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (constNat: ");
    result.append(constNat);
    result.append(')');
    return result.toString();
  }

} //ConstNatImpl
