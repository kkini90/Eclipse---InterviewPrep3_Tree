package com.usc.ctcl.tree;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		if(wordPattern("abba","dog cat cat dog")){
			System.out.println("Pattern Match");
		}else{
			System.out.println("Pattern Not Match");
		}

	}
	
	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
        if(pattern.length() != words.length) 
            return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(map.containsValue(words[i]))
                    return false;
                map.put(pattern.charAt(i), words[i]);
            }
            else if(!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;
        }
        return true;
    }
}

