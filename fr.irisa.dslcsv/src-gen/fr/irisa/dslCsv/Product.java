/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.Product#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends FuncCall
{
  /**
   * Returns the value of the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector</em>' containment reference.
   * @see #setVector(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getProduct_Vector()
   * @model containment="true"
   * @generated
   */
  Expression getVector();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Product#getVector <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' containment reference.
   * @see #getVector()
   * @generated
   */
  void setVector(Expression value);

} // Product