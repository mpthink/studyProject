package com.think.lintcode;

public class LongestPalindrome {

	public String longestPalindrome(String s) {

		for (int size = s.length(); size > 0; size--) {
			for (int low = 0, high = low + size - 1; high < s.length(); low++, high++) {
				if (shrinkCheckPalindrome(s, low, high)) {
					return s.substring(low, high + 1);
				}
			}
		}
		return s.substring(0, 1);

	}

	private boolean shrinkCheckPalindrome(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			} else {
				return false;
			}
		}
		return true;
	}

	private int max = 0;
	private String reString = "";

	public String longestPalindrome2(String s) {
		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			checkPalindromeExpand(s, i, i);
			checkPalindromeExpand(s, i, i + 1);
		}
		return reString;
	}



	private void checkPalindromeExpand(String s, int low, int high) {
		while (low >= 0 && high < s.length()) {
			if (s.charAt(low) == s.charAt(high)) {
				if (high - low + 1 > max) {
					max = high - low + 1;
					reString = s.substring(low, high + 1);
				}
				low--;
				high++;
			} else {
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome test = new LongestPalindrome();
		System.out.println(test.longestPalindrome2("abac"));

	}

}
