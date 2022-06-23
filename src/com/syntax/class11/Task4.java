package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that stores even and odd numbers.
		 * Then, identify even numbers only.
		 */
		
		int[][] array= { {2, 17, 24}, {-3, -8, 0}, {1024, -1005, 60} };
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]%2==0) {
					System.out.println(array[i][j]);
				}
			}
		}
	}

}
