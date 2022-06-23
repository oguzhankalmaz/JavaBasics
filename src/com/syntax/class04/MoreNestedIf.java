package com.syntax.class04;

public class MoreNestedIf {
	public static void main (String[] args) {
		
		/*
		 * We need to check if repl assignments was completed.
		 * if you did 15 and more assignments ---> you did great job!
		 * if you did more than 10 ---> you did good!
		 * if you did less than 10 ---> try to complete all assignments
		 */
		
		boolean repl=true; //check whether any assignments are completed
		int assignment=9; //number of completed assignments
		
		if (repl) {
			System.out.println("How many assignments have you done?");
			if (assignment>=15) {
				System.out.println("You did great job!");
			}else if (assignment>=10) {
				System.out.println("You did good!");
			}else if (assignment<10) {
				System.out.println("Try to complete all assignments.");
			}
		}else {
			System.out.println("You should complete assignments.");
		}
		
	}

}
