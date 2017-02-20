package com.usc.ctcl.tree;

public class HollowSquare {

	public static void main(String[] args) {
		HollowSquare.print(4);

	}
	private static void print(int n){
		if( n < 3){
			System.out.println("N must be greater than 2");
			return;
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || i==n || j==n){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
