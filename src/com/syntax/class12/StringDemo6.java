package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {
		/*
		 * Finding index of a character in a string
		 */
		String str="I am always confused";
		
		System.out.println(str.indexOf('c'));//-->12
		System.out.println(str.indexOf('a'));//-->2(gives the first appearing 'a' index)
		System.out.println(str.indexOf("am"));//-->2(gives the first appearing of the first letter of 'am' 
											  //basically gives the index of first appearing 'a')
		System.out.println(str.indexOf("always"));//-->5
		System.out.println(str.indexOf(" "));//-->1
		
		//If something does not present in string, we get -1:
		System.out.println(str.indexOf('z'));//-->-1
	}

}
