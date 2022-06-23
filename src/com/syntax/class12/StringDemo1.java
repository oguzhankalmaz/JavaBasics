package com.syntax.class12;

public class StringDemo1 {
	
	/*
	 * String is the most widely used class in Java.
	 */
	
	public static void main(String[] args) {
		
		String name=new String("Oleg"); //Although this is the proper way of creating an object from a class,
									    //Java can recognize String class and we can use this as below.
		
		String name2="Oleg";//This usage and above usage are the same.
		
	//All the classes in Java can be treated as data type.
	//String is a non-primitive data type.
		
	System.out.println(name.length());//--->here, .length() is a matter/method
	//methods are always use with parentheses at the end of it		
	
	//object.toLowerCase();  --->Makes all characters lower
	//object.toUpperCase();  --->Makes all characters upper
	}

}
