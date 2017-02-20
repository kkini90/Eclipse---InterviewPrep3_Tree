package com.usc.ctcl.tree;

import java.util.HashSet;

public class UniqueWordCount {

	public static void main(String[] args) {
		String s = "is is the    a";
		System.out.println(unique(s));
	}

	private static int unique(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		HashSet<String> set = new HashSet<String>();

		for (String word : s.split(" ")) {
			if (!word.equals("")) {
				set.add(word);
			}
		}
		return set.size();
	}
}
