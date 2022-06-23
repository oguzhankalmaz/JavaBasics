package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		//Write a program to print out duplicate elements from an array
		//of strings.
		
		String[] array= {"A", "B", "A", "D", "C", "C","A", "B"};
		
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i].equals(array[j]) && i!=j) {
					System.out.println(array[i]);
				}
			}
			
		}

	}

}
