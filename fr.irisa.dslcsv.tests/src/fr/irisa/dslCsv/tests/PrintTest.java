/**
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.tests;

import fr.irisa.dslCsv.DslCsvFactory;
import fr.irisa.dslCsv.Print;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintTest extends FuncCallTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrintTest.class);
	}

	/**
	 * Constructs a new Print test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Print test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Print getFixture() {
		return (Print)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslCsvFactory.eINSTANCE.createPrint());
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

} //PrintTest