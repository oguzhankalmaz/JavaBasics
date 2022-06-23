package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		/*
		 *    
		 *    
		 *    switch(variable) {
		 *    case value1:
		 *    	code a;
		 *    	break;
		 *    case value2:
		 *    	code b;
		 *    	break;
		 *    case value3:
		 *    	...
		 *    	...
		 * 
		 */
		
		//If is a condition based statement
		//switch is a value based statement
		
		//if we write an example with using if-else if:
		int day=3;
		String name;
		
		if (day==1) {
			name="Monday";
		}else if (day==2) {
			name="Tuesday";
		}else if (day==3) {
			name="Wednesday";
		}else if (day==4) {
			name="Thursday";
		}else if (day==5) {
			name="Friday";
		}else if (day==6) {
			name="Saturday";
		}else if (day==7) {
			name="Sunday";
		}else {
			name="Invalid";
		}
		
		System.out.println(name);
		
		System.out.println("---------------------------------------");
		
		//With the help of switch case, we can rewrite above:
		
		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
		}
		
		System.out.println(name);
		

	}

}
