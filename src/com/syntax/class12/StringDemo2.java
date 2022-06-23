package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Adem";
		String lastName="Jones";
		
		String fullName=firstName+lastName;//Always prefer this
		
		String fullName2=firstName.concat(lastName);//never use this
		//because it can lead you null pointer error
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		//Checking string variable is empty or not (isEmpty())
		String name=" ";
		System.out.println(name.isEmpty());//--->true
		
		//Checking string variable empty but has blank spaces(isBlank())
		//System.out.println(name.isBlank());--->does not work this version of Java
		
		//Trim blank spaces at the begining and end of string variable
		//This method never trim spaces in between string values.
		//-->"ne  ver"-->Does not trim between "ne" and "ver"
		String str=" never    ";
		System.out.println(str.trim());
		
	}

}
