package com.syntax.class08;

public class ForLoopIntro {

	public static void main(String[] args) {
		/*
		 * FOR LOOP:
		 * executes block of code as long as condition is true.
		 * 
		 * For loop is the best choice to use when know how many
		 * times we want/need to repeat block of code.
		 */
		
		/*
		 * FOR LOOP SYNTAX:
		 * 
		 * for (initialization; condition; increment/decrement) {
		 * 		block of code;
		 * 	}
		 * 
		 */

		//Example: I want to say GM 5 times:
		
		for (int i=1; i<=5; i++) { //-->(initialization; condition; increment/decrement)
			System.out.println("Good Morning");//-->block of code
		}
		
		
	}

}
