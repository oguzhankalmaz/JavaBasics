package com.syntax.class13;

public class StringBuilderDemo {

	public static void main(String[] args) {
		/*
		 * String Class cannot be changes. To change a string class 
		 * we use StringBuilder Class. 
		 * 
		 * String Class is immutable.
		 * 
		 * StringBuilder Class is mutable.
		 */
		
		StringBuilder str=new StringBuilder("Hello");
		str.reverse();
		System.out.println(str);
		

	}

}
