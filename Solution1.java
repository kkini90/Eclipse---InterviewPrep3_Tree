package com.usc.ctcl.tree;

import java.util.ArrayList;

public class Solution1 {

	public static void main(String[] args) {
		String X1 ="000"; // X1 = [10 -1000000000]
		int replaceDigit = 0;
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;i<X1.length();i+=2){
			String sub = X1.substring(i, i+2);
			String s1 = sub.substring(0, 1);
			String s2 = sub.substring(1, 2);
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);
			if(num1>num2){
				replaceDigit = num1;
			}else{
				replaceDigit = num2;
			}
			String replaceString = String.valueOf(replaceDigit);
			if(i==0)
			list.add(replaceString + X1.substring(i+2, X1.length()));
			if(i==2)
				list.add(X1.substring(0, 2) + replaceString + X1.substring(i+2, X1.length()));
			if(i==4)
				list.add(X1.substring(0, 4) + replaceString + X1.substring(i+2, X1.length()));
			if(i==6)
				list.add(X1.substring(0, 6) + replaceString + X1.substring(i+2, X1.length()));
			if(i==8)
				list.add(X1.substring(0, 8) + replaceString + X1.substring(i+2, X1.length()));
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++){
			if(min > Integer.parseInt(list.get(i))){
				min = Integer.parseInt(list.get(i));
			}
		}
		System.out.println(min);
	}

}
