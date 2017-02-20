package com.usc.ctcl.tree;

public class Longest_flat {
	public static void main(String[] args) {
		int size = longest_flat(new int[] {1,1,1,2,2,2,2,3,3,0,0,0,0,0});
		System.out.println(size);
	}

	public static int longest_flat(int[] array) {
		int count = 1;
		int size = Integer.MIN_VALUE;
		int last = array[0];
		for (int i = 1; i < array.length; i++) {
			if (last == array[i]) {
				count++;
				if (count > size) {
					size = count;
				}
			} else {
				
				count = 1;
				last = array[i];
			}
		}
		return size;
	}
}

