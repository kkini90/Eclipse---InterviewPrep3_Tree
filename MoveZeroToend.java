package com.usc.ctcl.tree;

public class MoveZeroToend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,0,2,0,4,0,5};
		
		moveZeroToEnd(array,array.length);
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}

	}
	
	private static void moveZeroToEnd(int[] arr,int n){
		int count =0;		
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[count++]  = arr[i];
			}
		}		
		while(count<n){
			arr[count++] = 0;
		}
	}

}
