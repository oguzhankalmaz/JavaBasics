package com.syntax.class07;

public class LoopsInJava {

	public static void main(String[] args) {
		/*
		 * Loops in Java:
		 * 	What?
		 * 		Statement that executes block of code number of times
		 * 		based on the condition
		 * 	Why?
		 * 		Eliminate code redundancy
		 * 		
		 */
		
		/*
		 * We have these types loops:
		 * 	while
		 *  do while
		 *  for loop
		 *  enhanced for loop or advanced for loop or for-each loop
		 */
		
		/*
		 * WHILE LOOP:
		 * 	Repeats block of code based on the condition
		 */
		
		/*
		 * Infinite Loop:
		 * 
		 * int time=10;
		 *	while(time<12) {
		 *	System.out.println("Morning");
		 *
		 *We need a counter to exit out the loop
		 */
		
		int time=10;
		while(time<12) {
			System.out.println("Morning");
			time++; //COUNTER
		}

	}

}
