package com.usc.ctcl.tree;

public class StrRevSplChar {

	public static void main(String[] args) {
		String str = "%ab";
		//System.out.println(str.length());
		//char[] s = str.toCharArray();
		System.out.println("After reverse " + reverse(str));

	}
	private static boolean isAplphabet(char c){
		return (('A' <= c && c<= 'Z') || (c <= 'a' && c<='z'));
	}
	
	private static String reverse(String s){
		if(s == null || s.length() == 0){
			return s;
		}
		int l = 0, r = s.length()-1;
		char[] t = s.toCharArray();
		while(l<r){
			if(!isAplphabet(s.charAt(l))){
				l++;
			}else if(!isAplphabet(s.charAt(r))){
				r--;
			}else{
				
				char temp = t[l];
				t[l] = t[r];
				t[r] = temp;
				l++;
				r--;
			}
		}
		return t.toString();
	}
	
}
//program to reverse a string with special characters