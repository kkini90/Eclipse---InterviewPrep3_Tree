package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		int length = lengthOfLIS(new int[]{1,2,5,4,3,101,102});
		System.out.println(length);

	}
	public static int lengthOfLIS(int[] nums) 
	{
	    List<Integer> sequence = new ArrayList();
	    for(int n : nums) update(sequence, n);
	    
	    return sequence.size();
	}

	private static void update(List<Integer> seq, int n)
	{
	    if(seq.isEmpty() || seq.get(seq.size() - 1) < n) seq.add(n);
	    else
	    {
	        seq.set(findFirstLargeEqual(seq, n), n);
	    }
	}

	private static int findFirstLargeEqual(List<Integer> seq, int target)
	{
	    int lo = 0;
	    int hi = seq.size() - 1;
	    while(lo < hi)
	    {
	        int mid = lo + (hi - lo) / 2;
	        if(seq.get(mid) < target) lo = mid + 1;
	        else hi = mid;
	    }
	    
	    return lo;
	}

}
//https://leetcode.com/problems/longest-increasing-subsequence/
//Time complexity: nlogn