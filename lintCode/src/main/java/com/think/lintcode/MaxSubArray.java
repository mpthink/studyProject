package com.think.lintcode;

public class MaxSubArray {

	/*
	 * @param nums: A list of integers
	 * @return: A integer indicate the sum of max subarray
	 */
	public static int maxSubArray(int[] nums) {
		// write your code here
		int size = nums.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + nums[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {-2, -2, -3, -4, -1, -2, -1, -5, -3};
		System.out.println(maxSubArray(test));

	}

}
