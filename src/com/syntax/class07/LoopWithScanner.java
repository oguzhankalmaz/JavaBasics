package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * We are going to ask you if you got a job
		 * we will continuously asking if you get a job until you say yes
		 * once you say---> Congratulations!
		 */
		
		Scanner input= new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job?");
			answer=input.nextLine();			
		}while(!answer.equalsIgnoreCase("yes"));
		
		System.out.println("Congratulations!");
		

	}

}
