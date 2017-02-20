package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {
		int[] f = {4,5,6,7,8,8};
		int[] m = {5,6,6,7,8,8,9};
		int[] res =sortIntersect(f,m);
		
		for(int val : res){
			System.out.println(val);
		}

	}
	private static int[] sortIntersect(int[] f, int[] m) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int fVal : f){
            if(!map.containsKey(fVal)){
                map.put(fVal,1);
            }else{
                map.put(fVal,map.get(fVal)+1);
            }
        }
        
        for(int mVal : m){
            if(map.containsKey(mVal) && map.get(mVal)>0){
                list.add(mVal);
                map.put(mVal,map.get(mVal)-1);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        Arrays.sort(result);//sort in asc
        for(int i=0;i<result.length/2;i++){//sort in desc
            int temp = result[i];
            result[i] = result[result.length-i-1];
            result[result.length-i-1] = temp;
        }
        return result;
    }
}
