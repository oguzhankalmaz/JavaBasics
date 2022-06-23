package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
		/*
		 * continue:
		 * 	It skips current execution/iteration.
		 * 
		 * 	When Java executes continue, it goes back to the beginning
		 * of the loop, so rest of the code inside loop body will be
		 * skipped/ignored.
		 */
	
		/*
		 *In below example, when i=2, it skips execution the code 
		 *system.out.print and continue next iteration (i=3) 
		 */
		for(int i=1; i<=5; i++){
			
			if (i==2) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------");
		
		
		//Example: print numbers from 1 to 10 except number 5 and 7
		for(int i=1; i<=10; i++) {
			if(i==5 || i==7) {
				continue;
			}
			System.out.println(i);
		}
				
		System.out.println(" ");
		System.out.println("----------------------------------");
		
		
		//Ex: print numbers 1 to 50 except those that are divisible by 3
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------");
		
		//Ex: Create a program that will keep asking user to apply for a
		//credit card as soon as yo get "yes" from a user, program should
		//stop asking.
		Scanner input=new Scanner(System.in);
		String ans;
		
		for (int i=1; i<=1; i--) {
			System.out.println("Do you want to apply credit card?");
			ans=input.next();
			if (ans.equalsIgnoreCase("yes")) {
				System.out.println("Good!");
				break;
			}else {
				continue;
			}
		}
		

	}

}
