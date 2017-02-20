package com.usc.ctcl.tree;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



public class UserSolution {
 public static int nearest_power_of_two(int n) {
     if(n<=0)return 0;
     int res =2;
     while(res<n){
         res=res*2;
     }
     if(res!=2){
         return res/2;
     }
     return 2;    
 }
}
// n =100  return 64
//n = 2 return 2
//n = 10 return 8


//you can import things up here if you want

public class UserSolution {
 public static int longest_flat(int[] array) {
     int count =1;
     int size = Integer.MIN_VALUE ;
     int last = array[0];
     for(int i=1;i<array.length;i++){
         if(last  == array[i]){
             count++;
         }else{
             if(count>size){
                 size = count;
             }
             count =1;
             last = array[i];
         }
     }
     return size;
 }
}
//[1,100,100,3] return 2

//Write a function that takes two strings, and interleaves their characters.

//Longest palidromic substring

