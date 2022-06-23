package com.syntax.class09;

public class EnhancedForLoop {

	public static void main(String[] args) {
		/*
		 * Enhanced For Loop(Advanced For Loop or For Each Loop)
		 * CAN BE USED ONLY WHEN WE WORK WITH ARRAY
		 * 					OR
		 * 				COLLECTIONS
		 */
		
		String[] colours= {"pink", "blue", "white", "black"};
		
		for(String newColours:colours) {
			System.out.print(newColours+" ");
		}
		
		System.out.println("----------------------------------");
		
		//Another example:
		int[] numbers= {10, 20, 30, 40};
		
		for(int num:numbers) {
			System.out.println(num);
		}

	}

}
