package com.usc.ctcl.tree;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 
 * 				  10 
 * 			9 			11 
 * 		8	   7   null 	5
 */

class Node12 {
	public int data;
	public Node12 left;
	public Node12 right;
	public Node12 parent;

	public Node12(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
}

public class Sibling {
	public Node12 Moveup(Node12 n) {
		Node12 q = n;
		Node12 x = q.parent;
		while (x != null) {
			q = x;
			x = x.parent;
		}
		return q;
	}

	public Node12 findSibling(Node12 n){
		if(n==null) 
			return null;
		Node12 root = Moveup(n);
		ArrayList<LinkedList<Node12>>  result = new ArrayList<LinkedList<Node12>>();
		LinkedList<Node12> current  = new LinkedList<Node12>();
		if(root!=null){
		current.add(root);
		}//end of if
		
		while(current.size()>0){
			result.add(current);
			LinkedList<Node12> parents = current;
			current = new LinkedList<Node12>();
			for(Node12 parent : parents){
				if(parent.left!=null){
					current.add(parent.left);
				}
				if(parent.right!=null){
				current.add(parent.right);
				}
			}//end of for
		}//end of while
		//10
		//9->11
		//8 ->7->null->5
	
		for(LinkedList<Node12> lList : result){
			System.out.println(lList);
			for(Node12 nde :lList ){
				if(nde.data == n.data) return nde;
			}
		}
	return null;
	}// end
	// of
	// func
	public static void main(String[] args) {
		Node12 root = new Node12(1);
		root.left = new Node12(2);
		root.right = new Node12(3);
		root.left.left = new Node12(4);
		root.left.right = new Node12(5);
		root.right.left = new Node12(6);
		root.right.right = new Node12(7);

		Sibling sib = new Sibling();
		Node12 siblingRes = sib.findSibling(root.left.left); //Node 4
		System.out.println("Sibling result:" + siblingRes.data);
	}
																									
}
