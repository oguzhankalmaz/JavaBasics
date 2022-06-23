package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//To create 2D array, we specify # of rows and columns
		int[][] numbers=new int[3][4];
		//1st row:
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2nd row:
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		//3rd row:
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		//retrieve number 4:
		System.out.println(numbers[1][3]);
		//print length:
		System.out.println(numbers.length);//This will print just 
										   //number of rows
		//To print columns #, first go inside a row, then print:
		int columnsOfFirstRow=numbers[0].length;
		System.out.println(columnsOfFirstRow);
		
		

	}

}
