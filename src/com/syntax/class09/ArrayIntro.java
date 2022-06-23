package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		/*
		 * Creating an array:
		 * 
		 * 	When we create an array, we must specify the size of
		 * an array (how many elements stored in array) 
		 * 
		 * 	int[] b; --->declaring an integer array named "b"
		 * 
		 * 	b= new int[4] ---> here "4" is the number of elements
		 * 	   that we want to store in array
		 */
		int[] b=new int[4];
		
		//Now, store the values in array:
		b[0]=90; //in Java, index values start from 0
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//now, access values from array:
		System.out.println(b[2]);//--->70
		System.out.println(b[1]+b[3]);//--->185
		
		//Example: Create an array that stores names:
		String[] names=new String[5];
		names[0]="James";
		names[1]="Oguz";
		names[2]="Teo";
		names[3]="Khrystyna";
		names[4]="Zameer";
		
		System.out.println("My classmate name is "+names[2]);

	}

}
