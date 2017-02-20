package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.List;

public class Diff {

	public static void main(String[] args) {
		int[] arr = {-1,1,3,3,3,2,1,0};
		
		System.out.println(difference(arr,arr.length));

	}
	public static int difference(int[] A,int n){
		 int front = 0, total = 0;
		    int result = 0;
		    List list;
		    for (int back = 0; back < A.length && front < A.length; ) {
		        list = new ArrayList();
		        front = back + 2;
		        total = A[front - 1] - A[back];
		        list.add(back);
		        list.add(front - 1);
		        int i = 0;
		        boolean ok = false;
		        while (front < A.length && A[front] - A[front - 1] == total) {
		            ok = true;
		            i++;
		            list.add(front);
		            back = front;
		            front++;
		            result += i;
		            if (result > 1000000000)
		                return -1;
		        }
		        if (!ok)
		            back++;
		    }
		    return result;
	}

}
