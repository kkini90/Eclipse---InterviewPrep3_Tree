package com.usc.ctcl.tree;

import java.util.HashSet;

public class PairSum_NoDup {

	public static void main(String[] args) {
		int[] a = { 3,5,1, 1, 2, 3, 4, 4, 2, 3 ,1,0,8,5,3};
		int sum = 8;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : a) {
			int target = sum - num;
			if (set.contains(target) && !set.contains(num)) {
				System.out.println(num + " " + target);
			}
			set.add(num);
		}
	}

}
