package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		
		int[][] nums= {	{1, 2, 3, 4, 5}, {199, 300, 588, 700},	{1900, 4578, 98787}};
		
		//i loop iterates over rows
		//nums.length gives # of rows inside 2D array
		for(int i=0; i<nums.length; i++) {
			
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();//this creating a new line so we 
								 //can reach our 2D array like a table 
		}
		
		System.out.println("-------------------------------------");
		
		/*
		 * All values using Enhanced For Loop:
		 * 
		 * outer for loops--> iterates over 1D array
		 * inner for loop --> iterates over elements of each 1D array
		 */
		
		for(int[] num:nums) {
			for(int n:num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
