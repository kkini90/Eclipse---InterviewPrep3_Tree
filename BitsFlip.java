package com.usc.ctcl.tree;

public class BitsFlip {

	public static void main(String[] args) {
		flipBits(new int[]{1,0,1,0,0,1,0,1});

	}
	private static void flipBits(int[] array) {

		int maxDiff = 0;
		int flipStartIndex = 0;
		int flipEndIndex = 0;
		int onesToFlip = 0;
		int totNoOfOnes = 0;

		int currDiff = 0;
		int currStart = 0;
		int currOnesToFlip = 0;

		for (int i = 0; i < array.length; i++) {
		    if (array[i] == 0) {
				currDiff -= 1;
		    } else {
				currDiff += 1;
				currOnesToFlip++;
				totNoOfOnes++;
		    }
		    if (currDiff < maxDiff) {
				maxDiff = currDiff;
				flipStartIndex = currStart;
				flipEndIndex = i;
				onesToFlip = currOnesToFlip;
		    } else if (currDiff > 0) {
				currDiff = 0;
				currStart = i + 1;
				currOnesToFlip = 0;
		    }
		}
		System.out.println(flipEndIndex - flipStartIndex + 1 - onesToFlip +   totNoOfOnes - onesToFlip);
	}

}
