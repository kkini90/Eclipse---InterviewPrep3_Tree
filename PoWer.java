package com.usc.ctcl.tree;

public class PoWer {

	public static void main(String[] args) {
		System.out.println(myPow(2,-3));

	}
	public static double myPow(int x,int n) {
	       double temp = x;
	       if(n == 0){
	           return 1;
	       }
	       temp = myPow(x,n/2);
	       if(n%2 == 0){
	           return temp*temp;
	       }else{
	           if(n>0){
	               return temp*temp*x;
	           }else{
	               return (temp*temp)/x;
	           }
	       }	       
	    }
    }
	//TC:log(n)