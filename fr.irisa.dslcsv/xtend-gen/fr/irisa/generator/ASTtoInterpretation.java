package fr.irisa.generator;

import com.google.common.base.Objects;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;
import fr.irisa.dslCsv.Acquire;
import fr.irisa.dslCsv.ArithExpression;
import fr.irisa.dslCsv.Assign;
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
import fr.irisa.dslCsv.LogicalExpression;
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
import fr.irisa.model.File;
import fr.irisa.model.Vector;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ASTtoInterpretation {
  public static type javaToType(final Object o) {
    type _switchResult = null;
    boolean _matched = false;
    if (o instanceof Integer) {
      _matched=true;
      _switchResult = type.INT;
    }
    if (!_matched) {
      if (o instanceof String) {
        _matched=true;
        _switchResult = type.STRING;
      }
    }
    if (!_matched) {
      if (o instanceof List) {
        _matched=true;
        _switchResult = type.FILE;
      }
    }
    if (!_matched) {
      _switchResult = type.UNKNOWN;
    }
    return _switchResult;
  }
  
  protected static Object _eval(final Acquire e, final InterpretationContext c) {
    try {
      File _xblockexpression = null;
      {
        Object _eval = ASTtoInterpretation.eval(e.getPath(), c);
        final FileReader fileReader = new FileReader(((String) _eval));
        Object _eval_1 = ASTtoInterpretation.eval(e.getSep(), c);
        final CSVParser csvParser = new CSVParserBuilder().withSeparator(((String) _eval_1).charAt(0)).build();
        final CSVReader csvReader = new CSVReaderBuilder(fileReader).withCSVParser(csvParser).build();
        List<String[]> _list = IterableExtensions.<String[]>toList(csvReader);
        _xblockexpression = new File(_list);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _eval(final Save e, final InterpretationContext c) {
    try {
      String _xblockexpression = null;
      {
        Object _eval = ASTtoInterpretation.eval(e.getFilename(), c);
        final FileWriter fileWriter = new FileWriter(((String) _eval));
        Object _eval_1 = ASTtoInterpretation.eval(e.getSep(), c);
        final ICSVWriter csvWriter = new CSVWriterBuilder(fileWriter).withSeparator(((String) _eval_1).charAt(0)).build();
        final Object file = ASTtoInterpretation.eval(e.getFile(), c);
        if ((!(file instanceof File))) {
          String _stderr = c.stderr;
          c.stderr = (_stderr + "[ERROR] SAVING NON FILE OBJECT\n");
          throw new RuntimeException();
        }
        for (final String[] sl : ((File) file).content) {
          csvWriter.writeNext(sl);
        }
        _xblockexpression = "";
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _eval(final Select e, final InterpretationContext c) {
    Object _xtrycatchfinallyexpression = null;
    try {
      File _xblockexpression = null;
      {
        Object _eval = ASTtoInterpretation.eval(e.getFile(), c);
        final List<String[]> vf = ((File) _eval).content;
        Object feat = ASTtoInterpretation.eval(e.getFeatures(), c);
        if ((feat instanceof Vector)) {
          feat = ((Vector) feat).content;
        } else {
          if ((feat instanceof String)) {
            List<String> _asList = Arrays.<String>asList(((String) feat));
            ArrayList<String> _arrayList = new ArrayList<String>(_asList);
            feat = _arrayList;
          } else {
            if ((feat instanceof Integer)) {
              List<String> _asList_1 = Arrays.<String>asList(((Integer) feat).toString());
              ArrayList<String> _arrayList_1 = new ArrayList<String>(_asList_1);
              feat = _arrayList_1;
            }
          }
        }
        final List<String> vv = ((List<String>) feat);
        File _xifexpression = null;
        final Predicate<String> _function = (String it) -> {
          return it.matches("\\d+");
        };
        boolean _allMatch = vv.stream().allMatch(_function);
        if (_allMatch) {
          File _xblockexpression_1 = null;
          {
            final Function<String, Integer> _function_1 = (String i) -> {
              return Integer.valueOf(Integer.parseInt(i));
            };
            final List<Integer> il = vv.stream().<Integer>map(_function_1).toList();
            final Function1<String[], String[]> _function_2 = (String[] sl) -> {
              final IntPredicate _function_3 = (int i) -> {
                return il.contains(Integer.valueOf(i));
              };
              final IntFunction<String> _function_4 = (int i) -> {
                return sl[i];
              };
              Object[] _array = IntStream.range(0, vf.get(0).length).filter(_function_3).<String>mapToObj(_function_4).toArray();
              return ((String[]) _array);
            };
            List<String[]> _map = ListExtensions.<String[], String[]>map(vf, _function_2);
            _xblockexpression_1 = new File(_map);
          }
          _xifexpression = _xblockexpression_1;
        } else {
          final Function1<String[], String[]> _function_1 = (String[] sl) -> {
            final IntPredicate _function_2 = (int i) -> {
              return vv.contains(vf.get(0)[i]);
            };
            final IntFunction<String> _function_3 = (int i) -> {
              return sl[i];
            };
            Object[] _array = IntStream.range(0, vf.get(0).length).filter(_function_2).<String>mapToObj(_function_3).toArray();
            return ((String[]) _array);
          };
          List<String[]> _map = ListExtensions.<String[], String[]>map(vf, _function_1);
          _xifexpression = new File(_map);
        }
        _xblockexpression = _xifexpression;
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof ClassCastException) {
        final ClassCastException exc = (ClassCastException)_t;
        String _xblockexpression_1 = null;
        {
          String _stderr = c.stderr;
          c.stderr = (_stderr + "[ERROR] SELECTING WITH WRONG OBJECT TYPES\n");
          final StringWriter sw = new StringWriter();
          final PrintWriter pw = new PrintWriter(sw);
          exc.printStackTrace(pw);
          String _stderr_1 = c.stderr;
          String _string = sw.toString();
          String _plus = (_string + "\n");
          c.stderr = (_stderr_1 + _plus);
          _xblockexpression_1 = "";
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected static Object _eval(final Unselect e, final InterpretationContext c) {
    return new File();
  }
  
  protected static Object _eval(final Filter e, final InterpretationContext c) {
    return new File();
  }
  
  protected static Object _eval(final Sum e, final InterpretationContext c) {
    return new Vector();
  }
  
  protected static Object _eval(final Product e, final InterpretationContext c) {
    return new Vector();
  }
  
  protected static Object _eval(final Column e, final InterpretationContext c) {
    return new File();
  }
  
  protected static Object _eval(final Row e, final InterpretationContext c) {
    return new File();
  }
  
  protected static Object _eval(final Features e, final InterpretationContext c) {
    return new Vector();
  }
  
  protected static Object _eval(final Print e, final InterpretationContext c) {
    String _xblockexpression = null;
    {
      final Object preout = ASTtoInterpretation.eval(e.getExpr(), c);
      String out = "";
      if ((preout instanceof File)) {
        for (final String[] sl : ((File) preout).content) {
          for (final String s : sl) {
            String _out = out;
            out = (_out + (s + "\t"));
          }
        }
      } else {
        String _string = preout.toString();
        String _plus = (_string + "\n");
        out = _plus;
      }
      String _stdout = c.stdout;
      _xblockexpression = c.stdout = (_stdout + out);
    }
    return _xblockexpression;
  }
  
  protected static Object _eval(final Dim e, final InterpretationContext c) {
    return new Vector();
  }
  
  protected static Object _eval(final Sort e, final InterpretationContext c) {
    return new File();
  }
  
  protected static Object _eval(final Count e, final InterpretationContext c) {
    return Integer.valueOf(0);
  }
  
  protected static Object _eval(final Assign e, final InterpretationContext c) {
    Object _xblockexpression = null;
    {
      c.variables.put(e.getVar(), ASTtoInterpretation.eval(e.getVal(), c));
      _xblockexpression = c.variables.get(e.getVar());
    }
    return _xblockexpression;
  }
  
  protected static Object _eval(final LogicalExpression e, final InterpretationContext c) {
    try {
      Object _xblockexpression = null;
      {
        final Object l = ASTtoInterpretation.eval(e.getLeft(), c);
        Object _xifexpression = null;
        String _op = e.getOp();
        boolean _tripleEquals = (_op == null);
        if (_tripleEquals) {
          _xifexpression = l;
        } else {
          int _xblockexpression_1 = (int) 0;
          {
            final Object r = ASTtoInterpretation.eval(e.getRight(), c);
            int _switchResult = (int) 0;
            boolean _matched = false;
            if (l instanceof Integer) {
              _matched=true;
              int _switchResult_1 = (int) 0;
              boolean _matched_1 = false;
              if (r instanceof Integer) {
                _matched_1=true;
                int _switchResult_2 = (int) 0;
                String _op_1 = e.getOp();
                if (_op_1 != null) {
                  switch (_op_1) {
                    case "|":
                      _switchResult_2 = (((int) ((Integer) l).intValue()) | ((int) ((Integer) r).intValue()));
                      break;
                    case "&":
                      _switchResult_2 = (((int) ((Integer) l).intValue()) & ((int) ((Integer) r).intValue()));
                      break;
                    default:
                      String _op_2 = e.getOp();
                      String _plus = ("Unknown operator " + _op_2);
                      throw new RuntimeException(_plus);
                  }
                } else {
                  String _op_2 = e.getOp();
                  String _plus = ("Unknown operator " + _op_2);
                  throw new RuntimeException(_plus);
                }
                _switchResult_1 = _switchResult_2;
              }
              if (!_matched_1) {
                type _javaToType = ASTtoInterpretation.javaToType(l);
                type _javaToType_1 = ASTtoInterpretation.javaToType(r);
                throw new TypeException(_javaToType, _javaToType_1);
              }
              _switchResult = _switchResult_1;
            }
            if (!_matched) {
              type _javaToType = ASTtoInterpretation.javaToType(l);
              type _javaToType_1 = ASTtoInterpretation.javaToType(r);
              throw new TypeException(_javaToType, _javaToType_1);
            }
            _xblockexpression_1 = _switchResult;
          }
          _xifexpression = Integer.valueOf(_xblockexpression_1);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _eval(final Nop n, final InterpretationContext c) {
    try {
      int _xblockexpression = (int) 0;
      {
        final Object e = ASTtoInterpretation.eval(n.getExpr(), c);
        int _switchResult = (int) 0;
        boolean _matched = false;
        if (e instanceof Integer) {
          _matched=true;
          _switchResult = (~((Integer) e).intValue());
        }
        if (!_matched) {
          type _javaToType = ASTtoInterpretation.javaToType(e);
          throw new TypeException(_javaToType);
        }
        _xblockexpression = _switchResult;
      }
      return Integer.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _eval(final CompExpression e, final InterpretationContext c) {
    boolean _xblockexpression = false;
    {
      Object l = ASTtoInterpretation.eval(e.getLeft(), c);
      boolean _xifexpression = false;
      String _op = e.getOp();
      boolean _tripleEquals = (_op == null);
      if (_tripleEquals) {
        return l;
      } else {
        boolean _xblockexpression_1 = false;
        {
          boolean _matched = false;
          if (l instanceof Double) {
            _matched=true;
            l = l;
          }
          if (!_matched) {
            if (l instanceof Integer) {
              _matched=true;
              l = Double.valueOf(((Integer)l).doubleValue());
            }
          }
          Object r = ASTtoInterpretation.eval(e.getRight(), c);
          boolean _matched_1 = false;
          if (r instanceof Double) {
            _matched_1=true;
            r = r;
          }
          if (!_matched_1) {
            if (r instanceof Integer) {
              _matched_1=true;
              r = Double.valueOf(((Integer)r).doubleValue());
            }
          }
          double ld = Double.NaN;
          try {
            ld = (((Double) l)).doubleValue();
          } catch (final Throwable _t) {
            if (_t instanceof ClassCastException) {
              String _stderr = c.stderr;
              c.stderr = (_stderr + "[WARN] left operator is not a number\n");
              ld = Double.NaN;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          double rd = Double.NaN;
          try {
            rd = (((Double) r)).doubleValue();
          } catch (final Throwable _t) {
            if (_t instanceof ClassCastException) {
              String _stderr = c.stderr;
              c.stderr = (_stderr + "[WARN] right operator is not a number\n");
              rd = Double.NaN;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          boolean _switchResult_2 = false;
          String _op_1 = e.getOp();
          if (_op_1 != null) {
            switch (_op_1) {
              case "<":
                _switchResult_2 = (ld < rd);
                break;
              case ">":
                _switchResult_2 = (ld > rd);
                break;
              case "==":
                _switchResult_2 = Objects.equal(l, r);
                break;
              case "<=":
                _switchResult_2 = (ld <= rd);
                break;
              case ">=":
                _switchResult_2 = (ld >= rd);
                break;
              case "!=":
                _switchResult_2 = (!Objects.equal(l, r));
                break;
            }
          }
          _xblockexpression_1 = _switchResult_2;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected static Object _eval(final ArithExpression e, final InterpretationContext c) {
    double _xblockexpression = (double) 0;
    {
      Object l = ASTtoInterpretation.eval(e.getLeft(), c);
      double _xifexpression = (double) 0;
      String _op = e.getOp();
      boolean _tripleEquals = (_op == null);
      if (_tripleEquals) {
        return l;
      } else {
        double _xblockexpression_1 = (double) 0;
        {
          boolean _matched = false;
          if (l instanceof Double) {
            _matched=true;
            l = l;
          }
          if (!_matched) {
            if (l instanceof Integer) {
              _matched=true;
              l = Double.valueOf(((Integer)l).doubleValue());
            }
          }
          Object r = ASTtoInterpretation.eval(e.getRight(), c);
          boolean _matched_1 = false;
          if (r instanceof Double) {
            _matched_1=true;
            r = r;
          }
          if (!_matched_1) {
            if (r instanceof Integer) {
              _matched_1=true;
              r = Double.valueOf(((Integer)r).doubleValue());
            }
          }
          double ld = Double.NaN;
          try {
            ld = (((Double) l)).doubleValue();
          } catch (final Throwable _t) {
            if (_t instanceof ClassCastException) {
              String _stderr = c.stderr;
              c.stderr = (_stderr + "[WARN] left operator is not a number\n");
              ld = Double.NaN;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          double rd = Double.NaN;
          try {
            rd = (((Double) r)).doubleValue();
          } catch (final Throwable _t) {
            if (_t instanceof ClassCastException) {
              String _stderr = c.stderr;
              c.stderr = (_stderr + "[WARN] right operator is not a number\n");
              rd = Double.NaN;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          double _switchResult_2 = (double) 0;
          String _op_1 = e.getOp();
          if (_op_1 != null) {
            switch (_op_1) {
              case "+":
                _switchResult_2 = (ld + rd);
                break;
              case "-":
                _switchResult_2 = (ld - rd);
                break;
            }
          }
          _xblockexpression_1 = _switchResult_2;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return Double.valueOf(_xblockexpression);
  }
  
  protected static Object _eval(final SubExpression e, final InterpretationContext c) {
    try {
      double _xblockexpression = (double) 0;
      {
        Object l = ASTtoInterpretation.eval(e.getLeft(), c);
        double _xifexpression = (double) 0;
        String _op = e.getOp();
        boolean _tripleEquals = (_op == null);
        if (_tripleEquals) {
          return l;
        } else {
          double _xblockexpression_1 = (double) 0;
          {
            boolean _matched = false;
            if (l instanceof Double) {
              _matched=true;
              l = l;
            }
            if (!_matched) {
              if (l instanceof Integer) {
                _matched=true;
                l = Double.valueOf(((Integer)l).doubleValue());
              }
            }
            if (!_matched) {
              type _javaToType = ASTtoInterpretation.javaToType(l);
              throw new TypeException(_javaToType);
            }
            Object r = ASTtoInterpretation.eval(e.getRight(), c);
            boolean _matched_1 = false;
            if (r instanceof Double) {
              _matched_1=true;
              r = r;
            }
            if (!_matched_1) {
              if (r instanceof Integer) {
                _matched_1=true;
                r = Double.valueOf(((Integer)r).doubleValue());
              }
            }
            if (!_matched_1) {
              type _javaToType_1 = ASTtoInterpretation.javaToType(l);
              throw new TypeException(_javaToType_1);
            }
            double ld = Double.NaN;
            try {
              ld = (((Double) l)).doubleValue();
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                String _stderr = c.stderr;
                c.stderr = (_stderr + "[WARN] left operator is not a number\n");
                ld = Double.NaN;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            double rd = Double.NaN;
            try {
              rd = (((Double) r)).doubleValue();
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                String _stderr = c.stderr;
                c.stderr = (_stderr + "[WARN] right operator is not a number\n");
                rd = Double.NaN;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            double _switchResult_2 = (double) 0;
            String _op_1 = e.getOp();
            if (_op_1 != null) {
              switch (_op_1) {
                case "*":
                  _switchResult_2 = (ld * rd);
                  break;
                case "/":
                  _switchResult_2 = (ld / rd);
                  break;
                case "%":
                  _switchResult_2 = (ld % rd);
                  break;
              }
            }
            _xblockexpression_1 = _switchResult_2;
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return Double.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _eval(final Var e, final InterpretationContext c) {
    Object _xifexpression = null;
    boolean _containsKey = c.variables.containsKey(e.getVar());
    if (_containsKey) {
      _xifexpression = c.variables.get(e.getVar());
    } else {
      String _var = e.getVar();
      String _plus = ("Variable " + _var);
      String _plus_1 = (_plus + " does not exist");
      throw new NullPointerException(_plus_1);
    }
    return _xifexpression;
  }
  
  protected static Object _eval(final ConstNat e, final InterpretationContext c) {
    return Integer.valueOf(e.getConstNat());
  }
  
  protected static Object _eval(final ConstStr e, final InterpretationContext c) {
    return e.getConstStr();
  }
  
  protected static Object _eval(final Parenthesis e, final InterpretationContext c) {
    return ASTtoInterpretation.eval(e.getExpr(), c);
  }
  
  protected static Object _eval(final ConstVector e, final InterpretationContext c) {
    final Function1<Expression, Object> _function = (Expression it) -> {
      return ASTtoInterpretation.eval(it, c);
    };
    return ListExtensions.<Expression, Object>map(e.getConstVector(), _function);
  }
  
  protected static Object _eval(final EList<Expression> e, final InterpretationContext c) {
    InterpretationContext _xblockexpression = null;
    {
      final Consumer<Expression> _function = (Expression it) -> {
        ASTtoInterpretation.eval(it, c);
      };
      e.forEach(_function);
      _xblockexpression = c;
    }
    return _xblockexpression;
  }
  
  public static Object eval(final Object e, final InterpretationContext c) {
    if (e instanceof Acquire) {
      return _eval((Acquire)e, c);
    } else if (e instanceof Column) {
      return _eval((Column)e, c);
    } else if (e instanceof Count) {
      return _eval((Count)e, c);
    } else if (e instanceof Dim) {
      return _eval((Dim)e, c);
    } else if (e instanceof Features) {
      return _eval((Features)e, c);
    } else if (e instanceof Filter) {
      return _eval((Filter)e, c);
    } else if (e instanceof Print) {
      return _eval((Print)e, c);
    } else if (e instanceof Product) {
      return _eval((Product)e, c);
    } else if (e instanceof Row) {
      return _eval((Row)e, c);
    } else if (e instanceof Save) {
      return _eval((Save)e, c);
    } else if (e instanceof Select) {
      return _eval((Select)e, c);
    } else if (e instanceof Sort) {
      return _eval((Sort)e, c);
    } else if (e instanceof Sum) {
      return _eval((Sum)e, c);
    } else if (e instanceof Unselect) {
      return _eval((Unselect)e, c);
    } else if (e instanceof Assign) {
      return _eval((Assign)e, c);
    } else if (e instanceof ConstNat) {
      return _eval((ConstNat)e, c);
    } else if (e instanceof ConstStr) {
      return _eval((ConstStr)e, c);
    } else if (e instanceof ConstVector) {
      return _eval((ConstVector)e, c);
    } else if (e instanceof LogicalExpression) {
      return _eval((LogicalExpression)e, c);
    } else if (e instanceof Nop) {
      return _eval((Nop)e, c);
    } else if (e instanceof Parenthesis) {
      return _eval((Parenthesis)e, c);
    } else if (e instanceof Var) {
      return _eval((Var)e, c);
    } else if (e instanceof EList) {
      return _eval((EList<Expression>)e, c);
    } else if (e instanceof ArithExpression) {
      return _eval((ArithExpression)e, c);
    } else if (e instanceof CompExpression) {
      return _eval((CompExpression)e, c);
    } else if (e instanceof SubExpression) {
      return _eval((SubExpression)e, c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, c).toString());
    }
  }
}
