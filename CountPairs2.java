package com.usc.ctcl.tree;

import java.util.HashSet;
import java.util.Set;

public class CountPairs2 {

	public static void main(String[] args) {
		int[] array = { 4,5,1,2,3,0};
		int countFinal = countPairs(array,2);
		System.out.println(countFinal);

	}

	private static int countPairs(int[] a, int sum) {
		if(a.length<2) return 0;
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num : a){
			int target = sum - num;
			if(!set.contains(target)){
				set.add(num);
			}else{
				count++;
			}
		}
		return count;
	}

}
//Assumption: Array does not contain any duplicate elements and (n,n) cannot be pair
//Tc o(n) SC o(n)
// we are iterating only once over the arrray 'n' elements and there are 'n' elements then time complexity is o(n)
// At worst case all elements of array can be added into hashset 'set', so space is o(n), since there are 'n' elements