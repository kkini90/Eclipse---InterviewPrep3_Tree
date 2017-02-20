package com.usc.ctcl.tree;

public class RecursiveReverseNumber {

	public static void main(String[] args) {
		int number = 12345678;
		StringBuilder sb = new StringBuilder();
		StringBuilder reverseNum = revNumber(number,sb);
		System.out.println("Reversed number " + Integer.parseInt(reverseNum.toString()));

	}

	private static StringBuilder revNumber(int number,StringBuilder sb) {
		if(number<10){
			sb.append(number);
			return sb;
		}
		sb.append(number%10);
		number = number/10;
		return revNumber(number,sb);
	}

}
//Does not work for negative number -123 and return -123