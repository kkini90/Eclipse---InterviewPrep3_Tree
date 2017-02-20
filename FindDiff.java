package com.usc.ctcl.tree;

public class FindDiff {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd","abcde"));

	}
	public static char findTheDifference(String s, String t) {
        char mChar = 0;
        
        for(int i=0;i<s.length();++i){
            mChar ^= s.charAt(i);
        }
        for(int i=0;i<t.length();++i){
            mChar ^= t.charAt(i);
        }
        return mChar;
    }

}
