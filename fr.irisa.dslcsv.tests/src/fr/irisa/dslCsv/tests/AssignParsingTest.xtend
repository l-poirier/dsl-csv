/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.dslCsv.tests

import com.google.inject.Inject
import fr.irisa.dslCsv.ArithExpression
import fr.irisa.dslCsv.Assign
import fr.irisa.dslCsv.CompExpression
import fr.irisa.dslCsv.ConstNat
import fr.irisa.dslCsv.ConstStr
import fr.irisa.dslCsv.ConstVector
import fr.irisa.dslCsv.LogicalExpression
import fr.irisa.dslCsv.Program
import fr.irisa.dslCsv.SubExpression
import fr.irisa.tests.DslCsvInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import fr.irisa.dslCsv.Var

@ExtendWith(InjectionExtension)
@InjectWith(DslCsvInjectorProvider)
class AssignParsingTest {
	@Inject
	ParseHelper<Program> parseHelper
	
	@Test
	def void NestedAssign() {
		val result = parseHelper.parse('''
			a=b=c
		''')
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		try {
			val a = result.expr.get(0) as Assign
			Assertions.assertEquals(a.^var, 'a')
			Assertions.assertEquals((a.^val as Assign).^var, "b")
		} catch(ClassCastException exc) {
			Assertions.fail("Wrong type in tests")
		} 
	}
	
	@Test
	def void ConstNatAssign() {
		val result = parseHelper.parse('''
			a=1
		''')
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		try {
			val a = result.expr.get(0) as Assign
			Assertions.assertEquals(a.^var, 'a')
			Assertions.assertEquals((((((a.^val
			as LogicalExpression).left
			as CompExpression).left
			as ArithExpression).left
			as SubExpression).left
			as ConstNat).constNat, 1)
		} catch(ClassCastException exc) {
			Assertions.fail("Wrong type in tests")
		}
	}

	@Test
	def void ComplexAssign() {
		val result = parseHelper.parse('''
			b={1, 2, 3} * c
		''')
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		try {
			val a = result.expr.get(0) as Assign
			Assertions.assertEquals(a.^var, 'b')
			(((((a.^val
			as LogicalExpression).left
			as CompExpression).left
			as ArithExpression).left
			as SubExpression).left
			as ConstVector)
			(((((a.^val
			as LogicalExpression).left
			as CompExpression).left
			as ArithExpression).left
			as SubExpression).right
			as Var)
			Assertions.assertEquals(((((a.^val
			as LogicalExpression).left
			as CompExpression).left
			as ArithExpression).left
			as SubExpression).op, "*")
		} catch(ClassCastException exc) {
			Assertions.fail("Wrong type in tests")
		} 
	}
	
	@Test
	def void ConstStrAssign() {
		val result = parseHelper.parse('''
			a="abc"
		''')
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		try {
			val a = result.expr.get(0) as Assign
			Assertions.assertEquals(a.^var, 'a')
			Assertions.assertEquals((((((a.^val
			as LogicalExpression).left
			as CompExpression).left
			as ArithExpression).left
			as SubExpression).left
			as ConstStr).constStr, "abc")
		} catch(ClassCastException exc) {
			Assertions.fail("Wrong type in tests")
		} 
	}
}
