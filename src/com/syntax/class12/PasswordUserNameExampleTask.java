package com.syntax.class12;

import java.util.Scanner;

public class PasswordUserNameExampleTask {

	public static void main(String[] args) {
		/*
		 * Example:
		 * 1.Ask user input a user name, password and password confirmation
		 * 2.Check password and password confirmations are matching or not
		 * 3.Check user name/password/password confirmation fields are empty
		 * or not. If it is empty, prompt a warning
		 * 4.If password length is less than 4, prompt a warning
		 * 5.If password contains user name, prompt a warning
		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a user name:");
		String userName=input.next();
		
		System.out.println("Please enter password:");
		String password=input.next();
		
		System.out.println("Please confirm your password:");
		String confirmPassword=input.next();
		
		if(password.isEmpty() || confirmPassword.isEmpty()) {
			System.out.println("Password cannot be empty");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("Passwords does not match");
		}else if(password.length()<4) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain user name");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		System.out.println(userName);
		System.out.println(password);
		System.out.println(confirmPassword);

	}

}
