package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String class is used to store and manipulate character based 
		 * data like numbers, alphabets and special characters.
		 */
		
		String str=new String("!!!Batch 13 is great but i say this to every batch.    ");
		//String--->DataType/Class
		//str---> variable name/object/instance
		//= --->assignment operator
		//new --->is used to create objects
		//String() --->it is also like a matter(method).it contains some Java statements
		//		       which are executed when object of this class is created.
		//			   it is called constructor.
		
		/*
		 * Matters/Methods we learned last time:
		 */
		
		//length();
		System.out.println(str.length());//-->Remember it counts also spaces.
		
		//toUpperCase();-->Note that, this is not change original string itself.
		System.out.println(str.toUpperCase());
		
		//toLowerCase();-->Note that, this is not change original string itself.
		System.out.println(str.toLowerCase());
		
		//isEmpty();--> Note that, it also counts blank spaces
		System.out.println(str.isEmpty());
		
		//trim();-->Get rid of blank spaces at the end or the beginning of a string
				   //It does not remove spaces between characters in string
		System.out.println(str.trim());
		
		//contains();
		System.out.println(str.contains("Batch"));
		
		//startsWith();-->check string starts with something
		System.out.println(str.startsWith("Bat"));
		
		//endsWith();
		System.out.println(str.endsWith(" "));
		
		//charAt();-->find characters at desired position in string
		System.out.println(str.charAt(0));
		
		//indexOf();-->find index of first appearance of a char or chars
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a',11));//-->finds index of 'a' 
												//after 11 characters
		
		//substring();-->Get the part from a string which starts from an index #,
					   //ends at the symbol #
		System.out.println(str.substring(3));
		
	}

}
