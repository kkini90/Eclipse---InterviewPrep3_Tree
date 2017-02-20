package com.usc.ctcl.tree;

public class GraphPath {
	
	enum State{unvisited,visited,visiting;}

	boolean search(Graph g , Node start, Node end){
	    if(start == end) return true;
	    
	    InsertInSortedList<Node> q = new InsertInSortedList<Node>();
	    for(Node u : g.getNodes()){
	        u.state = State.unvisited;
	    }
	    
	    start.state = State.visiting;
	    q.add(start);
	    
	    while(!q.isEmpty()){
	        Node u = q.removeFirst();
	        if(u!= null){
	            for(Node v : u.getAdjacent()){
	                v.state = State.unvisited;
	                if( v == end){
	                    return true;
	                }else{
	                    v.state = State.visiting;
	                    q.add(v);
	                }
	            }
	        }
	        u.state = State.visited;
	    }
	    return false;
	}
}
