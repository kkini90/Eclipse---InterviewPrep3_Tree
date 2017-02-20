package com.usc.ctcl.tree;

public class Test12 {

	public static void main(String[] args) {
		System.out.println(is(8));

	}

	private static boolean is(Integer input) {
		if(input ==0) return false;
		Integer[] div =  new Integer[500];
		getDiv(input,div);
		int sum =0;
		boolean perfect = false;
		for(int i=0;div[i]!=null;i++){
			sum+=div[i];
		}
		if(sum == input){
			return true;
		}
		return perfect;
	}

	private static void getDiv(Integer input, Integer[] div) {
		// TODO Auto-generated method stub
		int index= 0;
		for(int j=1;j<=input/2;j++){
			if((input%j)==0){
				div[index++] = j;
			}
		}
		
	}
	

}
