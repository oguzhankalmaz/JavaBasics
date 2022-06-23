package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// Print numbers from 1 to 90
			int num=1;
		for (int i=1; i<=90; i++) {
			System.out.println(num);
			num++;
		}
		//2nd way:
		for (int i=1; i<=90; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		
		
		//Print numbers from 60 to 10
		for (int i=60; i>=10; i--) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		
		
		//Print numbers 5 to 40 with increment 5
		for (int i=5; i<=40; i+=5) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		
		
		//Print even numbers from 20 to 1
		for (int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		//2nd way
		for (int i=20; i>=1; i--) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------------------------------");

		
		//Print odd numbers between 20 and 50
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
	}

}
