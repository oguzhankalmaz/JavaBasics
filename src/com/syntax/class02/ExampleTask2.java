package com.syntax.class02;

public class ExampleTask2 {

	public static void main(String[] args) {

		String name="Oguzhan";
		String lastName="Kalmaz";
		char grade='A';
		String city="Kecioren";
		String state="Ankara";
		String phoneNumber="+905519557262";
		
		System.out.println ("My name is "+name+" and my last name is "+lastName);
		System.out.println ("I am "+grade+" student");
		System.out.println ("I live in city "+city+" and state "+state);
		System.out.println ("And my phone number is "+phoneNumber);
		
		city="Kirikhan";
		state="Hatay";
		phoneNumber="+905557778899";
		grade='B';
		
		System.out.println ("My name is "+name+" "+lastName+" and I moved to new city "+city+" and new state "+state+".");
		System.out.println ("My phone number is "+phoneNumber);
	

	}

}
