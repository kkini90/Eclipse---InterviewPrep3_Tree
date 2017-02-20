package com.usc.ctcl.tree;

public class SortOneSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 5, 3, 3, 7 };
		if (solution(arr, arr.length)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean solution(int[] data, int n) {
		if (data == null)
			return false;
		int max = data[0], maxIndex = 0;

		// find the maximum element in array
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
				maxIndex = i;
			}
		}

		// check whether all the elements before max are less than it
		// if not you need more swaps to sort
		for (int j = 0; j < maxIndex; j++) {
			if (data[j] > max)
				return false;
		}

		// check what is next smallest element
		for (int j = maxIndex + 1; j < data.length - 1; j++) {
			if (!(max > data[j] && data[j + 1] < data[j]))
				return false;
		}

		return true;
	}
}
