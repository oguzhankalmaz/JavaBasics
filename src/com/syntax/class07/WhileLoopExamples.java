package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		//print numbers from 1 to 10
		
		int num=1;
		while(num<11) {
			System.out.println(num);
			num++;
		}
		
		//print numbers 10 to 1
		
		num=10;
		while(num>0) {
			System.out.println(num);
			num--;
		}	
		//print numbers 1 to 10 but only even numbers
		int a=2;
		while(a<=10) {
			System.out.print(" "+a);
			a=a+2; //OR; we can write --->  a+=2
		}
		
		System.out.println("-----------------------");
		
		//print EVEN numbers 1 to 20
		int b=1;
		while (b<=20) {
			if (b%2==0) {
				System.out.print(b+" ");
			}
			b++;
		}
			
		}

	}


