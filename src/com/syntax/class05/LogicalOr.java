package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * Monday and Friday-->no class
		 * Tuesday and Wednesday -->manual testing
		 * Thursday--> Review
		 * Saturday and Sunday--> Java
		 */
		
		String day="Tuesday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("No class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Manual testing");
		}else if (day.equals("Thursday")) {
			System.out.println("Review");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Java");
		}


	}

}
