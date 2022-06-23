package com.syntax.class04;

import java.util.Scanner;

public class UserInputScanner {
	public static void main (String[] args) {
		
		/*
		 * The Scanner class is used to get user input, and it is 
found in the java.util package.
The Scanner class is used for reading in primitive 
data types like int, double, float, etc., and objects of 
type String.
 To read strings, we use next()
 To read sentences, we use nextLine()
 To read number values, we use nextInt()
 To read decimal values, we use nextDouble()
 To read a single character, we use next().charAt(0)
		 */
		
		//creating a scanner
		Scanner input=new Scanner(System.in);
		
		//send instruction to the console
		System.out.println("Please enter your name");
		
		//we need to grab the values from console
		String name=input.next();
		
		System.out.println(name);
		
		//let's send another instruction
		System.out.println("Please enter your age");
		
		//capture and store age
		int age=input.nextInt();
		
		System.out.println(name+" is "+age+" years old.");
		
	}

}
