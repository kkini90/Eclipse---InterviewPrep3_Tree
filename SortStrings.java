package com.usc.ctcl.tree;
public class SortStrings {

	public static void main(String[] args) {
		String array[] = { "abc","bca","abb" };
		String temp;

		for (int j = 0; j < array.length - 1; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].trim().compareTo(array[j].trim()) < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (String str : array) {
			System.out.println(str);
		}
	}
}
