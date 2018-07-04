package com.think.lintcode;

public class ClimbStairs {

	public static int climbStairs(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);
	}

	public static int climbStairs2(int n) {
		if (n <= 1) {
			return n;
		}
		int last = 1, lastlast = 1;
		int now = 0;
		for (int i = 2; i <= n; i++) {
			now = last + lastlast;
			lastlast = last;
			last = now;
		}
		return now;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs2(40));
	}

}
