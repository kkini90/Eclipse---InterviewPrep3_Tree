package com.usc.ctcl.tree;

public class SecondHighest {

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,2,1,1};
		int high1 = Integer.MIN_VALUE;
	    int high2 = Integer.MIN_VALUE;
	    for (int num : nums) {
	      if (num > high1) {
	        high2 = high1;
	        high1 = num;
	      } else if (num > high2 && high1!=num) {
	        high2 = num;
	      }
	    }
	    System.out.println(high2);
	}
}
//http://stackoverflow.com/questions/2615712/finding-the-second-highest-number-in-array