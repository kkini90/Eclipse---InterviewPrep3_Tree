package com.usc.ctcl.tree;

public class CountOneBits {

	public static void main(String[] args) {
		countBits(7);
		//binary of 7 is 0111 so 3

	}
	private static void countBits(int n){
		int count=0;
		while(n!=0){
			count++;
			n = n&(n-1);
		}
		System.out.println(count);
	}
}
