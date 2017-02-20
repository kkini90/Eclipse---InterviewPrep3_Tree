package com.usc.ctcl.tree;
/*
 * Input: A string - "a234bd6389ec.56z"
 * Output: Double 2346389.56
 */
public class StringAlphaNum {

	public static void main(String[] args) {
		alphaNumToDouble("a234bd6389ec.56z");

	}
	 private static void alphaNumToDouble(String s){
	     if(s == null || s.isEmpty()){
	         System.out.println("Invalid String");
	         return;
	     }
	     
	     StringBuilder sb = new StringBuilder();
	     int len = s.length();
	     boolean flag = false;
	     
	     for(int i=0;i<len;i++){
	         char c = s.charAt(i);
	         if('0'<= c && c <='9'){
	             sb.append(c);
	         }
	         if( c == '.' ){
	             if(flag){
	                 System.out.println("Invalid String");
	                 return;
	             }
	             sb.append(c);
	             flag = true;
	         }
	     }
	     System.out.println("Result :" + Double.parseDouble(sb.toString()));
	 }

}


 
