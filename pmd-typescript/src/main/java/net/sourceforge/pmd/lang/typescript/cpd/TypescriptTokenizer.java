/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.typescript.cpd;

import org.antlr.v4.runtime.CharStream;

import net.sourceforge.pmd.cpd.AntlrTokenizer;
import net.sourceforge.pmd.cpd.SourceCode;
import net.sourceforge.pmd.lang.antlr.AntlrTokenManager;
import net.sourceforge.pmd.lang.typescript.ast.TypeScriptLexer;

public class TypescriptTokenizer extends AntlrTokenizer {

    @Override
    protected AntlrTokenManager getLexerForSource(SourceCode sourceCode) {
        CharStream charStream = AntlrTokenizer.getCharStreamFromSourceCode(sourceCode);
        return new AntlrTokenManager(new TypeScriptLexer(charStream), sourceCode.getFileName());
    }
}
