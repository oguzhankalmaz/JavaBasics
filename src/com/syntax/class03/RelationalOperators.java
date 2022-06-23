package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		/*
		 * Relational operators:
		 * >, <, >=, <=, ==, !=
		 * They give boolean result (true or false)
		 */
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);//false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true
		
		System.out.println(num1==num2);//false
		//System.out.println(num1=num2);//gives result 22. not confuse = with ==
		
		//result of relational operators always boolean
		boolean result=100>200;
		System.out.println(result);//false
		
		int num3=10;
		int num4=11;
		result=num3==num4;//checking if num3 equals to num4
		System.out.println(result);//false
		
		
	}

}
