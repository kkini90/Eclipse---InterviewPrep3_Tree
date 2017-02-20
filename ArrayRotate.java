package com.usc.ctcl.tree;
public class ArrayRotate {

	public static void main(String[] args) {
		System.out.println(roatedLength(new int[] { 3,4,5,1,2 }));
	}

	public static int roatedLength(int[] input) {
		int roated = 0;
		int len = input.length;
		for (int i = 0; i < len; i++) {
			if (input[i] < input[i + 1]) {
				continue;
			}
			while (i < len - 1) {
				roated++;
				i++;
			}
		}
		return roated;
	}
}
