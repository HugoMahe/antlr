// Generated from SyntaxSat.g4 by ANTLR 4.9
package syntaxSat.generated;

// antlr exo3

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxSatParser}.
 */
public interface SyntaxSatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxSatParser#commandes}.
	 * @param ctx the parse tree
	 */
	void enterCommandes(SyntaxSatParser.CommandesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxSatParser#commandes}.
	 * @param ctx the parse tree
	 */
	void exitCommandes(SyntaxSatParser.CommandesContext ctx);
}