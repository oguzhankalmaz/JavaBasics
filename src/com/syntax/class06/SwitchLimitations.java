package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/*
		 * switch has datatype limitations:
		 * 
		 * switch can work with byte, short, int, char, String
		 * switch cannot work with double, float, long, boolean
		 * 
		 */
		
		double price=10;
		/*
		 * switch(price){
		 * }
		 * 
		 *  ----> Compile Error: Cannot switch on a value of type double
		 */
		
		boolean hungry=true;
		/*
		 * switch(hungry){
		 * }
		 * 
		 *  ----> Compile Error: Cannot switch on a value of type boolean
		 */
		
		//**************************************************************
		
		/*
		 * switch has operator limitations:
		 * 
		 * cannot use logical operators inside switch: &&, ||, !
		 * cannot use relational operators inside switch: >, <, >=, etc.
		 */
		char choice='Y';
		String meaning;
		/*
		switch(choice) {
		case 'Y' || 'y':
			meaning="Yes";
			break;
			-----------> Compile error
		*/
		
		}
		
		
		
	}


