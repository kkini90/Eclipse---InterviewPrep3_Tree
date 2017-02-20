package com.usc.ctcl.tree;

import java.util.HashSet;
import java.util.Set;

public class BreakWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		Set<String> dict = new HashSet<>();
		dict.add("leet");
		dict.add("code");
		System.out.println(wordBreak(s,dict));

	}
	public static boolean wordBreak(String s, Set<String> dict) {
        boolean [] breakable = new boolean[s.length()+1];
        breakable[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=i;j++){
                if(breakable[j]&&dict.contains(s.substring(j,i))){
                    breakable[i] = true;
                    break;
                }
            }
        }
        return breakable[s.length()];
    }

}
