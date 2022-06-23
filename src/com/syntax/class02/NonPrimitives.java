package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		String lastName="Smith";
		String city="Miami";
		
		//xxx-xxx-xxxx
		
		String phoneNumber="123-456-7890";
		
		String address="123 Washington Str";
		
		//Anything we put inside a double quote, Java thinks as String
		//int age="10"; here, 10 is not integer, anymore. it is treated as String
		int age=10;
		
		//shortcut for printing
		//type "syso"+ctrl+space --->hit enter
		
		/*
		 * We can use + sign: -> works as concatenation operator
		 * to attach String to String
		 * to attach String to int
		 * to attach String to double
		 * to any other type
		 * 
		 */
		
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Create the sentence: Oleg lives in Miami.
		System.out.println(name+" lives in "+city+".");
		
		//Create the sentence: Oleg is 10 years old.
		System.out.println(name+" is "+age+" years old.");
		
		/*
		 * Rules for identifiers
		 * 1. no space between words
		 * 2. no Java keywords can be used
		 * 			String break="Hello"; -->gives error because break is a Java Keyword
		 * 3. cannot start with numbers (numbers can be used after a letter)
		 * 			String 1var="Cat"; --->gives error
		 * 4. cannot have special characters (except _ and $)
		 * 			String var£="Cat"; --> error, special character in variable name
		 */
		
		/*
		 * Naming Conventions:
		 * 1. follow camel casing
		 * 		String myCity="Ankara";
		 * 2. variable/method names should start with lowercase and then follow camel casing
		 * 		String myCity="Ankara";
		 * 3. class names should start with uppercase
		 */

	}

}
