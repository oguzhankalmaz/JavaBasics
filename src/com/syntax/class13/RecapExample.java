package com.syntax.class13;

public class RecapExample {

	public static void main(String[] args) {
		/*
		 * Create a string and if the string is not empty, perform the following:
		 * 	if the string has an odd number of characters and has 3 or more characters,
		 * 	print the character in the middle of the string.
		 */
		
		String str=new String("Oguzhan");
		
		if(!str.isEmpty()) {
		if(str.length()%2!=0 && str.length()>3) {
			int i=str.length()/2;
			System.out.println(str.charAt(i));
		}
		
		
		}
		
		/*
		 * Rewrite the string in reverse:
		 */
		for(int i=0; i<str.length(); i++) {
			int j=str.length()-i-1;
			System.out.print(str.charAt(j));
		}
		System.out.println("");
		//2nd way:
		for(int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
		
		
	}

}
