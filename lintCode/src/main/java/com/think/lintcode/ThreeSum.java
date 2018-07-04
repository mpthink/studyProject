package com.think.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	List<List<Integer>> ret = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; ++i) {
			twoSum(nums, i + 1, 0 - nums[i]);
			while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
				++i;
			}
		}
		return ret;
	}

	public void twoSum(int[] nums, int start, int value) {
		int beg = start;
		int end = nums.length - 1;
		while (beg < end) {
			if (nums[beg] + nums[end] == value) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(nums[start - 1]);
				list.add(nums[beg]);
				list.add(nums[end]);
				ret.add(list);
				while (beg < end && nums[beg + 1] == nums[beg]) {
					beg++;
				}
				while (beg < end && nums[end - 1] == nums[end]) {
					end--;
				}
				beg++;
				end--;

			} else if (nums[beg] + nums[end] > value) {
				end--;
			} else {
				beg++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {-2, -3, 5, -1, -4, 5, -11, 7, 1, 2, 3, 4, -7, -1, -2, -3, -4, -5};
		System.out.println(new ThreeSum().threeSum(test));
	}

}
