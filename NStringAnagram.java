package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NStringAnagram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of strings");
		int N = scanner.nextInt();
		System.out.println("Enter the strings");
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = scanner.next();
		}
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		for (String s : str) {

			String key = sort(s);
			if (map.containsKey(key)) {
				map.get(key).add(s);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(s);
				map.put(key, list);
			}

		}	
		
		if(map.size()==1){
			System.out.println("Anagram");
			
		}else{
			System.out.println("Not anagram");
		}

	}

	private static String sort(String s) {
		char[] cArray = s.toCharArray();
		java.util.Arrays.sort(cArray);
		return (new String(cArray));

	}

}
