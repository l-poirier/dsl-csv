package fr.irisa.generator

import fr.irisa.dslCsv.Acquire
import fr.irisa.dslCsv.ArithExpression
import fr.irisa.dslCsv.Assign
import fr.irisa.dslCsv.BaseExpression
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
import fr.irisa.dslCsv.FuncCall
import fr.irisa.dslCsv.LogicalExpression
import fr.irisa.dslCsv.Mean
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
import org.eclipse.emf.common.util.EList

class ASTtoPP {
	def <T> T pop(EList<T> l) {
		if (l.size > 0) {
			val tmp = l.get(0)
			l.remove(0)
			tmp
		} else
			null
	}
	
	def String neutralized(String s){
		s.toCharArray.fold("", [acc, c | acc + (c==92 ? "\\\\" : c)])
	}

	def String eval(EList<Expression> l) {
		var s = l.fold("", [s, x|s + evalExpr(x) + ";\n"])
		s.substring(0, s.length - 2) + "\n"
	}

	def String evalExpr(Expression e) {
		if (e instanceof FuncCall) {
			evalFuncCall(e as FuncCall)
		} else if (e instanceof Assign) {
			(e as Assign).^var + " = " + evalExpr((e as Assign).^val)
		} else if (e instanceof LogicalExpression) {
			evalMath(e as LogicalExpression)
		} else if (e instanceof Nop) {
			'!' + evalExpr((e as Nop).expr)
		} else {
			'### [UNKNOWN] ###'
		}
	}

	def String evalMath(LogicalExpression e) {
		evalMath(e.left) + ( e.right === null ? "" : " " + e.op + " " + evalMath(e.right))
	}

	def String evalMath(CompExpression e) {
		evalMath(e.left) + (e.right === null ? "" : " " + e.op + " " + evalMath(e.right))
	}

	def String evalMath(ArithExpression e) {
		evalMath(e.left) + (e.right === null ? "" : " " + e.op + " " + evalMath(e.right))
	}

	def String evalMath(SubExpression e) {
		evalMath(e.left) + (e.right === null ? "" : " " + e.op + " " + evalMath(e.right))
	}

	def String evalMath(BaseExpression e) {
		if (e instanceof Var) {
			(e as Var).^var
		} else if (e instanceof Parenthesis) {
			'(' + evalExpr((e as Parenthesis).expr) + ')'
		} else if (e instanceof ConstStr) {
			"\"" + (e as ConstStr).constStr.neutralized() + "\""
		} else if (e instanceof ConstNat) {
			String.valueOf((e as ConstNat).constNat)
		} else if (e instanceof ConstVector) {
			"{ " + (e as ConstVector).constVector.fold("", [s, x|s + "\", \"" + x.evalExpr]) + "\" }"
		}
	}

	def String evalFuncCall(FuncCall f) {
		if (f instanceof Acquire) {
			"Acquire(" + evalExpr((f as Acquire).path) + ", " + evalExpr((f as Acquire).sep) + ", " +
				evalExpr((f as Acquire).hasHeader) + ")"
		} else if (f instanceof Save) {
			"Save(" + evalExpr((f as Save).filename) + ", " + evalExpr((f as Save).file) + ", " +
				evalExpr((f as Save).sep) + ", " + evalExpr((f as Save).saveHeader) + ", " +
				evalExpr((f as Save).saveID) + ")"
		} else if (f instanceof Select) {
			"Select(" + evalExpr((f as Select).file) + ", " + evalExpr((f as Select).features) + ")"
		} else if (f instanceof Unselect) {
			"Unselect(" + evalExpr((f as Unselect).file) + ", " + evalExpr((f as Unselect).features) + ")"
		} else if (f instanceof Filter) {
			"Filter(" + evalExpr((f as Filter).file) + ", " + evalExpr((f as Filter).cond) + ")"
		} else if (f instanceof Mean) {
			"Mean(" + evalExpr((f as Mean).vector) + ")"
		} else if (f instanceof Sum) {
			"Sum(" + evalExpr((f as Sum).vector) + ")"
		} else if (f instanceof Product) {
			"Product" + evalExpr((f as Product).vector) + ")"
		} else if (f instanceof Column) {
			"Column(" + evalExpr((f as Column).file) + ", " + evalExpr((f as Column).columnName) + ", " +
				evalExpr((f as Column).vector) + ")"
		} else if (f instanceof Row) {
			"Row(" + evalExpr((f as Row).file) + ", " + evalExpr((f as Row).vector) + ")"
		} else if (f instanceof Features) {
			"Features(" + evalExpr((f as Features).file) + ")"
		} else if (f instanceof Print) {
			"Print(" + evalExpr((f as Print).expr) + ")"
		} else if (f instanceof Dim) {
			"Dim(" + evalExpr((f as Dim).expr) + ")"
		} else if (f instanceof Sort) {
			"Sort(" + evalExpr((f as Sort).file) + ", " + evalExpr((f as Sort).criterion) + ")"
		} else if (f instanceof Count) {
			"Count(" + evalExpr((f as Count).vector) + ")"
		} else {
			"### [UNKNOWN FUNCTION] ###"
		}
	}
}
