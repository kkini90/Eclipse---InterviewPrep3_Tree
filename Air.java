package com.usc.ctcl.tree;

import java.util.Stack;

public class Air {

	public static void main(String[] args) {		
		System.out.println(movePlane(""));
	}
	public static String movePlane(String cmd) {
		int y = 0, x = 0;
		Stack<Character> st1 = new Stack<Character>();
		Stack<Integer> st2 = new Stack<Integer>();
		int i = 0;
		int fnv = 0;
		for (i = 0; i < cmd.length(); i++) {
			char c = cmd.charAt(i);
			int nv = Character.getNumericValue(c);
			if (nv >= 0 && nv <= 9) {
				fnv = fnv * 10 + nv;
				continue;
			}
			if (fnv == 0) {
				fnv = 1;
			}
			st2.push(fnv);
			st1.push(c);
			fnv = 0;
		}
		if (st1.size() != st2.size()) {
			return "(999,999)";
		}
		int numpop=0;
		while (!st1.isEmpty()) {
			char c = st1.pop();
			fnv = st2.pop();
			if (c == 'U' || c == 'u') {
				if (numpop>0){
					numpop--;
					continue;
				}
				y +=fnv;
			} else if (c == 'D' || c == 'd') {
				if (numpop>0){
					numpop--;
					continue;
				}
				y -= fnv;
			} else if (c == 'L' || c == 'l') {
				if (numpop>0){
					numpop--;
					continue;
				}
				x -= fnv;
			} else if (c == 'R' || c == 'r') {
				if (numpop>0){
					numpop--;
					continue;
				}
				x += fnv;
			} else if (c == 'X' || c == 'x') {
				numpop ++;
			} else {
				return "(999,999)";
			}
		}
		return "(" + x + "," + y + ")";
	}

}
