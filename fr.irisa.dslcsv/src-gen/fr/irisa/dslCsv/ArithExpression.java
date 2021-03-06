/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arith Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.dslCsv.ArithExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.ArithExpression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.irisa.dslCsv.ArithExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.irisa.dslCsv.DslCsvPackage#getArithExpression()
 * @model
 * @generated
 */
public interface ArithExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SubExpression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getArithExpression_Left()
   * @model containment="true"
   * @generated
   */
  SubExpression getLeft();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.ArithExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SubExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see fr.irisa.dslCsv.DslCsvPackage#getArithExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.ArithExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ArithExpression)
   * @see fr.irisa.dslCsv.DslCsvPackage#getArithExpression_Right()
   * @model containment="true"
   * @generated
   */
  ArithExpression getRight();

  /**
   * Sets the value of the '{@link fr.irisa.dslCsv.ArithExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ArithExpression value);

} // ArithExpression
