package com.think.lintcode;

public class MonotoneIncreasingDigits {

	public static int monotoneIncreasingDigits(int n) {
		String nString = String.valueOf(n);
		char[] nchars = nString.toCharArray();
		int length = nchars.length;
		int j = length;
		for (int i = length - 1; i > 0; --i) {
			if (nchars[i] >= nchars[i - 1]) {
				continue;
			}
			--nchars[i - 1];
			j = i;
		}
		for (int i = j; i < length; i++) {
			nchars[i] = '9';
		}
		return Integer.valueOf(String.valueOf(nchars));

	}

	public static void main(String[] args) {
		System.out.println(monotoneIncreasingDigits(1));
	}

}
