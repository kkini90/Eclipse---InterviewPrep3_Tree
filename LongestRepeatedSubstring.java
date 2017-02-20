package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestRepeatedSubstring {
	
	private static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		String subStr = getLongestRepeatedSubstring("banana");
		System.out.println(subStr);
	}
	
	private static String getLongestRepeatedSubstring(String s){
		if(s ==null || s.length()==0){
			return "";
		}
		
		HashSet<String> set = new HashSet<>();
		int maxSize= 0;
		String longestString = "";
		
		// TC :O(n^2)
		/*for(int c = 0;c<s.length();c++){
			for(int i=1;i<=s.length()-c;i++){
				list.add(s.substring(c,c+i));
			}
		}*/
		
		// TC :O(n)^2
		for(int i=0;i<s.length();i++){
			genSubString(s.substring(i,s.length()));
		}
		
		//TC : O(n)
		for(String str : list){
			if(!set.add(str)){
				if(maxSize < str.length()){
					maxSize = str.length();
					longestString = str;
				}
			}
		}
		return longestString;
	}
	
	private static void genSubString(String word){
		if(word == null || word.isEmpty()){
			return;
		}
		if(word.length()==1){
			list.add(word);
			return;
		}
		if(word.length()>1){
			list.add(word);
			genSubString(word.substring(0,word.length()-1));
		}
	}
}
//SC:O(n) for hashset