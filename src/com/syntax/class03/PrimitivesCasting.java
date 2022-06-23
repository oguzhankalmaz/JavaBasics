package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		//ctrl+space-->auto complete
		
		int i=100;
		double d=100;
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		/*
		 * Casting in Java ---> converting 1 type into another
		 * 
		 * Widening type of casting: (implicit casting)
		 * byte -> short -> int -> long -> float -> double
		 * Java does automatically this.
		 * 
		 * Narrowing type of casting: (explicit casting)
		 * double -> float -> long -> int -> short -> byte
		 * Java does not do this automatically. It must be done manually.
		 * 
		 */
		
		// int x = 99.99; --->will give error, type mismatch:cannot convert double to int.
		//We have to do explicit casting manually:
		
		int x = (int)99.99; //explicit casting(narrowing)
		byte b=(byte)130;
		
		System.out.println(x);//99
		System.out.println(b);//-126
	}

}
