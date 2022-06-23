package com.syntax.class02;

public class ExampleTask3 {

	public static void main(String[] args) {
		
		
		double num1,num2;
		num1=5.20;
		num2=4.80;
		double add=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println ("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+add);
		System.out.println ("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println ("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println ("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		/*
		 * The square of a number
		 */
		double num3=3.9;
		double squ=num3*num3;
		System.out.println ("The square of the "+num3+" is "+squ);
		
		/*
		 * Area and perimeter of a rectangle
		 */
		
		double width=5.0;
		double height=8.0;
		double perimeter=2.0*(width+height);
		double area=width*height;
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
	}

}
