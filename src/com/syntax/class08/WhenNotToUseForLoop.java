package com.syntax.class08;

import java.util.Scanner;

public class WhenNotToUseForLoop {

	public static void main(String[] args) {
		//If you don't know how many times you need to repeat the code,
		//you can't use for loop. In this situation, do while loops 
		//are used. Check below example!
		
		/*
		 * declare a secret number,
		 * ask user to guess your secret number,
		 * your code should keep asking to guess until user guess, correctly
		 * once user gets the correct number, print--> "You got it!"
		 */
	int secretNum=25;
	int guessNum;
	
	Scanner input=new Scanner(System.in);
		
	do {
		System.out.println("Guess the secret number");
		guessNum=input.nextInt();
	}while (guessNum!=secretNum);
	System.out.println("You got it!");
	
		/*
		 * In conclusion:
		 * 	We use while-->when we don't know how many times we need to iterate
		 * 	We use for-->when we know how many times we need to iterate
		 */

	}

}
