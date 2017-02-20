package com.usc.ctcl.tree;

public class RevArrayGroups {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		int n = array.length;
		int size = 3;
		reverseArray(array,n,size);
	}
	
	private static void reverseArray(int[] a,int n, int size){
		if(a.length < size){
			return;
		}
		for(int i=0;i<n;i+=size){
			int left = i;
			int right = Math.min(i+size-1, n-1);
			while(left < right){
				swap(a,left,right);
			}			
		}
	}
	
	private static void swap(int[] array,int left,int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		left++;
		right--;
	}
}

//http://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/