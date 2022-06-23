package com.syntax.class13;

public class ReplacingStringParts {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		String str="Batch 13 is good, actually very good";
		
		//Replace "good" with "great"
		System.out.println(str.replace("good", "great"));
		//It replaces all "good" 
		
		//Replace "g" with "G"
		System.out.println(str.replace("g", "G"));
		//It replaces all "g"
		
		//Just replace first occurrence of "g"
		System.out.println(str.replaceFirst("g", "G"));
		
		System.out.println("-------------------------------------");
		
		/*
		 * ReplaceAll();
		 * 		Replaces all values between an interval that occur in a string 
		 */
		//Replace all integer values appear the following string with "#"
		String str2="sla21NN23s4RNfdsl009ACF&/(&+%+%//))232)==1221";
		System.out.println(str2.replaceAll("[0-9]", "#"));
		//Replace all lower letters appear with "#"
		System.out.println(str2.replaceAll("[a-z]", "#"));
		//Replace all upper case letters with "#"
		System.out.println(str2.replaceAll("[A-Z]", "#"));
		//Replace all upper and lower case letters with "#"
		System.out.println(str2.replaceAll("[A-Za-z]", "#"));
		//Replace all integers, upper and lower case letters with "#"
		System.out.println(str2.replaceAll("[A-Za-z0-9]", "#"));
		//Replace all chars except lower case letters
		System.out.println(str2.replaceAll("[^a-z]", "#"));
		//Replace all special characters
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", "#"));
		//Remove all special characters from string
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		
	}

}
