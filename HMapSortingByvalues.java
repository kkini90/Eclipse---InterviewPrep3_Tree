package com.usc.ctcl.tree;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HMapSortingByvalues {
  public static void main(String[] args) {
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(10, "A");
      hmap.put(19, "A");
      hmap.put(9, "A");
      hmap.put(2, "B");
      hmap.put(100, "A");
      hmap.put(99, "C");
      
      
      System.out.println("Before Sorting:");
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue());
      }
      Map<Integer, String> map = sortByValues(hmap); 
      
      System.out.println("After Sorting:");
      Set set2 = map.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();
           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
      }
  }
  //sort by value first, if values are same then sort by key
  private static HashMap sortByValues(HashMap map) { 
       List list = new LinkedList(map.entrySet());
       // Defined Custom Comparator here
       Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               int cmp1 = ((Comparable) ((Map.Entry) (o1)).getValue())
                  .compareTo(((Map.Entry) (o2)).getValue());
               if(cmp1!=0){
            	   return cmp1;
               }else{
            	   return ((Comparable) ((Map.Entry) (o1)).getKey())
                           .compareTo(((Map.Entry) (o2)).getKey());
               }
            }
       });

       // Here I am copying the sorted list in HashMap
       // using LinkedHashMap to preserve the insertion order
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
}