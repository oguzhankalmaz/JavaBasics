package com.syntax.class12;

import java.util.Scanner;

public class StringDemo4 {

	public static void main(String[] args) {
		/*
		 * Checking if two string class are equal or not
		 */
		
		String name="kat";
		String name2="kat";
		System.out.println(name.equals(name2));//-->true
		
		//with ignore case:
		String name3="KaT";
		String name4="kat";
		System.out.println(name3.equalsIgnoreCase(name4));//-->true
		
		/*
		 * Example:
		 * 1.Ask user input a user name, password and password confirmation
		 * 2.Check password and password confirmations are matching or not
		 * 3.Check user name/password/password confirmation fields are empty
		 * or not. If it is empty, prompt a warning and ask again
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a user name:");
		String userName=input.next();
		do {
			System.out.println("User name cannot be empty");
			System.out.println("Please enter a user name:");
			userName=input.next();
		}while (userName.isEmpty());
		
		System.out.println("Please enter password:");
		String password=input.next();
		do {
			System.out.println("Password cannot be empty");
			System.out.println("Please enter password:");
			password=input.next();
		}while (password.isEmpty());
		
		System.out.println("Please confirm your password:");
		String confirmPassword=input.next();
		do {
			System.out.println("Password confirmation cannot be empty");
			System.out.println("Please confirm your password:");
			confirmPassword=input.next();
		}while (confirmPassword.isEmpty());
		
		do {
			System.out.println("Passwords did not match");
			System.out.println("Please confirm your password:");
			confirmPassword=input.next();
		}while (!password.equals(confirmPassword));
		

	}

}
