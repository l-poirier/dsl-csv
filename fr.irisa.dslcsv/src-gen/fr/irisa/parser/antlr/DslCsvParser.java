/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.parser.antlr;

import com.google.inject.Inject;
import fr.irisa.parser.antlr.internal.InternalDslCsvParser;
import fr.irisa.services.DslCsvGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DslCsvParser extends AbstractAntlrParser {

	@Inject
	private DslCsvGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDslCsvParser createParser(XtextTokenStream stream) {
		return new InternalDslCsvParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public DslCsvGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslCsvGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
