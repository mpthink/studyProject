package com.think.lintcode;

public class InvertBinaryTree {

	/*
	 * @param root: a TreeNode, the root of the binary tree
	 * @return: nothing
	 */
	public void invertBinaryTree(TreeNode root) {
		// write your code here
		TreeNode left = root.left;
		TreeNode right = root.right;
		TreeNode temp = left;
		root.left = right;
		root.right = temp;
		if(root.left!=null) {
			invertBinaryTree(root.left);
		}
		if(root.right!=null) {
			invertBinaryTree(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
