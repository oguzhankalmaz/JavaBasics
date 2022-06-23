package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1ArraysUtility {

	public static void main(String[] args) {
		//Using Scanner create an array of integer values. After the
		//array is created, calculate the sum of all stored elements
		//in that array.
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int size=input.nextInt();
		int[] array=new int[size];
		
		System.out.println("Enter the elements of array");
		
		int counter=0;
		
		for(int i=0; i<size; i++) {
			if(counter<=size) {
				array[i]=input.nextInt();
			}
			counter+=1;
		}
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
			System.out.println("Element"+i+": "+array[i]);
			sum=sum+array[i];
		}
		System.out.println("The sum of all elements is: "+sum);
		
		//PRINTING OUT IN ARRAY FORM (Array utility):
		System.out.println(Arrays.toString(array));
		
		input.close(); //ALWAYS CLOSE THE SCANNER AT THE END OF OPERATION
		
		
	}

}
