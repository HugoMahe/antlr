package hello2.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import hello2.generated.Hello2Lexer;
import hello2.generated.Hello2Parser;

public class Example1 {

	public static void main(String[] args) {
		String input = "lundi : Sleeping 10; Practice swimming 1; Meeting John;"
				+ "mardi : Sleeping 7; Practice running 2; Meeting Bill;"
				+ "mercredi : Meeting Ralph;"
				+ "jeudi : None";
		CharStream stream = CharStreams.fromString(input);
		TokenStream tokens = new CommonTokenStream(new Hello2Lexer(stream));
		Hello2Parser parser = new Hello2Parser(tokens);
		ParseTree tree = parser.schedule();

		System.out.println(tree.toStringTree());
	}
}
