package com.usc.ctcl.tree;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKLargest {

	public static void find(int[] A, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(k);// Min heap because
															// the element has
															// to be greater
															// than the smallest
															// element in the
															// heap in order
															// to be qualified
															// to be a member of
															// top k elements.
		for (int i = 0; i < A.length; i++) {
			if (i < k) // add until heap is filled with k elements.
				pq.add(A[i]);
			else if (pq.peek() < A[i]) { // check if it's bigger than the
											// smallest element in the heap.
				pq.poll();
				pq.add(A[i]);
			}
		}
		int[] topK = new int[pq.size()];
		int index = 0;
		while (index != k)
			topK[index++] = pq.poll();
		System.out.println(Arrays.toString(topK));
	}

	public static void main(String[] args) {
		int[] arr = { 1,7,3,6,2,10,14,12 };
		find(arr, 4);
	}
}
/*
Following is a heap based elegant solution in Java with complexity O(nlogK). 
It's not the most efficient but i think it's easy enough to understand. 
You can change Integer to Float if you want a float based solution
*/