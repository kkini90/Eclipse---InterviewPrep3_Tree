package com.usc.ctcl.tree;

public class Rev1 {

	public static void main(String[] args) {

		String S = "we test coders";

		char[] char_set = S.toCharArray();
		char[] dest_set = new char[S.length()];

		int tokenReadPos = S.length() - 1;
		int wordStart, wordEnd;
		int wordPos = 0;
		int i = 0;

		while (i <= tokenReadPos) {
			if (char_set[i] == ' ') {
				dest_set[wordPos++] = char_set[i++];
			} else {
				wordStart = i;
				while (i <= tokenReadPos && char_set[i] != ' ') {
					i++;
				}
				wordEnd = i - 1;
				while (wordStart <= wordEnd) {
					dest_set[wordPos++] = char_set[wordEnd--];
				}
			}
		} // end of while
		for (int j = 0; j < S.length(); j++) {
			System.out.println(dest_set[j]);
		}

	}
}

/*
 import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // Error in line 11
        System.out.print("Enter a sentence: ");
        String sentence = read.nextLine();
        boolean containsPeriod= false;
        if (".".equals(sentence.substring(sentence.length()-1,sentence.length()))){
               sentence = sentence.substring(0,sentence.length()-1);
               containsPeriod=true;
           }


        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // Error in line 23
            System.out.print(reverseWord(word));
            if(i!=words.length-1)
                System.out.print(" ");
        }
        if(containsPeriod)
            System.out.print(".");
        read.close();
    }

    private static String reverseWord(String sentence) {
        Stack<Character> rev = new Stack();
        for (int ii = 0; ii < sentence.length(); ii++) {
            rev.push(sentence.charAt(ii));
        }
        String out = "";
        while (rev.size() != 0) {
            out += rev.pop();
        }
        return out;
    }
}
*/