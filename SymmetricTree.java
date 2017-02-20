package com.usc.ctcl.tree;


public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        return pairs(root.left, root.right);
    }

    public boolean pairs(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) 
        	return true;
        if((t1 == null && t2!=null) || (t2 == null && t1!=null)) 
        	return false;
        if(t1.val != t2.val) 
        	return false;
        return pairs(t1.left, t2.right) && pairs(t1.right, t2.left);
        
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); 				
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(4);

		 /*
		    1
		   / \
		  2   2
		 / \ / \
		3  4 4  3
		
		  */

		SymmetricTree i = new SymmetricTree();
		System.out.println("Is Symmetric Trees : " + i.isSymmetric(root));

	}

}

class TreeNode {
	int val;
	TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
	}
}

