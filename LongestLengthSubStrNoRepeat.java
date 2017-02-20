package com.usc.ctcl.tree;

import java.util.HashSet;
import java.util.Set;

public class LongestLengthSubStrNoRepeat {

	public static void main(String[] args) {
		String s = "abcbaccc";
		Set<Character> set = new HashSet<>();
		int i = 0 ,j = 0 ,max = 0;
		
		while(j<s.length()){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			}else{
				set.remove(s.charAt(i++));
			}
		}
		System.out.println("Size " + max);
	}
}
