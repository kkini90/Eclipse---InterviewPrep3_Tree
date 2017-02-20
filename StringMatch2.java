package com.usc.ctcl.tree;

public class StringMatch2 {

	public static void main(String[] args) {
		String txt = "...abcd...xy...abcd...xyz";
		String pttn1 ="abcd";
		String pttn2 ="xyz";
		
		char[] text = txt.toCharArray();
		char[] pattern1 = pttn1.toCharArray();
		char[] pattern2 = pttn2.toCharArray();
		int count1 = 0;
		int count2 = 0;
		
		int n= txt.length();
		//System.out.println(n);
		int m= pttn1.length();
		//System.out.println(m);
		int p= pttn2.length();
		
		for( int i=0 ;i<=(n-m);i++){		
			int j=0 ;
			while(j<m && pattern1[j] == text[i+j])
				j++;
			if(j==m){
				 count1++;
			}
		}
		
		for( int i=0 ;i<=(n-p);i++){	
			int k=0 ;
			while(k<p && pattern2[k] == text[i+k])
				k++;
			if(k==p){
				 count2++;
			}
		}
		System.out.println("Pattern count "+ count1 + " " + count2);

	}

}
