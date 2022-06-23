package com.syntax.class09;

public class AnotherWayToCreateAnArray {

	public static void main(String[] args) {
		
		//We can create array like below:
		String[] fruits= {"mango", "apple", "kiwi", "pear"};
		System.out.println(fruits[2]);//--->kiwi
		System.out.println(fruits[3]);//--->pear
		
		//How can we find a size of an array?
		int size=fruits.length;
		System.out.println(size);//--->4
		
		/*
		 * Create an array of chars and store grades A,B,C,D,E,F in it.
		 * Then print a grade B (use 2 different ways to create an array)
		 */
		//1st way:
		char grades[]=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
		//2nd way:
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade[1]);
		
		

	}

}
