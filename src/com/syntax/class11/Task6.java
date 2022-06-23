package com.syntax.class11;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Max. and Min numbers of an array
		 */
		
		int[][] array= { {2, 170, -2004}, {-3, -8, 0}, {24, -1005, 105} };
		int min=array[0][0];
		int max=array[0][0];
		int a=0;
		int b=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(min<array[i][j]) {
					continue;
				}else {
					min=array[i][j];
				}
			}
		}
		System.out.println("Smallest number is: "+min);
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(max>array[i][j]) {
					continue;
				}else {
					max=array[i][j];
					a=i;
					b=j;
				}
			}
		}
		System.out.println("Largest number is: "+max);
		
		//Now, find the 2nd largest number of this array:
		
		int secondLargest=array[0][0];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i==a && j==b) {
					break;
				}else if(secondLargest>array[i][j]) {
					continue;
				}else {
					secondLargest=array[i][j];
				}
			}
		}
		System.out.println("Second largest number is: "+secondLargest);
		
		
	}		

	}


