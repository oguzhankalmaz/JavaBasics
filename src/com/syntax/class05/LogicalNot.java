package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		/*
		 * NOT operator ---> !
		 * it reverses the condition
		 */
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * example: if there is no traffic, print "I will reach work on time"
		 */
		
		boolean traffic=true;
		if (!traffic) {
			System.out.println("I will reach work on time");
		}
		
		//another example
		String name="Caner";
		
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre");
		}
	}

}
