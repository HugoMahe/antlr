package syntaxSat.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import hello1.generated.Hello1Parser.MeetingContext;



public class Example1 {
	String input ="Test syntax";
	CharStream stream = CharStreams.fromString(input);
	TokenStream tokens = new CommonTokenStream(new SyntaxSatLexer(stream));
	SyntaxSatParser parser = new SyntaxSatParser(tokens);
	ParseTree tree = parser.meeting();
	
	System.out.println(tree.toStringTree());
	
	MeetingContext o = (MeetingContext) tree;

	System.out.println(o.toStringTree());

	System.out.println(o.met);
}
