package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

	public static void main(String[] args) {
		List<List<Integer>> res = generate(5);
		System.out.println(res);
		

	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        
        if(numRows<=0){
            return allRows;
        }
        for(int i=0;i<numRows;i++){
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        return allRows;
    }

}
