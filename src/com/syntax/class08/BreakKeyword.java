package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		/*
		 * break:
		 * 	It stops the code and gets out the block of code.
		 * 	Keyword that break the loop.
		 */
		
		//For below example, block of code executes 1 time:
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
		    break;
		}
		
		System.out.println("-------------------------------");
		
		
		//For below example, block of code executes 2 time:
				for (int i=1; i<=5; i++) {
					System.out.println("Hello");
					if(i==2) {
				    break;
				}
	}
				
		System.out.println("--------------------------------");
		
		//Another example:
		boolean summer=true;
		int temp=95;
		
		while(summer) {
			System.out.println("It is hot");
			if(temp<70) {
				System.out.println("It is not hot anymore");
				break;
			}temp-=10;
		}

}
}