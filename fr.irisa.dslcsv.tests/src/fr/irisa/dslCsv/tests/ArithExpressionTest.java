/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.tests;

import fr.irisa.dslCsv.ArithExpression;
import fr.irisa.dslCsv.DslCsvFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arith Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithExpressionTest extends TestCase {

	/**
	 * The fixture for this Arith Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArithExpressionTest.class);
	}

	/**
	 * Constructs a new Arith Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Arith Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArithExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Arith Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithExpression getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslCsvFactory.eINSTANCE.createArithExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ArithExpressionTest
