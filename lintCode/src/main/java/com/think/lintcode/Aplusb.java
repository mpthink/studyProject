package com.think.lintcode;

public class Aplusb {


	public static int aplusb(int a, int b) {
		if (a + b > Integer.MAX_VALUE || a + b < Integer.MIN_VALUE) {
			return 0;
		}
		return a + b;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		System.out.println(a ^ b);

	}

}
