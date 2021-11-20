/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.Assign#getVar <em>Var</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.Assign#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Expression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see fr.irisa.dslCsv.DslCsvPackage#getAssign_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Assign#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getAssign_Val()
   * @model containment="true"
   * @generated
   */
  Expression getVal();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Assign#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Expression value);

} // Assign
