package com.think.lintcode;

public class MaxProfit {

	/*
	 * @param prices: Given an integer array
	 * @return: Maximum profit
	 */
	public static int maxProfit(int[] prices) {
		// write your code here
		if (prices == null) {
			return 0;
		}
		int length = prices.length;
		if (length == 1) {
			return 0;
		}
		int maxProfit = 0;
		for (int i = 0; i < length - 1; i++) {
			int tempMax = prices[i + 1];
			for (int j = i + 1; j < length; j++) {
				if (tempMax < prices[j]) {
					tempMax = prices[j];
				}
			}
			int tempProfix = tempMax - prices[i];
			if (maxProfit < tempProfix) {
				maxProfit = tempProfix;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {3, 2, 4, 1, 2, 2, 2, 3, 6, 7, 9, 10, 18, 18, 19, 17, 16};
		System.out.println(maxProfit(test));

	}

}
