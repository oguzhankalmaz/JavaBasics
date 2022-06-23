package com.syntax.class10;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print all
		 * elements using different loops
		 */
		double[] value=new double[3];
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 3 double numbers");
		
		for(int i=0; i<value.length; i++) {
			value[i]=input.nextDouble();
		}
		for(int i=0; i<value.length; i++) {
		System.out.println(value[i]);
		}
		
		System.out.println("---------------------------------------");
		
		/*
		 * Create an array of integers and calculate the sum of all
		 * elements of this array
		 */
		
		int[] num= {1, 2, 3, 4, 5, 6};
		
		int result=0;
		
		for(int i=0; i<num.length; i++) {
			result=result + num[i];
		}
		System.out.println(result);
		
		System.out.println("--------------------------------");
		//2nd way:
		int[] number= {1, 2, 3, 4, 5, 6};
		int sum=0;
		
		for(int number2:number) {
			sum+=number2;
		}
		System.out.println(sum);
		
		System.out.println("------------------------------------");
		/*
		 * From an array of integer elements, find the largest number
		 */
		int[] numbers= {-2, -885, 100, 100, -1005};
		int greatest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(greatest>numbers[i]) {
				continue;
			}else {
				greatest=numbers[i];
			}
		}
		System.out.println(greatest);
		
		System.out.println("------------------------------------");
		
		/*
		 * Create an array to store char values and then print those
		 * in reverse order
		 */
		char[] letter= {'m', 'n', 'k'};
		char[] letter2= {'m', 'n', 'k'};
		
		int a=(letter.length-1);
		
		for(int i=0; i<letter.length; i++) {
			letter2[i]=letter[a];
			a-=1;
			if(a<0) {
				break;
			}
		}
		System.out.println(letter2);
		System.out.println("-------------------------------------");
		//simple way:
		for(int i=letter.length-1; i>=0; i--) {
			System.out.print(letter[i]);
		}
		

	}

}
