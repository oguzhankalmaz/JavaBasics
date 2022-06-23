package com.syntax.class04;

public class MoreExamples {
	public static void main (String[] args) {
		
		boolean mothersDay= false;
		if (mothersDay) {	//mothersDay is already boolean.no need to use mothersDay==true.
			System.out.println("Happy Mother's Day!");
		}else {
			System.out.println("Hello!");
		}
		
		//Another example:
		
		boolean rain=true;
		if (rain) {
			System.out.println("I will take an umbrella");
		}else {
			System.out.println("No need for umbrella");
		}
		
		/*
		 * write a program to check whether a number is positive or negative
		 */
		
		double num=0.0;
		if (num>0.0) {
			System.out.println(num+" is positive");
		}else if (num<0.0) {
			System.out.println(num+" is negative");
		}else if (num==0.0) {
			System.out.println("Number is zero");
		}else {
			System.out.println("Enter a number");
		}
	}

}
