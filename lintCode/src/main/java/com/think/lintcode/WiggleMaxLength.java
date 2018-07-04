package com.think.lintcode;

public class WiggleMaxLength {

	/**
	 * @param nums: the given sequence
	 * @return: the length of the longest subsequence that is a wiggle sequence
	 */
	public static int wiggleMaxLength(int[] nums) {
		int p = 1;
		int q = 1;
		int n = nums.length;
		for (int i = 1; i < n; ++i) {
			if (nums[i] > nums[i - 1]) {
				p = q + 1;
			} else if (nums[i] < nums[i - 1]) {
				q = p + 1;
			}
		}
		return Math.min(n, Math.max(p, q));
	}


	public static void main(String[] args) {
		int[] nums = {1, 7, 10, 9, 2, 5};
		System.out.println(wiggleMaxLength(nums));

	}

}
