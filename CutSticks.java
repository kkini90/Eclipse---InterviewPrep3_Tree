package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();

	    for(int arr_i=0; arr_i < n; arr_i++){
	        int num = in.nextInt();
	        list.add(num);
	    }

	    //use O(n*log(n))
	    Collections.sort(list);

	    //print out initial arraylist length
	    System.out.println(list.size());

	    while(list.size() > 0){

	        //decrement all elements by minimum value in the arraylist
	        int cut = list.get(0);
	        for(int i = 0; i<list.size(); i++){
	            list.set(i, list.get(i) - cut);
	        }

	        //remove all zeros from arraylist
	        while(list.size() >0 && list.get(0)==0){
	            list.remove(0);
	        }

	        //print out non-empty arraylist size
	        if(list.size() > 0)
	            System.out.println(list.size());
	    }

	}

}
