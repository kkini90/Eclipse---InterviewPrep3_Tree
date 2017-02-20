package com.usc.ctcl.tree;

import java.util.HashSet;
import java.util.Iterator;

public class TotalPalindromeInString {

	public static void main(String[] args) {
		String  str = "geek";
		HashSet<String> set = new HashSet<String>();
		int size = Integer.MIN_VALUE;
		
		for(int c =0;c<str.length();c++){
			for(int i =1;i<=str.length()-c;i++){
				String s = str.substring(c, c+i);
				if(isPalindrome(s)){
					set.add(s);
					if(s.length() > size){
						size = s.length();
					}
					}
			}
		}
		
		System.out.println("Below are " + set.size() + " Palindromic substring :");
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Length of longest palindromic substring is :" + size);

	}

	private static boolean isPalindrome(String s) {
		char[] cArray = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(cArray[i]!= cArray[s.length()-i-1]){
				return false;
			}
		}
		return true;
	}

}

// also you can find longest substring by generating all substring and putting each of substring 