package fr.irisa.generator

import com.opencsv.CSVParserBuilder
import com.opencsv.CSVReaderBuilder
import fr.irisa.dslCsv.Acquire
import fr.irisa.dslCsv.ArithExpression
import fr.irisa.dslCsv.Assign
import fr.irisa.dslCsv.Column
import fr.irisa.dslCsv.CompExpression
import fr.irisa.dslCsv.ConstNat
import fr.irisa.dslCsv.ConstStr
import fr.irisa.dslCsv.ConstVector
import fr.irisa.dslCsv.Count
import fr.irisa.dslCsv.Dim
import fr.irisa.dslCsv.Expression
import fr.irisa.dslCsv.Features
import fr.irisa.dslCsv.Filter
import fr.irisa.dslCsv.LogicalExpression
import fr.irisa.dslCsv.Nop
import fr.irisa.dslCsv.Parenthesis
import fr.irisa.dslCsv.Print
import fr.irisa.dslCsv.Product
import fr.irisa.dslCsv.Row
import fr.irisa.dslCsv.Save
import fr.irisa.dslCsv.Select
import fr.irisa.dslCsv.Sort
import fr.irisa.dslCsv.SubExpression
import fr.irisa.dslCsv.Sum
import fr.irisa.dslCsv.Unselect
import fr.irisa.dslCsv.Var
import fr.irisa.model.File
import fr.irisa.model.Vector
import java.io.FileReader
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.stream.IntStream
import org.eclipse.emf.common.util.EList

//class VarInfo {
//	Object value;
//	Type type;
//}
class InterpretationContext {
	public String stdout = "";
	public String stderr = "";
	public Map<String, Object> variables = new HashMap<String, Object>();
}

class ASTtoInterpretation {
	def static type javaToType(Object o) {
		switch (o) {
			Integer: type.INT
			String: type.STRING
			List: type.FILE
			default: type.UNKNOWN
		}
	}

	def static dispatch Object eval(Acquire e, InterpretationContext c) {
		val fileReader = new FileReader((eval(e.path, c) as String))
		val csvParser = (new CSVParserBuilder()).withSeparator((eval(e.sep, c) as String).charAt(0)).build()
		val csvReader = (new CSVReaderBuilder(fileReader)).withCSVParser(csvParser).build()
		csvReader.toList
	}

	def static dispatch Object eval(Save e, InterpretationContext c) {
		""
	}

	def static dispatch Object eval(Select e, InterpretationContext c) {
		val vf = eval(e.file, c)
		val vv = eval(e.features, c)
		try {
			if (vf instanceof List && vv instanceof List) {
				val l = (vf as List<String[]>)
				val f = (vv as List<String>)
				IntStream.range(0, l.get(0).length).filter[i | f.contains(l.get(0).get(i))].toArray.toList
			} else {
				c.stderr += vf.toString + "\n"
				c.stderr += vv.toString + "\n"
				c.stderr += "[ERROR] SELECTING WITH NON LIST OBJECT(S)\n"
			}
		} catch (ClassCastException exc) {
				c.stderr += vf.toString + "\n"
				c.stderr += vv.toString + "\n"
			c.stderr += "[ERROR] SELECTING WITH NON FILE OBJECT\n"
			eval(e.file, c)
		}

	}

	def static dispatch Object eval(Unselect e, InterpretationContext c) {
		new File()
	}

	def static dispatch Object eval(Filter e, InterpretationContext c) {
		new File()
	}

	def static dispatch Object eval(Sum e, InterpretationContext c) {
		new Vector()
	}

	def static dispatch Object eval(Product e, InterpretationContext c) {
		new Vector()
	}

	def static dispatch Object eval(Column e, InterpretationContext c) {
		new File()
	}

	def static dispatch Object eval(Row e, InterpretationContext c) {
		new File()
	}

	def static dispatch Object eval(Features e, InterpretationContext c) {
		new Vector()
	}

	def static dispatch Object eval(Print e, InterpretationContext c) {
//		c.stdout += eval(e.expr, c) + "\n"
//		return ""
		
		var out = eval(e.expr, c)
//		if (out instanceof List) {
//			val ol = (out as List<Object>)
//			if (ol.length > 0) {
//				if (ol.get(0) instanceof String[]) {
//					val l2d = (out as List<String[]>)
//					out = l2d.fold("[FILE]", [s, x|s + '\n' + x.fold("", [ss, y|ss + '\t' + y])])
//				} else
//					out = ol.fold("[VECTOR] ", [s, x|s + '\t' + x.toString])
//			}
//		}
		c.stdout += out + "\n"
	}

	def static dispatch Object eval(Dim e, InterpretationContext c) {

		new Vector()
	}

	def static dispatch Object eval(Sort e, InterpretationContext c) {
		new File()
	}

	def static dispatch Object eval(Count e, InterpretationContext c) {
		0
	}

	def static dispatch Object eval(Assign e, InterpretationContext c) {
		c.variables.put(e.^var, eval(e.^val, c))
	}

	def static dispatch Object eval(LogicalExpression e, InterpretationContext c) {
		val l = eval(e.left, c)

		if (e.op === null)
			l
		else {
			val r = eval(e.right, c)

			switch (l) {
				Integer:
					switch (r) {
						Integer:
							switch (e.op) {
								case '|':
									(l as int).bitwiseOr((r as int))
								case '&':
									(l as int).bitwiseAnd((r as int))
							}
						default:
							throw new TypeException(javaToType(l), javaToType(r))
					}
				default:
					throw new TypeException(javaToType(l), javaToType(r))
			}
		}
	}

	def static dispatch Object eval(Nop n, InterpretationContext c) {
		val e = eval(n.expr, c)

		switch (e) {
			Integer:
				e.bitwiseNot
			default:
				throw new TypeException(javaToType(e))
		}
	}

	// ('<'|'>'|'=='|'<='|'>='|'!=')
	def static dispatch Object eval(CompExpression e, InterpretationContext c) {
		var l = eval(e.left, c)

		if (e.op === null)
			return l
		else {
			switch (l) {
				Double: l = l
				Integer: l = l.doubleValue
			}

			var r = eval(e.right, c)

			switch (r) {
				Double: r = r
				Integer: r = r.doubleValue
			}

			var ld = Double.NaN
			try {
				ld = (l as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] left operator is not a number\n"
				ld = Double.NaN
			}

			var rd = Double.NaN
			try {
				rd = (r as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] right operator is not a number\n"
				rd = Double.NaN
			}

			switch (e.op) {
				case '<':
					ld < rd
				case '>':
					ld > rd
				case '==':
					l == r
				case '<=':
					ld <= rd
				case '>=':
					ld >= rd
				case '!=':
					l != r
			}
		}
	}

	def static dispatch Object eval(ArithExpression e, InterpretationContext c) {
		var l = eval(e.left, c)

		if (e.op === null)
			return l
		else {
			switch (l) {
				Double: l = l
				Integer: l = l.doubleValue
			}

			var r = eval(e.right, c)

			switch (r) {
				Double: r = r
				Integer: r = r.doubleValue
			}

			var ld = Double.NaN
			try {
				ld = (l as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] left operator is not a number\n"
				ld = Double.NaN
			}

			var rd = Double.NaN
			try {
				rd = (r as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] right operator is not a number\n"
				rd = Double.NaN
			}

			switch (e.op) {
				case '+':
					ld + rd
				case '-':
					ld - rd
			}
		}
	}

	def static dispatch Object eval(SubExpression e, InterpretationContext c) {
		var l = eval(e.left, c)

		if (e.op === null)
			return l
		else {

			switch (l) {
				Double: l = l
				Integer: l = l.doubleValue
				default: throw new TypeException(javaToType(l))
			}

			var r = eval(e.right, c)

			switch (r) {
				Double: r = r
				Integer: r = r.doubleValue
				default: throw new TypeException(javaToType(l))
			}

			var ld = Double.NaN
			try {
				ld = (l as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] left operator is not a number\n"
				ld = Double.NaN
			}

			var rd = Double.NaN
			try {
				rd = (r as Double)
			} catch (ClassCastException exception) {
				c.stderr += "[WARN] right operator is not a number\n"
				rd = Double.NaN
			}

			switch (e.op) {
				case '*':
					ld * rd
				case '/':
					ld / rd
				case '%':
					ld % rd
			}
		}
	}

	def static dispatch Object eval(Var e, InterpretationContext c) {
		if (c.variables.containsKey(e.^var))
			c.variables.get(e.^var)
		else
			throw new NullPointerException("Variable " + e.^var + " does not exist")
	}

	def static dispatch Object eval(ConstNat e, InterpretationContext c) {
		e.constNat
	}

	def static dispatch Object eval(ConstStr e, InterpretationContext c) {
		e.constStr
	}

	def static dispatch Object eval(Parenthesis e, InterpretationContext c) {
		eval(e.expr, c)
	}

	def static dispatch Object eval(ConstVector e, InterpretationContext c) {
		e.constVector
	}

	def static dispatch Object eval(EList<Expression> e, InterpretationContext c) {
		e.forEach[x|eval(x, c)]
		c
	}
}
