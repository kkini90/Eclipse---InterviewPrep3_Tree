package com.usc.ctcl.tree;

public class RemoveDupChar {

	public static void main(String[] args) {
		String str ="bloommbberrgg";
		char[] cArray = str.toCharArray();
		
		int j=0;
		for(int i=0;i<str.length()-1;i++){
			if(cArray[i] != cArray[i+1]){
				cArray[j++] = cArray[i];
			}
		}
		cArray[j++] = cArray[str.length()-1];
		cArray[j] ='\0';
		
		int z=0;
		while(cArray[z] !='\0'){
			System.out.println(cArray[z++]);
		}
		

	}

}
