package com.syntax.class08;

public class NestedLoopsIntro {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=3; i++) { //outer loop
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) { //nested loop (inner loop)
				System.out.println("Bye");
			}
		}
		
		System.out.println("--------------------------------");
		
		//Another example:
		for (int i=1; i<=3; i++) {
			System.out.println(i);
			
			for(int y=1; y<=2; y++) {
				System.out.println(y);
			}
		}

	}

}
