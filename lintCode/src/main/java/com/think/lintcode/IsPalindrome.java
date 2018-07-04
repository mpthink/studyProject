package com.think.lintcode;

public class IsPalindrome {

	/*
	 * @param num: a positive number
	 * @return: true if it's a palindrome or false
	 */
	public static boolean isPalindrome(int num) {
		// write your code here
		String numStr1 = String.valueOf(num);
		char[] chars = numStr1.toCharArray();
		StringBuffer numStr2 = new StringBuffer();
		for (int i = chars.length - 1; i >= 0; i--) {
			numStr2.append(String.valueOf(chars[i]));
		}
		if (numStr1.equals(numStr2.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}

}
