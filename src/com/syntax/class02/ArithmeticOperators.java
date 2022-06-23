package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int num1=40;
		int num2=20;
		
		int sum, sub, mult, div;
		
		sum=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		
		System.out.println (sum);
		System.out.println (sub);
		System.out.println (mult);
		System.out.println (div);
		
		double num3=9.99;
		double num4=3.50;
		/*We define sum as integer. Thus, trying to adding to double and naming
		 * it sum gives error:
		 * sum=num3+num4; -->error
		 */
		/* assign new variable sum1 as double
		 */
		double sum1=num3+num4;
		
		/*
		 * this will give result as 3. use double to obtain decimal exact results
		 */
		int a,b;
		a=10;
		b=3;
		int result=a/b;
		System.out.println (result); //--->3
		
		double c,d;
		c=10.0;
		d=3.0;
		double result1=c/d;
		System.out.println(result1); //--->3.333333333
		
		
		
	}

}
