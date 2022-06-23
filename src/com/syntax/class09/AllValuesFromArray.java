package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		
		System.out.println("----------------------------------------");
		
		//How can we access all elements of array in a simple way?
		//In above example, our repetitive element is index of our array.
		//Thus, using for loop, we can reach our elements in array at once.
		
		for(int i=0; i<grade.length; i++) {
			System.out.println(grade[i]);
		}

	}

}
