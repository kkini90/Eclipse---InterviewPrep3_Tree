package com.usc.ctcl.tree;

import java.util.Stack;

public class RevStack {

	public static void main(String[] args) {
		String s ="the world";
		String[] str = s.split(" ");
		Stack<Character> stack = new Stack<Character>();
		int count=1;
		for(String x :str){
			for(char c :x.toCharArray()){
				stack.push(c);				
			}			
			while(!stack.isEmpty()){
				System.out.println(stack.pop());
			}
			if(count != str.length){
				System.out.println(" ");
				count++;
			}						
		}
	}
}
