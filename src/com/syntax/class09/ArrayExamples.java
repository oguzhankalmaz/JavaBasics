package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		// Let's store prices in array:
		double[] price=new double[4];
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);
		//In above example, we did not start our array from "0".
		//In this situation, Java does not give error. It reserves 4
		//places for our array as we declare. And it fills blank places
		//with "0.0" by default for a double array.
		
		
		//Let's store some numbers in an array:
//		int[] num=new int[3];
//		num[0]=10;
//		num[1]=11;
//		num[2]=12;
//		num[3]=13;
//		
//		System.out.println(num[1]);
		//For above example, when we execute, Java gives error. Because,
		//we declare an array with length 3, but we try to store 4 values
		//in it--->Error: "Index 3 out of bounds for length 3"
		
		//Arrays are fixed in size. Java cannot increase or decrease 
		//a size of an array during execution.
	}

}
