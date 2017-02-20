package com.usc.ctcl.tree;

public class InfiniteArrayBinarySearch {

	public static void main(String[] args) {
		
		int[] searchArray = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int key = 10;
		int index = findPosition(searchArray,key);
		if(index == -1){
			System.out.println("Element not found" + index);
		}else{
			System.out.println("Element found at position " + index);
		}
	}

	private static int findPosition(int[] searchArray, int key) {
		int low = 0;
		int high = 1;
		int val = searchArray[high];
		
		while(val < key){
			low = high;
			high = 2*high;
			val = searchArray[high];
		}
		return binarySearch(searchArray, key, low, high);
	}

	private static int binarySearch(int[] searchArray, int key, int low, int high) {
		if(low<=high){
			int mid = (low+high)/2;
			if(searchArray[mid] == key){
				return mid;
			}else if(searchArray[mid] > key){
				return binarySearch(searchArray, key, low, mid-1);
			}else{
				return binarySearch(searchArray, key, mid+1, high);
			}
		}
		return -1;
	}
}
//Time complexity : log(n)
//http://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/