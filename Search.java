package com.usc.ctcl.tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Search {

    private static String START = "A";
    private static String END = "C";
    private static 	List<String> res = new ArrayList<String>();
    
    public static void main(String[] args) {	
		String line = null;
		List<String> list = new ArrayList<>();
		Graph graph = new Graph();
		try {
			File file = new File("/Users/kkini/Documents/workspace/Interview_Prep_3/src/com/usc/ctcl/tree/input1.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			String[] sp = list.get(0).split(" ");
			START = sp[0];
			END = sp[1];
			list.remove(0);
			for(String lne : list){
				String[] e = lne.split(" : ");
				String[] ex = e[1].split(" ");
				for(String es : ex){
					graph.addEdge(e[0], es);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        LinkedList<String> visited = new LinkedList();
        visited.add(START);
        new Search().depthFirst(graph, visited);
        System.out.println(res);
    }

    private void depthFirst(Graph graph, LinkedList<String> visited) {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(END)) {
                visited.add(node);
                printPath(visited);
                visited.removeLast();
                break;
            }
        }
        for (String node : nodes) {
            if (visited.contains(node) || node.equals(END)) {
                continue;
            }
            visited.addLast(node);
            depthFirst(graph, visited);
            visited.removeLast();
        }
    }

    private static void printPath(LinkedList<String> visited) {
    	String x = " ";
        for (String node : visited) {
            //System.out.print(node);
            //System.out.print(" ");
        	x=x+node;
        }
        res.add(x);
        //System.out.println();
    }
}
