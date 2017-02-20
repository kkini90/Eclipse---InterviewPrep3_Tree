package com.usc.ctcl.tree;

public class FractionSimplify {

	public static void main(String[] args) {
		int numbOne,numbTwo;
		int n1 = numbOne = 10;
		int n2 = numbTwo = 15;
		
		int remainder = 0;
		
		while(numbTwo!=0){
			remainder = numbOne %numbTwo;
			numbOne=numbTwo;
			numbTwo=remainder;
		}
		System.out.println("GCD :" + numbOne);
		
		 n1 = n1/numbOne;
		 n2 = n2/numbOne;
		 System.out.println(n1 + " " + n2);

	}

}
