/*
 * generated by Xtext 2.11.0
 */
package ac.soton.xeventb.xstatemachine.parser.antlr;

import ac.soton.xeventb.xstatemachine.parser.antlr.internal.InternalXStatemachineParser;
import ac.soton.xeventb.xstatemachine.services.XStatemachineGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XStatemachineParser extends AbstractAntlrParser {

	@Inject
	private XStatemachineGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXStatemachineParser createParser(XtextTokenStream stream) {
		return new InternalXStatemachineParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Statemachine";
	}

	public XStatemachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XStatemachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
