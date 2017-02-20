package com.usc.ctcl.tree;

//Implement String to Double ie Double.parseDouble();

public class StrinToDoubleImpl {

	public static void main(String[] args) {
		System.out.println(StringToDouble("2346389.56"));

	}
	private static double StringToDouble(String s){
	     if( s == null || s.isEmpty()){
	         System.out.println("In valid String");
	         return 0;
	     }
	     boolean flag  = false;
	     int i = 0;
	     double num = 0;
	     int dotIdx = 0;
	     if(s.charAt(0) == '-'){
	         flag = true;
	         i = 1;
	     }
	     
	     while(i<s.length()){
	    	 if(s.charAt(i) == '.'){
	    		 dotIdx = i;
	    		 i++;
	    		 continue;
	    		 
	    	 }
	         num = num * 10;
	         num = num + s.charAt(i++) - '0';

	     }
	     if(flag){
	         num = -num;
	     }
	     num = num / (Math.pow(10, s.length() - 1 - dotIdx));
	     return num;
	  }

}
