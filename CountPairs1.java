package com.usc.ctcl.tree;

public class CountPairs1 {

	public static void main(String[] args) {
		int[] array = { 4,5,1,2,3,0};
		int count = countPairs(array,2);
		System.out.println(count);
	}

	/**
	 * 
	 * countPairs returns the number of pairs
	 * 
	 * of integers in a that add up to x.
	 * 
	 * Given a = [1,2,3,4] and x = 5, countPairs
	 * 
	 * should return 2. This is because
	 * 
	 * the sum of [1,4] is 5 and the sum of [2,3]
	 * 
	 * is 5 and those are the only two
	 * 
	 * pairs that add up to 5.
	 * 
	 */

	static int countPairs(int a[], int x)
	{
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == x) {
					count++;
				}
			}
		}
		return count;
	}
}
//Assumption: Array does not contain any duplicate elements and (n,n) cannot be pair

//1.  if(i+j==x) condition is wrong as we need to compare the sum of 2 array elements with 'x'. 
//But instead the code is adding up 2 index (i and j) and 
//checking if sum is equal to 'x'

//1.1 outer loop start with index 0 and runs upto last but one element( <len-1)
// inner loop start with index =1 and and runs upto last element (<len)

//2.TC : O(n2) since we are comparing each array element with every other element ( 2 for loops)

//2.1. SC:o(1) since we are using constant space 'count' integer variable
