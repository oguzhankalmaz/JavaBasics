package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		//Checking a string start a specified word:
		//For example check below string starts with "Batch":		
		String str="Batch 13 is great";
		System.out.println(str.startsWith("Batch"));//-->true
		
		//Checking a string ends with a specified thing:
		System.out.println(str.endsWith("at"));//-->true
		//Checking a string ends/begins with a specified thing without case sensivity:
		System.out.println(str.toUpperCase().endsWith("AT"));//-->true
		System.out.println(str.toLowerCase().startsWith("batch"));//-->true
		
		//NOTE: Ctrl+Click on methods to see their source code!
		
		//Checking a string contains a specified word:
		System.out.println(str.contains("13"));//-->true
		System.out.println(str.toLowerCase().contains("batch"));//-->true
		

	}

}
