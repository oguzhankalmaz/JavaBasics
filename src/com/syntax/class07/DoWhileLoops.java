package com.syntax.class07;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		
		/*
		 * while loop first checks condition and only then
		 * executes block of code
		 */
		int num=10;
				while (num<=3) {
			System.out.println(num+" ");
			num++;
		}
				
				System.out.println("-----------------");
		
		/*
		 * do while loop first executes the code and only then
		 * checks the condition
		 */
		int num1=10;
		do {
			System.out.println(num1+" ");
			num1++;
		} while (num1<=3);
		
				System.out.println("------------------------");
		
		//print numbers 1 to 30 using do while:
		
		int num2=1;
		do {
			System.out.println(num2+" ");
			num2++;
		}while (num2<=30);
		
		//print even numbers from 70 to 30 using do while:
		
				System.out.println("----------------------");
		
		int num3=70;
		do {
			if(num3%2==0) {
				System.out.print(num3+" ");
				}num3--;
		}while (num3>=30);

	}

}
