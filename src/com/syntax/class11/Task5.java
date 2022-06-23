package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers and sum even and odd numbers
		 * of the array, individually.
		 */
		
int[][] array= { {2, 17, 24}, {-3, -8, 0}, {1024, -1005, 60} };

int sumEven=0;
int sumOdd=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]%2==0) {
					sumEven=sumEven + array[i][j];
				}else {
					sumOdd=sumOdd + array[i][j];
				}
			}
		}
		System.out.println("Sum of even numbers: "+sumEven);
		System.out.println("Sum of odd numbers: "+sumOdd);

	}

}
