package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * Declare a variable rate
		 * If rate is more than 5 --> I am not buying a house (condition)
		 */
		double mortgageRate=5.5;
		if (mortgageRate>5) {
			
			System.out.println("I am not buying a house");
		}
		
		/*
		 * Declare two variables and check if num1 is bigger than num2
		 */
		int num1=99;
		int num2=10;
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		
		/*
		 * Declare temperature
		 * if temp is higher than 25 -->I will go for a walk
		 */
		int temp=20;
		if (temp>25) {
			System.out.println("I will go for a walk");
		}else {
			System.out.println("I am going to study Java");
		}
		
		
		char gender='f';
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("You like watching sports");
		}
		
		
		String browser="chrome";
		if (browser.equals("chrome")) {
			System.out.println("All test cases will be executed on chrome");
		}else {
			System.out.println("I am not executing any test cases");
		}
	}

}
