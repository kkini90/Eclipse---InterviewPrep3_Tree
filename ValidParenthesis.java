package com.usc.ctcl.tree;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String str ="[]";
		
		if(isValid(str)){
			System.out.println("Valid");
		}else{
			System.out.println("Not valid");
		}

}

	private static boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put(']', '[');
		map.put('}', '{');
		map.put(')','(' );
		
		for(int i =0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(c == '(' ||c == '{'  || c == '[' ){
				stack.push(c);
			}else if(c == ')' ||c == '}'  || c == ']' ){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() !=map.get(c)){
					return false;
				}
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
	}		
}
