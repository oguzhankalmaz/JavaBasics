package com.syntax.class13;

import java.util.Scanner;

public class RecapExample2 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if 
		 * they expecting boy or girl. Based on the output, suggest a name 
		 * for the baby.
		 * Example output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or girl? boy
		 * Suggested baby name: DANRY
		 * 
		 * Example output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or girl? girl
		 * Suggested baby name: MAIEL
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Mom's first name?");
		String mom=input.next();
		
		System.out.println("Dad's first name?");
		String dad=input.next();
		
		System.out.println("Boy or girl?");
		String gender=input.next();
		
		String baby="";
		if(gender.equalsIgnoreCase("boy")) {
			baby=dad.substring(0,3) + mom.substring(2);
		}else if(gender.equalsIgnoreCase("girl")) {
			baby=mom.substring(0,2) + dad.substring(3);
		}
		System.out.println("Suggested baby name: "+baby.toUpperCase());
		

	}

}
