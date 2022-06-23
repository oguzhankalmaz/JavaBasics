package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		/*
		 * ChatAt() Class:
		 * 	Finds characters at defined position of a string.
		 */
		String str="Sameer is funny Sameer is gulbadan and he is heer badan";
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));

		System.out.println("---------------------------------------");
		
		//Print all chars in above string:
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("---------------------------------------");
		
		//Find how many times character "s" appears in the string:
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='s' || str.charAt(i)=='S') {
				counter++;
			}
		}
		System.out.println(counter+" times");
		
		System.out.println("---------------------------------------");
		
		//Find how many times character "1" appears in the following string:
		String str2="16261511161668211111  888338111882 1";
		
		int counter2=0;
		for(int i=0; i<str2.length(); i++) {
			if(str2.charAt(i)=='1') {
				counter2++;
			}
		}
		System.out.println(counter2+" times");
		
	}

}
