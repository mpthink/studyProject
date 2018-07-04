package com.think.lintcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityNumber {

	/*
	 * @param nums: a list of integers
	 * @return: find a  majority number
	 */
	public static int majorityNumber(List<Integer> nums) {
		// write your code here
		int idxMajority = 0;
		int cntMajority = 1;
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(idxMajority) == nums.get(i)) {
				cntMajority++;
			} else {
				cntMajority--;
			}
			if (cntMajority == 0) {
				i++;
				idxMajority = i;
				cntMajority = 1;
			}
		}
		return nums.get(idxMajority);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> test = new ArrayList<Integer>();
		test.add(4);
		test.add(3);
		test.add(4);
		System.out.println(majorityNumber(test));
	}

}
