package com.usc.ctcl.tree;

public class KeyInBinaryTree {

	public static boolean isPresent(Node root, int x) {
			if (root == null) {
				return false;
			}
			// check if current node has the element we are looking for
			if (root.data == x) {
				return true;
			} else {
			// check if the sub trees
				return isPresent(root.left, x) || isPresent(root.right, x);
			}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		System.out.println("Does 4 exist in the tree: " + isPresent(root, 4));
		System.out.println("Does 7 exist in the tree: " + isPresent(root, 7));

	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}