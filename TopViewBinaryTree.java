package com.usc.ctcl.tree;


public class TopViewBinaryTree {
    public void topViewPrint(TreeNode root) {
        if(root==null){
        	return;
        }
        //Go left
        if(root.left!=null){
        	leftView(root.left);
        }
        //Print root
        System.out.println(root.val);
        //Go right
        if(root.right!=null){
        	rightView(root.right);
        }
    }  

	private void leftView(TreeNode root){
		//Move to extreme left and then print
    	if(root.left!=null){
    		leftView(root.left);
    	}
    	System.out.println(root.val);
    }
	private void rightView(TreeNode root) {
		//Print right element and Move to right one step and so on
		System.out.println(root.val);
		if(root.right!=null){
    		rightView(root.right);
    	}		
	}
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); 				
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(4);

		 /*
		    1
		   / \
		  2   2
		 / \ / \
		   3   4
		
		  */

		TopViewBinaryTree tv = new TopViewBinaryTree();
	    tv.topViewPrint(root);//print 2 1 2 3
	}

}

class TreeNode {
	int val;
	TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
	}
}

