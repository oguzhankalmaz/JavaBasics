package com.syntax.class04;

public class ExampleTask {
	public static void main (String[] args) {
		/*
		 * write a program to store a value whether user has diploma or not.
		 * if user has a diploma, you should say congratulations, otherwise
		 * program should suggest to get a degree. then if user has a degree,
		 * program should check a gpa score. if gpa higher or equals to 3.5,
		 * output-->"You are eligible for scholarship"
		 * otherwise output-->"You should have studied harder"
		 */
		
		boolean diploma=true;
		double gpa=3.4;
		
		if (diploma) {
			System.out.println("Congratulations!");
			if (gpa>=3.5) {
				System.out.println("You are eligible for a scholarship.");
			}else {
				System.out.println("You should have studied harder.");
			}
		}else {
			System.out.println("You should get a degree.");
		}
		
				
		
		/*
		 * create a java program and store values of mortgage rate and mortgage
		 * price. First, program should check if rate is higher than 4.5 user will 
		 * not buy a house, otherwise user will consider buying. once user decides
		 * to buy a house, if price of the house is larger than 50000 than user
		 * will take a loan, otherwise user will pay cash.
		 */
		
		double mortgageRate=4.4;
		double mortgagePrice=40000.0;
		
		if (mortgageRate>=4.5) {
			System.out.println("User will not buy a house.");
		}else {
			if (mortgagePrice>=50000) {
				System.out.println("User will take a loan.");
			}else {
				System.out.println("User will pay cash.");
			}
		}
		
		
	}

}
