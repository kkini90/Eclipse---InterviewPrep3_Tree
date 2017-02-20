package com.usc.ctcl.tree;


public class ClosestBST {
  
   private static int resultNode = 0;
   private static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
		  
		TreeNode root = new TreeNode(40);
		root.left = new TreeNode(30); 				
		root.right = new TreeNode(70);
		root.left.left = new TreeNode(25);
		root.left.left.left = new TreeNode(10);
		root.left.left.right = new TreeNode(27);
		int result = findClosestBST(root,29); 
		System.out.println("Closest BST value : " + result);

	}

	private static int findClosestBST(TreeNode root,int value) {
		helper(root,value);
		return resultNode;
	}

	private static void helper(TreeNode root, int value) {
		if(root == null){
			return;
		}
		if(Math.abs(root.val - value) < min){
			min = Math.abs(root.val - value);
			resultNode = root.val;
		}
		if(root.val > value){
			helper(root.left,value);
		}else{
			helper(root.right,value);
		}
	}

}

class TreeNode {
	int val;
	TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
	}
}
//http://www.programcreek.com/2014/05/leetcode-closest-binary-search-tree-value-java/
