package com.think.lintcode;

public class TrailingZeros {


	public static long trailingZeros(long n) {
		long count = 0;
		for (int i = 1; Math.pow(5, i) < n; i++) {
			count += n / (long) Math.pow(5, i);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(trailingZeros(105));
	}

}
