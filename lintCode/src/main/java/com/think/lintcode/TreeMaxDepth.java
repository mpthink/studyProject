package com.think.lintcode;

public class TreeMaxDepth {

	public static int maxDepth(TreeNode root) {
		// write your code here
		if (root == null) {
			return 0;
		}
		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;
		if (leftNode == null && rightNode == null) {
			return 1;
		}
		int leftMax = 1;
		int rightMax = 1;
		if (leftNode != null) {
			leftMax = leftMax + maxDepth(leftNode);
		}
		if (rightNode != null) {
			rightMax = rightMax + maxDepth(rightNode);
		}
		if (leftMax > rightMax) {
			return leftMax;
		} else {
			return rightMax;
		}
	}



	public static void main(String[] args) {
		TreeNode test1 = new TreeNode(1);
		TreeNode test2 = new TreeNode(2);
		TreeNode test3 = new TreeNode(3);
		TreeNode test4 = new TreeNode(4);
		test1.left = test2;
		test1.right = test3;
		test1.right.right = test4;
		System.out.println(maxDepth(test1));

	}

}
