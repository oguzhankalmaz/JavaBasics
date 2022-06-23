package com.syntax.class07;

public class DifferenceBetweenPreincrementAndPostIncrement {

	public static void main(String[] args) {
		
		/*
		 * postincrement: num++
		 * 	First increment, then assign it
		 */
		
		int num=10;
		int result=num++;
		
		System.out.println("Value of num "+num);
		System.out.println("Value of result "+result);
		
		/*
		 * preincrement: ++num
		 * 	First assign, then increment
		 */
		
		int num1=10;
		int result1=++num1;
		
		System.out.println("Value of num "+num1);
		System.out.println("Value of result "+result1);

	}

}
