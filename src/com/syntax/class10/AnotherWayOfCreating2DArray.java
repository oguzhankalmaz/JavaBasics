package com.syntax.class10;

public class AnotherWayOfCreating2DArray {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cities of states of USA:
		 * 	1 array->New York    --->cities in NY
		 * 	2 array->California  --->cities in CA
		 * 	3 array->Florida     --->cities in FL
		 * 	4 array->Virginia    --->cities in VA
		 */
		
		String[][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"},
		};
		
		//print San Jose:
		System.out.println(usa[1][2]);
		
		//total number of 1D arrays (rows) in array usa:
		System.out.println(usa.length);
		
		//total number of elements in first row of array usa:
		int el1stArray=usa[0].length;
		System.out.println(el1stArray);

	}

}
