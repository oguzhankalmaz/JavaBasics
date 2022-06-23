package com.syntax.class07;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int x=10;
		
		x=x+1;
		
		x+=1; //This statement is the same as "x=x+1"
		
		/*
		 * Or, we can use;
		 * --> increase variable by 1 --> x++
		 * --> decrease variable by 1 --> x-- 
		 */
		
		x++;
		
		x--;
		
		//However, we can't use these operators directly for a number
		// 10++ or 10-- are not valid argument, give error.

	}

}
