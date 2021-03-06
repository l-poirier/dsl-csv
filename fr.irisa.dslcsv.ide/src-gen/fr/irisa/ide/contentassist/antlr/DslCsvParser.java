/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.irisa.ide.contentassist.antlr.internal.InternalDslCsvParser;
import fr.irisa.services.DslCsvGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslCsvParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslCsvGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslCsvGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getLogicalExpressionAccess().getOpAlternatives_1_0_0(), "rule__LogicalExpression__OpAlternatives_1_0_0");
			builder.put(grammarAccess.getCompExpressionAccess().getOpAlternatives_1_0_0(), "rule__CompExpression__OpAlternatives_1_0_0");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAlternatives_1_0_0(), "rule__ArithExpression__OpAlternatives_1_0_0");
			builder.put(grammarAccess.getSubExpressionAccess().getOpAlternatives_1_0_0(), "rule__SubExpression__OpAlternatives_1_0_0");
			builder.put(grammarAccess.getBaseExpressionAccess().getAlternatives(), "rule__BaseExpression__Alternatives");
			builder.put(grammarAccess.getFuncCallAccess().getAlternatives(), "rule__FuncCall__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getProgramAccess().getGroup_1(), "rule__Program__Group_1__0");
			builder.put(grammarAccess.getAssignAccess().getGroup(), "rule__Assign__Group__0");
			builder.put(grammarAccess.getNopAccess().getGroup(), "rule__Nop__Group__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup(), "rule__LogicalExpression__Group__0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getGroup_1(), "rule__LogicalExpression__Group_1__0");
			builder.put(grammarAccess.getCompExpressionAccess().getGroup(), "rule__CompExpression__Group__0");
			builder.put(grammarAccess.getCompExpressionAccess().getGroup_1(), "rule__CompExpression__Group_1__0");
			builder.put(grammarAccess.getArithExpressionAccess().getGroup(), "rule__ArithExpression__Group__0");
			builder.put(grammarAccess.getArithExpressionAccess().getGroup_1(), "rule__ArithExpression__Group_1__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup(), "rule__SubExpression__Group__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup_1(), "rule__SubExpression__Group_1__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getConstVectorAccess().getGroup(), "rule__ConstVector__Group__0");
			builder.put(grammarAccess.getConstVectorAccess().getGroup_2(), "rule__ConstVector__Group_2__0");
			builder.put(grammarAccess.getCountAccess().getGroup(), "rule__Count__Group__0");
			builder.put(grammarAccess.getSortAccess().getGroup(), "rule__Sort__Group__0");
			builder.put(grammarAccess.getDimAccess().getGroup(), "rule__Dim__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getFeaturesAccess().getGroup(), "rule__Features__Group__0");
			builder.put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
			builder.put(grammarAccess.getSumAccess().getGroup(), "rule__Sum__Group__0");
			builder.put(grammarAccess.getMeanAccess().getGroup(), "rule__Mean__Group__0");
			builder.put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
			builder.put(grammarAccess.getUnselectAccess().getGroup(), "rule__Unselect__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getSaveAccess().getGroup(), "rule__Save__Group__0");
			builder.put(grammarAccess.getAcquireAccess().getGroup(), "rule__Acquire__Group__0");
			builder.put(grammarAccess.getProgramAccess().getExprAssignment_0(), "rule__Program__ExprAssignment_0");
			builder.put(grammarAccess.getProgramAccess().getExprAssignment_1_1(), "rule__Program__ExprAssignment_1_1");
			builder.put(grammarAccess.getAssignAccess().getVarAssignment_0(), "rule__Assign__VarAssignment_0");
			builder.put(grammarAccess.getAssignAccess().getValAssignment_2(), "rule__Assign__ValAssignment_2");
			builder.put(grammarAccess.getNopAccess().getExprAssignment_1(), "rule__Nop__ExprAssignment_1");
			builder.put(grammarAccess.getLogicalExpressionAccess().getLeftAssignment_0(), "rule__LogicalExpression__LeftAssignment_0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getOpAssignment_1_0(), "rule__LogicalExpression__OpAssignment_1_0");
			builder.put(grammarAccess.getLogicalExpressionAccess().getRightAssignment_1_1(), "rule__LogicalExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getCompExpressionAccess().getLeftAssignment_0(), "rule__CompExpression__LeftAssignment_0");
			builder.put(grammarAccess.getCompExpressionAccess().getOpAssignment_1_0(), "rule__CompExpression__OpAssignment_1_0");
			builder.put(grammarAccess.getCompExpressionAccess().getRightAssignment_1_1(), "rule__CompExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getArithExpressionAccess().getLeftAssignment_0(), "rule__ArithExpression__LeftAssignment_0");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAssignment_1_0(), "rule__ArithExpression__OpAssignment_1_0");
			builder.put(grammarAccess.getArithExpressionAccess().getRightAssignment_1_1(), "rule__ArithExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getSubExpressionAccess().getLeftAssignment_0(), "rule__SubExpression__LeftAssignment_0");
			builder.put(grammarAccess.getSubExpressionAccess().getOpAssignment_1_0(), "rule__SubExpression__OpAssignment_1_0");
			builder.put(grammarAccess.getSubExpressionAccess().getRightAssignment_1_1(), "rule__SubExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getVarAccess().getVarAssignment(), "rule__Var__VarAssignment");
			builder.put(grammarAccess.getConstNatAccess().getConstNatAssignment(), "rule__ConstNat__ConstNatAssignment");
			builder.put(grammarAccess.getConstStrAccess().getConstStrAssignment(), "rule__ConstStr__ConstStrAssignment");
			builder.put(grammarAccess.getParenthesisAccess().getExprAssignment_1(), "rule__Parenthesis__ExprAssignment_1");
			builder.put(grammarAccess.getConstVectorAccess().getConstVectorAssignment_1(), "rule__ConstVector__ConstVectorAssignment_1");
			builder.put(grammarAccess.getConstVectorAccess().getConstVectorAssignment_2_1(), "rule__ConstVector__ConstVectorAssignment_2_1");
			builder.put(grammarAccess.getCountAccess().getVectorAssignment_2(), "rule__Count__VectorAssignment_2");
			builder.put(grammarAccess.getSortAccess().getFileAssignment_2(), "rule__Sort__FileAssignment_2");
			builder.put(grammarAccess.getSortAccess().getCriterionAssignment_4(), "rule__Sort__CriterionAssignment_4");
			builder.put(grammarAccess.getDimAccess().getExprAssignment_2(), "rule__Dim__ExprAssignment_2");
			builder.put(grammarAccess.getPrintAccess().getExprAssignment_2(), "rule__Print__ExprAssignment_2");
			builder.put(grammarAccess.getFeaturesAccess().getFileAssignment_2(), "rule__Features__FileAssignment_2");
			builder.put(grammarAccess.getRowAccess().getFileAssignment_2(), "rule__Row__FileAssignment_2");
			builder.put(grammarAccess.getRowAccess().getVectorAssignment_4(), "rule__Row__VectorAssignment_4");
			builder.put(grammarAccess.getColumnAccess().getFileAssignment_2(), "rule__Column__FileAssignment_2");
			builder.put(grammarAccess.getColumnAccess().getColumnNameAssignment_4(), "rule__Column__ColumnNameAssignment_4");
			builder.put(grammarAccess.getColumnAccess().getVectorAssignment_6(), "rule__Column__VectorAssignment_6");
			builder.put(grammarAccess.getProductAccess().getVectorAssignment_2(), "rule__Product__VectorAssignment_2");
			builder.put(grammarAccess.getSumAccess().getVectorAssignment_2(), "rule__Sum__VectorAssignment_2");
			builder.put(grammarAccess.getMeanAccess().getVectorAssignment_2(), "rule__Mean__VectorAssignment_2");
			builder.put(grammarAccess.getFilterAccess().getFileAssignment_2(), "rule__Filter__FileAssignment_2");
			builder.put(grammarAccess.getFilterAccess().getCondAssignment_4(), "rule__Filter__CondAssignment_4");
			builder.put(grammarAccess.getUnselectAccess().getFileAssignment_2(), "rule__Unselect__FileAssignment_2");
			builder.put(grammarAccess.getUnselectAccess().getFeaturesAssignment_4(), "rule__Unselect__FeaturesAssignment_4");
			builder.put(grammarAccess.getSelectAccess().getFileAssignment_2(), "rule__Select__FileAssignment_2");
			builder.put(grammarAccess.getSelectAccess().getFeaturesAssignment_4(), "rule__Select__FeaturesAssignment_4");
			builder.put(grammarAccess.getSaveAccess().getFilenameAssignment_2(), "rule__Save__FilenameAssignment_2");
			builder.put(grammarAccess.getSaveAccess().getFileAssignment_4(), "rule__Save__FileAssignment_4");
			builder.put(grammarAccess.getSaveAccess().getSepAssignment_6(), "rule__Save__SepAssignment_6");
			builder.put(grammarAccess.getSaveAccess().getSaveHeaderAssignment_8(), "rule__Save__SaveHeaderAssignment_8");
			builder.put(grammarAccess.getSaveAccess().getSaveIDAssignment_10(), "rule__Save__SaveIDAssignment_10");
			builder.put(grammarAccess.getAcquireAccess().getPathAssignment_2(), "rule__Acquire__PathAssignment_2");
			builder.put(grammarAccess.getAcquireAccess().getSepAssignment_4(), "rule__Acquire__SepAssignment_4");
			builder.put(grammarAccess.getAcquireAccess().getHasHeaderAssignment_6(), "rule__Acquire__HasHeaderAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslCsvGrammarAccess grammarAccess;

	@Override
	protected InternalDslCsvParser createParser() {
		InternalDslCsvParser result = new InternalDslCsvParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslCsvGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslCsvGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
