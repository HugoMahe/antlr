// Generated from Hello2.g4 by ANTLR 4.9
package hello2.generated;

// antlr exo2

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Hello2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Hello2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(Hello2Parser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#day_activity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_activity(Hello2Parser.Day_activityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(Hello2Parser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#activity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity(Hello2Parser.ActivityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#sleeping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSleeping(Hello2Parser.SleepingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#practice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPractice(Hello2Parser.PracticeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#meeting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeeting(Hello2Parser.MeetingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Hello2Parser#none}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone(Hello2Parser.NoneContext ctx);
}