package com.think.lintcode;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = reverseInteger(0);
		System.out.println(n);
	}

	public static int reverseInteger(int n) {

		String flag = "";
		if (n < 0) {
			flag = "-";
			n = Math.abs(n);
		}

		String nString = Integer.toString(n);
		char[] nchars = nString.toCharArray();
		char[] newChar = new char[nchars.length];
		int j = 0;
		for (int i = nchars.length - 1; i >= 0; i--) {
			newChar[j] = nchars[i];
			j++;
		}

		long temp = Long.valueOf(String.valueOf(newChar));
		if (temp > 2147483648L) {
			return 0;
		}

		int result = Integer.valueOf(flag + String.valueOf(newChar));
		return result;
	}

}
