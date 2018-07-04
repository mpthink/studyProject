package com.think.lintcode;

public class ATOI {

	public static int atoi(String str) {
		// write your code here

		// 1.排除特殊情况
		if (str == null || str.length() < 1) {
			return 0;
		}

		// 2.trim
		str = str.trim();

		// 3.处理正负
		char flag = '+';
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}

		// 4.用 double 装
		double result = 0;

		// 5.开始计算值，用与'0'的位差获取数字
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		// 6.把正负符号重新归还
		if (flag == '-') {
			result = -result;
		}

		// 7.处理越界
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("52l111intcode1"));
	}

}
