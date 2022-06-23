package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers and sum of all elements
		 * in that array.
		 */
		
		int[][] array= { {10, 20, 30}, {1, 2, 3}, {-50, -100, -150} };
		
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum=sum+array[i][j];
			}
		}
		System.out.println(sum);

	}

}
