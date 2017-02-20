package com.usc.ctcl.tree;

public class Dup3Array {

	public static void main(String[] args) {
		System.out.println(dupArray(new int[]{1,1,1,1,2,2,3,3,3}));

	}

	private static int dupArray(int[] arr) {
		/*int count =1;
		int last = arr[0];
		
		StringBuilder sb = new StringBuilder();
		sb.append(last);
		
		for(int i=1;i<arr.length;i++){
			if(last == arr[i]){
				if(count !=3){
					count++;
					sb.append(last);
				}				
			}else{
				count =1;
				last = arr[i];
				sb.append(last);
			}
		}
		System.out.println(sb.toString());
		return sb.toString().length();*/
		int i=0;
		for(int n : arr){
			if(i < 3 || n > arr[i-3]){
				arr[i++] = n;
 			}			
		}		
		return i;
	}

}
