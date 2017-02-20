package com.usc.ctcl.tree;

public class SquareOfNum {

	public static void main(String[] args) {
		int num = 25;
		int square = findSquare(num);
		System.out.println(square);
	}

	private static int findSquare(int num) {
		int sum  = 0;
		int j=1;
		//if num is -ve, make it positive. Square of -ve num is positive
		if(num<0){
			num = -num;
		}
		//Square of 0 and 1 is same
		if(num ==0 || num ==1){
			return num;
		}
		for(int i=0;i<num;i++,j+=2){
			sum+=j;
		}
		return sum;		
	}
}
//TC: O(n)
/*
 * Pattern 
 * 1*1= 1
 * 2*2 = 1+3
 * 3*3 = 1+3+5
 */
//How can we get square of a number without using * or carrot sign.