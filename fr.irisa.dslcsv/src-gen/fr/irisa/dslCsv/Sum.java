/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.Sum#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends FuncCall
{
  /**
   * Returns the value of the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector</em>' containment reference.
   * @see #setVector(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getSum_Vector()
   * @model containment="true"
   * @generated
   */
  Expression getVector();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Sum#getVector <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' containment reference.
   * @see #getVector()
   * @generated
   */
  void setVector(Expression value);

} // Sum