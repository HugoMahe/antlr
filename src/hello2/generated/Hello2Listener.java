// Generated from Hello2.g4 by ANTLR 4.9
package hello2.generated;

// antlr exo2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Hello2Parser}.
 */
public interface Hello2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(Hello2Parser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(Hello2Parser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#day_activity}.
	 * @param ctx the parse tree
	 */
	void enterDay_activity(Hello2Parser.Day_activityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#day_activity}.
	 * @param ctx the parse tree
	 */
	void exitDay_activity(Hello2Parser.Day_activityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(Hello2Parser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(Hello2Parser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#activity}.
	 * @param ctx the parse tree
	 */
	void enterActivity(Hello2Parser.ActivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#activity}.
	 * @param ctx the parse tree
	 */
	void exitActivity(Hello2Parser.ActivityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#sleeping}.
	 * @param ctx the parse tree
	 */
	void enterSleeping(Hello2Parser.SleepingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#sleeping}.
	 * @param ctx the parse tree
	 */
	void exitSleeping(Hello2Parser.SleepingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#practice}.
	 * @param ctx the parse tree
	 */
	void enterPractice(Hello2Parser.PracticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#practice}.
	 * @param ctx the parse tree
	 */
	void exitPractice(Hello2Parser.PracticeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#meeting}.
	 * @param ctx the parse tree
	 */
	void enterMeeting(Hello2Parser.MeetingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#meeting}.
	 * @param ctx the parse tree
	 */
	void exitMeeting(Hello2Parser.MeetingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Hello2Parser#none}.
	 * @param ctx the parse tree
	 */
	void enterNone(Hello2Parser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Hello2Parser#none}.
	 * @param ctx the parse tree
	 */
	void exitNone(Hello2Parser.NoneContext ctx);
}