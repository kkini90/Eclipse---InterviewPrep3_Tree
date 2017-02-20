package com.usc.ctcl.tree;

public class isNumber {

	public static void main(String[] args) {
		String str = "123.";
		if(isNum(str)){
			System.out.println("Number");
		}else{
			System.out.println("Not a Number");
		}
	}
	private static boolean isNum(String s){
		//Not valid -123., .2, 12f, -1.2f
		boolean decimalFound = false;
		boolean numFound = false;
		int i= 0;
		char[] str= s.trim().toCharArray();
		if(str[i] == '+' || str[i] == '-'){
			i = 1;
		}
		for(; i<str.length; i++) {
			char c = str[i];
			switch (c) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					numFound = true;
					break;
				case '.':
					if (decimalFound) {
						return false;
					} else if(numFound) {
						decimalFound = true;
					}else{
						return false;
					}
					break;
				default:
					return false;
			}
		}
		return true;
	}

}
