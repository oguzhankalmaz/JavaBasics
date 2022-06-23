package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double num1, num2, result;
		result=0;
		String operator=null;
		System.out.println("Please enter two numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		
		char op;
		System.out.println("Please specify operator (+, -, *, /)");
		op=input.next().charAt(0);
		
		switch(op) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid operator");
			operator="Invalid";
			
		}
		if (result != 0 || operator==null) {
		System.out.println("The result is "+result);
		operator="Invalid";
		}
		input.close();
	}

}
