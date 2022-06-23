package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor. In order to eligible
		 * to donate your blood you have to be 18 years old. Also once you
		 * identify age eligibility then we have to see if person weight more
		 * than 110 lbs--> then he/she is eligible, otherwise we cannot 
		 * accept such a patient.
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("What is your weight?");
			int weight=input.nextInt();
			if (weight>110) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donate blood");
			}
		}else {
			System.out.println("You are not eligible to donate blood");
		}

	}

}
