package com.usc.ctcl.tree;

public class SortStringChar {

	public static void main(String[] args) {
		System.out.println(sortString("zpaxbrcZ"));

	}
	public static String sortString(String s){
		if (s==null || s.isEmpty()){
			return s;
		}
		char[] inpCharArray = s.toCharArray();
		
		char tempChar;
		// bubble sort
		for (int i = 0; i < inpCharArray.length; i++) {
            for (int j= 0; j < inpCharArray.length - i -1; j++) {
                if(inpCharArray[j+1]<inpCharArray[j]) {
                	tempChar = inpCharArray[j];
                	inpCharArray[j] = inpCharArray[j + 1];
                	inpCharArray[j + 1] = tempChar;
                }
            }
        }
		
		return String.valueOf(inpCharArray);
		
	}

}

