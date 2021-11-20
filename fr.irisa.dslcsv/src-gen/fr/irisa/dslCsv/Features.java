/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.Features#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getFeatures()
 * @model
 * @generated
 */
public interface Features extends FuncCall
{
  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(Expression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getFeatures_File()
   * @model containment="true"
   * @generated
   */
  Expression getFile();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.Features#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(Expression value);

} // Features