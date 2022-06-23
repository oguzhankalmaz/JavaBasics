package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries.
		 * When the array is created, retrieve all values from it.
		 * And while retrieving those values, print capital for each
		 * country(use 2 different loops).
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of countries:");
		int num=input.nextInt();
		String[] array=new String[num];
		
		System.out.println("Enter the name of the countries:");
		for(int i=0; i<array.length; i++) {
			array[i]=input.next();
			if(array[i].equalsIgnoreCase("turkey")) {
				System.out.println("The capital of Turkey is Ankara");
			}else if(array[i].equalsIgnoreCase("usa")) {
				System.out.println("The capital of USA is Washington");
			}
		}
		
		input.close();
		

	}

}
