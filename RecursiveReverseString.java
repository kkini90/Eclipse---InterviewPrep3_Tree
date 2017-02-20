package com.usc.ctcl.tree;

public class RecursiveReverseString {	
	public static String rev= "";
	
	public static void main(String[] args) {	
		String str ="abc";
		rev = reverseString(str);
		System.out.println(rev);
	}

	private static String reverseString(String str) {
		if(str==null || str.length()<=1){
			return str;
		}else{
			rev += str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
			return rev;
		}
	}
}
