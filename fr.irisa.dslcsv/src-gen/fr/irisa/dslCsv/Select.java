/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.Select#getFile <em>File</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.Select#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends FuncCall
{
  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getSelect_File()
   * @model containment="true"
   * @generated
   */
  Expression getFile();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Select#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(Expression value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference.
   * @see #setFeatures(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getSelect_Features()
   * @model containment="true"
   * @generated
   */
  Expression getFeatures();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Select#getFeatures <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' containment reference.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(Expression value);

} // Select