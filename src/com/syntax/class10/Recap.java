package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Tom"};
	    System.out.println(disney[1]);//--->Elsa
	    
	    //to get all elements from an array
	    
	    for(int i=0; i<disney.length; i++) {
	    	if(disney[i].equalsIgnoreCase("Shrek")) {
	    		System.out.println(disney[i]+" is my favourite character");
	    	}else {
	    	System.out.println(disney[i]);
	    }
	    }
	    
	    System.out.println("-----------------------------------------");
	    
	    //Enhanced for loop
	    
	    for(String disney2:disney) {
	    	
	    	if(disney2.equalsIgnoreCase("Mulan")) {
	    	System.out.println(disney2+" is my favourite character");
	    	
	    	} else{
	    		System.out.println(disney2);
	    	}
	    }

	}

}
