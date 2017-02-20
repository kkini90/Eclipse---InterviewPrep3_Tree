package com.usc.ctcl.tree;

public class FuzzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			if(i%15==0){
				System.out.print("FUZZBUZZ ");
			}else if(i%5==0){
				System.out.print("BUZZ ");
			}else if(i%3==0){
				System.out.print("FUZZ ");
			}else{
				System.out.print(i + " ");
			}
		}
	}

}
