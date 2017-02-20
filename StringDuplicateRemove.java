package com.usc.ctcl.tree;

import java.util.Stack;

public class StringDuplicateRemove {

	public static void main(String[] args) {
		//System.out.println(removeDuplicate("abba"));
		String s = "abbac";
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		for(char c: s.toCharArray()){
			stack1.push(c);
		}
		
		while(!stack1.isEmpty()){
			if(stack2.isEmpty()){
				stack2.push(stack1.pop());
			}
			if(stack1.peek() != stack2.peek()){
				stack2.push(stack1.pop());
			}else{
				stack1.pop();
				stack2.pop();
			}
		}
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop());
		}
	}
	
	/*public static String removeDuplicate(String string) {
	    if(string == null) return null;
	    return String.copyValueOf(removeDuplicate(string.toCharArray()));
	}*/

	/*public static char[] removeDuplicate(char[] chars) {
	    if(chars.length < 1) return new char[0];
	    else if(chars.length == 1) return chars;

	    for(int i=0; i<chars.length-1; i++) {
	        if(chars[i] == chars[i+1]) {
	        	char[] before = Arrays.copyOfRange(chars, 0, i);
	            char[] after = Arrays.copyOfRange(chars, i+2, chars.length);
	            char[] combined = new char[before.length + after.length];
	            System.arraycopy(before, 0, combined, 0, before.length);
	            System.arraycopy(after, 0, combined, before.length, after.length);
	            chars = removeDuplicate(combined);
	            break;
	        }
	    }
	    return chars;
	}*/

}
//remove adjacent duplicate
/*
1. Initialize a stack containing the string. (Stack A)
2. Pop top most element of Stack A and push into Stack B thereby initializing Stack B
3. Pop from Stack B and pop from Stack A and check if they are equal.
4. If they aren't push both the elements in Stack B. (The popped element from Stack A is pushed later to preserve order)
5. Do step 3 till Stack A is empty.

Stack B should contain the chracters with adjacent duplicates removed.
*/