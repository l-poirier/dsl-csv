package fr.irisa.generator

import com.opencsv.CSVParserBuilder
import com.opencsv.CSVReaderBuilder
import com.opencsv.CSVWriterBuilder
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
import java.io.FileWriter
import java.io.PrintWriter
import java.io.StringWriter
import java.util.ArrayList
import java.util.Arrays
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
		new File(csvReader.toList)
	}

	def static dispatch Object eval(Save e, InterpretationContext c) {
		val fileWriter = new FileWriter((eval(e.filename, c) as String))
		val csvWriter = (new CSVWriterBuilder(fileWriter)).withSeparator((eval(e.sep, c) as String).charAt(0)).build()
		val file = eval(e.file, c)
		if(! (file instanceof File)) {
			c.stderr += "[ERROR] SAVING NON FILE OBJECT\n"
			throw new RuntimeException()	
		}
		for(String[] sl : (file as File).content) {
			csvWriter.writeNext(sl)
		}
		""
	}

	def static dispatch Object eval(Select e, InterpretationContext c) {
		try {
			val vf = (eval(e.file, c) as File).content
			var feat = eval(e.features, c)
			if(feat instanceof Vector) {
				feat = (feat as Vector).content				
			} else if(feat instanceof String) {
				feat = new ArrayList<String>(Arrays.asList((feat as String)))
			} else if (feat instanceof Integer) {
				feat = new ArrayList<String>(Arrays.asList((feat as Integer).toString))
			}
			
			val vv = (feat as List<String>)

			if(vv.stream().allMatch[matches('\\d+')]) {
				val il = vv.stream().map[i | Integer.parseInt(i)].toList()
				
				new File(vf.map[sl |
					IntStream.range(0, vf.get(0).length)
					.filter[i | il.contains(i)]
					.mapToObj[i | sl.get(i)].toArray as String[]])
			} else {
				new File(vf.map[sl |
					IntStream.range(0, vf.get(0).length)
					.filter[i | vv.contains(vf.get(0).get(i))]
					.mapToObj[i | sl.get(i)].toArray as String[]])
			}
		} catch (ClassCastException exc) {
			c.stderr += "[ERROR] SELECTING WITH WRONG OBJECT TYPES\n"
			val sw = new StringWriter()
			val pw = new PrintWriter(sw)
			exc.printStackTrace(pw)
			c.stderr += sw.toString + '\n'
			''
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
		val preout = eval(e.expr, c)
		var out = ""
		
		if(preout instanceof File) {
			for(String[] sl: (preout as File).content) {
				for(String s: sl) {
					out += s + '\t'
				}
			}
		} else {
			out = preout.toString + "\n"
		}

		c.stdout += out
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
		c.variables.get(e.^var)
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
								default:
									throw new RuntimeException('Unknown operator ' + e.op)
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
		e.constVector.map[eval(it, c)]
	}

	def static dispatch Object eval(EList<Expression> e, InterpretationContext c) {
		e.forEach[eval(it, c)]
		c
	}
}
