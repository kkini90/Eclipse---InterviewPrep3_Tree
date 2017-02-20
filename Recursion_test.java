package com.usc.ctcl.tree;

public class Recursion_test {

	public static void main(String[] args) {
		System.out.println(fact(5));

	}
	
	private static int fact(int n){
		int res =0 ;
		
		if(n==0){
			return 1;
		}else{
			res= n*fact(n-1);
		}
		return res;
	}

}
