package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and then define if number is small,
		 * medium, or large.
		 * 1<small<10
		 * 11<medium<100
		 * 101<large<1000
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		
		double num=input.nextDouble();
		
		if (num>1 && num<=10) {
			System.out.println("Small number");
		}else if (num>10 && num<=100) {
			System.out.println("Medium number");
		}else if (num>100 && num<=1000) {
			System.out.println("Large number");
		}else {
			System.out.println("Invalid entry");
		}
		

	}

}
