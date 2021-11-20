package fr.irisa.generator;

import fr.irisa.dslCsv.Acquire;
import fr.irisa.dslCsv.ArithExpression;
import fr.irisa.dslCsv.Assign;
import fr.irisa.dslCsv.BaseExpression;
import fr.irisa.dslCsv.Column;
import fr.irisa.dslCsv.CompExpression;
import fr.irisa.dslCsv.ConstNat;
import fr.irisa.dslCsv.ConstStr;
import fr.irisa.dslCsv.ConstVector;
import fr.irisa.dslCsv.Count;
import fr.irisa.dslCsv.Dim;
import fr.irisa.dslCsv.Expression;
import fr.irisa.dslCsv.Features;
import fr.irisa.dslCsv.Filter;
import fr.irisa.dslCsv.FuncCall;
import fr.irisa.dslCsv.LogicalExpression;
import fr.irisa.dslCsv.Mean;
import fr.irisa.dslCsv.Nop;
import fr.irisa.dslCsv.Parenthesis;
import fr.irisa.dslCsv.Print;
import fr.irisa.dslCsv.Product;
import fr.irisa.dslCsv.Row;
import fr.irisa.dslCsv.Save;
import fr.irisa.dslCsv.Select;
import fr.irisa.dslCsv.Sort;
import fr.irisa.dslCsv.SubExpression;
import fr.irisa.dslCsv.Sum;
import fr.irisa.dslCsv.Unselect;
import fr.irisa.dslCsv.Var;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ASTtoPP {
  public <T extends Object> T pop(final EList<T> l) {
    T _xifexpression = null;
    int _size = l.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      T _xblockexpression = null;
      {
        final T tmp = l.get(0);
        l.remove(0);
        _xblockexpression = tmp;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public String neutralized(final String s) {
    final Function2<String, Character, String> _function = (String acc, Character c) -> {
      Object _xifexpression = null;
      if (((c).charValue() == 92)) {
        _xifexpression = "\\\\";
      } else {
        _xifexpression = c;
      }
      return (acc + _xifexpression);
    };
    return IterableExtensions.<Character, String>fold(((Iterable<Character>)Conversions.doWrapArray(s.toCharArray())), "", _function);
  }
  
  public String eval(final EList<Expression> l) {
    String _xblockexpression = null;
    {
      final Function2<String, Expression, String> _function = (String s, Expression x) -> {
        String _evalExpr = this.evalExpr(x);
        String _plus = (s + _evalExpr);
        return (_plus + ";\n");
      };
      String s = IterableExtensions.<Expression, String>fold(l, "", _function);
      int _length = s.length();
      int _minus = (_length - 2);
      String _substring = s.substring(0, _minus);
      _xblockexpression = (_substring + "\n");
    }
    return _xblockexpression;
  }
  
  public String evalExpr(final Expression e) {
    String _xifexpression = null;
    if ((e instanceof FuncCall)) {
      _xifexpression = this.evalFuncCall(((FuncCall) e));
    } else {
      String _xifexpression_1 = null;
      if ((e instanceof Assign)) {
        String _var = ((Assign) e).getVar();
        String _plus = (_var + " = ");
        String _evalExpr = this.evalExpr(((Assign) e).getVal());
        _xifexpression_1 = (_plus + _evalExpr);
      } else {
        String _xifexpression_2 = null;
        if ((e instanceof LogicalExpression)) {
          _xifexpression_2 = this.evalMath(((LogicalExpression) e));
        } else {
          String _xifexpression_3 = null;
          if ((e instanceof Nop)) {
            String _evalExpr_1 = this.evalExpr(((Nop) e).getExpr());
            _xifexpression_3 = ("!" + _evalExpr_1);
          } else {
            _xifexpression_3 = "### [UNKNOWN] ###";
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String evalMath(final LogicalExpression e) {
    String _evalMath = this.evalMath(e.getLeft());
    String _xifexpression = null;
    LogicalExpression _right = e.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = e.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _evalMath_1 = this.evalMath(e.getRight());
      _xifexpression = (_plus_1 + _evalMath_1);
    }
    return (_evalMath + _xifexpression);
  }
  
  public String evalMath(final CompExpression e) {
    String _evalMath = this.evalMath(e.getLeft());
    String _xifexpression = null;
    CompExpression _right = e.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = e.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _evalMath_1 = this.evalMath(e.getRight());
      _xifexpression = (_plus_1 + _evalMath_1);
    }
    return (_evalMath + _xifexpression);
  }
  
  public String evalMath(final ArithExpression e) {
    String _evalMath = this.evalMath(e.getLeft());
    String _xifexpression = null;
    ArithExpression _right = e.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = e.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _evalMath_1 = this.evalMath(e.getRight());
      _xifexpression = (_plus_1 + _evalMath_1);
    }
    return (_evalMath + _xifexpression);
  }
  
  public String evalMath(final SubExpression e) {
    String _evalMath = this.evalMath(e.getLeft());
    String _xifexpression = null;
    SubExpression _right = e.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = e.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _evalMath_1 = this.evalMath(e.getRight());
      _xifexpression = (_plus_1 + _evalMath_1);
    }
    return (_evalMath + _xifexpression);
  }
  
  public String evalMath(final BaseExpression e) {
    String _xifexpression = null;
    if ((e instanceof Var)) {
      _xifexpression = ((Var) e).getVar();
    } else {
      String _xifexpression_1 = null;
      if ((e instanceof Parenthesis)) {
        String _evalExpr = this.evalExpr(((Parenthesis) e).getExpr());
        String _plus = ("(" + _evalExpr);
        _xifexpression_1 = (_plus + ")");
      } else {
        String _xifexpression_2 = null;
        if ((e instanceof ConstStr)) {
          String _neutralized = this.neutralized(((ConstStr) e).getConstStr());
          String _plus_1 = ("\"" + _neutralized);
          _xifexpression_2 = (_plus_1 + "\"");
        } else {
          String _xifexpression_3 = null;
          if ((e instanceof ConstNat)) {
            _xifexpression_3 = String.valueOf(((ConstNat) e).getConstNat());
          } else {
            String _xifexpression_4 = null;
            if ((e instanceof ConstVector)) {
              final Function2<String, Expression, String> _function = (String s, Expression x) -> {
                String _evalExpr_1 = this.evalExpr(x);
                return ((s + "\", \"") + _evalExpr_1);
              };
              String _fold = IterableExtensions.<Expression, String>fold(((ConstVector) e).getConstVector(), "", _function);
              String _plus_2 = ("{ " + _fold);
              _xifexpression_4 = (_plus_2 + "\" }");
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String evalFuncCall(final FuncCall f) {
    String _xifexpression = null;
    if ((f instanceof Acquire)) {
      String _evalExpr = this.evalExpr(((Acquire) f).getPath());
      String _plus = ("Acquire(" + _evalExpr);
      String _plus_1 = (_plus + ", ");
      String _evalExpr_1 = this.evalExpr(((Acquire) f).getSep());
      String _plus_2 = (_plus_1 + _evalExpr_1);
      String _plus_3 = (_plus_2 + ", ");
      String _evalExpr_2 = this.evalExpr(((Acquire) f).getHasHeader());
      String _plus_4 = (_plus_3 + _evalExpr_2);
      _xifexpression = (_plus_4 + ")");
    } else {
      String _xifexpression_1 = null;
      if ((f instanceof Save)) {
        String _evalExpr_3 = this.evalExpr(((Save) f).getFilename());
        String _plus_5 = ("Save(" + _evalExpr_3);
        String _plus_6 = (_plus_5 + ", ");
        String _evalExpr_4 = this.evalExpr(((Save) f).getFile());
        String _plus_7 = (_plus_6 + _evalExpr_4);
        String _plus_8 = (_plus_7 + ", ");
        String _evalExpr_5 = this.evalExpr(((Save) f).getSep());
        String _plus_9 = (_plus_8 + _evalExpr_5);
        String _plus_10 = (_plus_9 + ", ");
        String _evalExpr_6 = this.evalExpr(((Save) f).getSaveHeader());
        String _plus_11 = (_plus_10 + _evalExpr_6);
        String _plus_12 = (_plus_11 + ", ");
        String _evalExpr_7 = this.evalExpr(((Save) f).getSaveID());
        String _plus_13 = (_plus_12 + _evalExpr_7);
        _xifexpression_1 = (_plus_13 + ")");
      } else {
        String _xifexpression_2 = null;
        if ((f instanceof Select)) {
          String _evalExpr_8 = this.evalExpr(((Select) f).getFile());
          String _plus_14 = ("Select(" + _evalExpr_8);
          String _plus_15 = (_plus_14 + ", ");
          String _evalExpr_9 = this.evalExpr(((Select) f).getFeatures());
          String _plus_16 = (_plus_15 + _evalExpr_9);
          _xifexpression_2 = (_plus_16 + ")");
        } else {
          String _xifexpression_3 = null;
          if ((f instanceof Unselect)) {
            String _evalExpr_10 = this.evalExpr(((Unselect) f).getFile());
            String _plus_17 = ("Unselect(" + _evalExpr_10);
            String _plus_18 = (_plus_17 + ", ");
            String _evalExpr_11 = this.evalExpr(((Unselect) f).getFeatures());
            String _plus_19 = (_plus_18 + _evalExpr_11);
            _xifexpression_3 = (_plus_19 + ")");
          } else {
            String _xifexpression_4 = null;
            if ((f instanceof Filter)) {
              String _evalExpr_12 = this.evalExpr(((Filter) f).getFile());
              String _plus_20 = ("Filter(" + _evalExpr_12);
              String _plus_21 = (_plus_20 + ", ");
              String _evalExpr_13 = this.evalExpr(((Filter) f).getCond());
              String _plus_22 = (_plus_21 + _evalExpr_13);
              _xifexpression_4 = (_plus_22 + ")");
            } else {
              String _xifexpression_5 = null;
              if ((f instanceof Mean)) {
                String _evalExpr_14 = this.evalExpr(((Mean) f).getVector());
                String _plus_23 = ("Mean(" + _evalExpr_14);
                _xifexpression_5 = (_plus_23 + ")");
              } else {
                String _xifexpression_6 = null;
                if ((f instanceof Sum)) {
                  String _evalExpr_15 = this.evalExpr(((Sum) f).getVector());
                  String _plus_24 = ("Sum(" + _evalExpr_15);
                  _xifexpression_6 = (_plus_24 + ")");
                } else {
                  String _xifexpression_7 = null;
                  if ((f instanceof Product)) {
                    String _evalExpr_16 = this.evalExpr(((Product) f).getVector());
                    String _plus_25 = ("Product" + _evalExpr_16);
                    _xifexpression_7 = (_plus_25 + ")");
                  } else {
                    String _xifexpression_8 = null;
                    if ((f instanceof Column)) {
                      String _evalExpr_17 = this.evalExpr(((Column) f).getFile());
                      String _plus_26 = ("Column(" + _evalExpr_17);
                      String _plus_27 = (_plus_26 + ", ");
                      String _evalExpr_18 = this.evalExpr(((Column) f).getColumnName());
                      String _plus_28 = (_plus_27 + _evalExpr_18);
                      String _plus_29 = (_plus_28 + ", ");
                      String _evalExpr_19 = this.evalExpr(((Column) f).getVector());
                      String _plus_30 = (_plus_29 + _evalExpr_19);
                      _xifexpression_8 = (_plus_30 + ")");
                    } else {
                      String _xifexpression_9 = null;
                      if ((f instanceof Row)) {
                        String _evalExpr_20 = this.evalExpr(((Row) f).getFile());
                        String _plus_31 = ("Row(" + _evalExpr_20);
                        String _plus_32 = (_plus_31 + ", ");
                        String _evalExpr_21 = this.evalExpr(((Row) f).getVector());
                        String _plus_33 = (_plus_32 + _evalExpr_21);
                        _xifexpression_9 = (_plus_33 + ")");
                      } else {
                        String _xifexpression_10 = null;
                        if ((f instanceof Features)) {
                          String _evalExpr_22 = this.evalExpr(((Features) f).getFile());
                          String _plus_34 = ("Features(" + _evalExpr_22);
                          _xifexpression_10 = (_plus_34 + ")");
                        } else {
                          String _xifexpression_11 = null;
                          if ((f instanceof Print)) {
                            String _evalExpr_23 = this.evalExpr(((Print) f).getExpr());
                            String _plus_35 = ("Print(" + _evalExpr_23);
                            _xifexpression_11 = (_plus_35 + ")");
                          } else {
                            String _xifexpression_12 = null;
                            if ((f instanceof Dim)) {
                              String _evalExpr_24 = this.evalExpr(((Dim) f).getExpr());
                              String _plus_36 = ("Dim(" + _evalExpr_24);
                              _xifexpression_12 = (_plus_36 + ")");
                            } else {
                              String _xifexpression_13 = null;
                              if ((f instanceof Sort)) {
                                String _evalExpr_25 = this.evalExpr(((Sort) f).getFile());
                                String _plus_37 = ("Sort(" + _evalExpr_25);
                                String _plus_38 = (_plus_37 + ", ");
                                String _evalExpr_26 = this.evalExpr(((Sort) f).getCriterion());
                                String _plus_39 = (_plus_38 + _evalExpr_26);
                                _xifexpression_13 = (_plus_39 + ")");
                              } else {
                                String _xifexpression_14 = null;
                                if ((f instanceof Count)) {
                                  String _evalExpr_27 = this.evalExpr(((Count) f).getVector());
                                  String _plus_40 = ("Count(" + _evalExpr_27);
                                  _xifexpression_14 = (_plus_40 + ")");
                                } else {
                                  _xifexpression_14 = "### [UNKNOWN FUNCTION] ###";
                                }
                                _xifexpression_13 = _xifexpression_14;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
