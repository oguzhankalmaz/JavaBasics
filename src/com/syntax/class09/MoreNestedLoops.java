package com.syntax.class09;

public class MoreNestedLoops {

	public static void main(String[] args) {
		/*
		 * How to create a multiplication table?
		 */
		int result;
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				result=i*j;
				System.out.println(i+" x "+j+" = "+result);
			}
		}
		
		/*
		 * How to create 24 hour format clock?
		 */
		for (int h=0; h<=23; h++) {
			for(int m=0; m<=59; m++) {
				for(int s=0; s<=59; s++) {
					
					if(h>=10 && m>=10 && s<10) {
						System.out.println(h+":"+m+":"+"0"+s);
				}else if(h>=10 && m<10 && s<10) {
					System.out.println(h+":"+"0"+m+":"+"0"+s);
				}else if(h<10 && m>=10 && s<10) {
					System.out.println("0"+h+":"+m+":"+"0"+s);
				}else if(h>=10 && m<10 && s>=10) {
					System.out.println(h+":"+"0"+m+":"+s);
				}else if(h>10 && m<10 && s<10) {
					System.out.println(h+":"+"0"+m+":"+"0"+s);
				}else if(h<10 && m<10 && s>=10) {
					System.out.println("0"+h+":"+"0"+m+":"+s);
				}else if(h<10 && m>=10 && s>=10) {
					System.out.println("0"+h+":"+m+":"+s);
				}else if(h<10 && m>10 && s<10) {
					System.out.println("0"+h+":"+m+":"+"0"+s);
				}else if(h<10 && m<10 && s>10) {
					System.out.println("0"+h+":"+"0"+m+":"+s);
				}else if(h<10 && m<10 && s<10){
					System.out.println("0"+h+":"+"0"+m+":"+"0"+s);
				}else {
					System.out.println(h+":"+m+":"+s);
				}
			}
				
		}
		

	}
		
		/*
		 * How to create 24 hour format clock? (2nd Way)
		 */
		for(int a=0; a<=2; a++) {
			for(int b=0; b<=9; b++) {
				if (a==2 && b==4) {
					break;
				}
				for(int c=0; c<=5; c++) {
					for(int d=0; d<=9; d++) {
						System.out.println(a+""+b+":"+c+d);
					}
				}
			}
		}

}
}
