package com.usc.ctcl.tree;

public class ClosestPair {

	public static void main(String[] args) {
		int[] array = {-1,10,11,100};
		java.util.Arrays.sort(array);
		int dmax = Integer.MAX_VALUE;
		int[] result = new int[2];
		
		for(int i=0;i<array.length-1;i++){
			int diff = Math.abs(array[i]-array[i+1]);
			if(diff<dmax){
				dmax =diff;
				result[0] = array[i];
				result[1] = array[i+1];
			}
			
		}
		
		for(int i :result){
			System.out.println(i);
		}
	}

}
