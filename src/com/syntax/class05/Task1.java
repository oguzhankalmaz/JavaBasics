package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that will print whether it is a weekend or
		 * weekday. If any day from 1-5--->output "it is a weekday"
		 * 6-7---> output "it is a weekend"
		 * any other day---> "invalid day"
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number of the day");
		
		int day=input.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day>5 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		

	}

}
