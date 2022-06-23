package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 * let's ask a user where is he from
		 * based on the country we will define favorite food
		 */
		
		Scanner input=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Where are you from?");
		country=input.nextLine();
		
		switch (country.toLowerCase()) {//in here, with "toUpperCase()" and "toLowerCase()
										//we can turn the variable assigned to lower or 
										//upper case
		
		case "mexico":
			favoriteFood="Tacos";
			break;
		case "turkey":
			favoriteFood="Kebap";
			break;
		case "usa":
			favoriteFood="Hamburger";
			break;
		default:
			favoriteFood="Unknown";
		
		}
		
		System.out.println(favoriteFood);

	}

}
