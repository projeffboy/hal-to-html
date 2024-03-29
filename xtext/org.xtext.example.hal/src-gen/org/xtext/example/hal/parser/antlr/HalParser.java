/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.hal.parser.antlr.internal.InternalHalParser;
import org.xtext.example.hal.services.HalGrammarAccess;

public class HalParser extends AbstractAntlrParser {

	@Inject
	private HalGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHalParser createParser(XtextTokenStream stream) {
		return new InternalHalParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "HAL";
	}

	public HalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
