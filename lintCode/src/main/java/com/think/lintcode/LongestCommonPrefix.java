package com.think.lintcode;

public class LongestCommonPrefix {

	/*
	 * @param strs: A list of strings
	 * @return: The longest common prefix
	 */
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		String minStr = strs[0];
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minStr.length()) {
				minStr = strs[i];
			}
		}
		char[] chars = minStr.toCharArray();
		StringBuffer maxPrefix = new StringBuffer();
		for (int j = 0; j < chars.length; j++) {
			for (int k = 0; k < strs.length; k++) {
				if (strs[k].charAt(j) != chars[j]) {
					return maxPrefix.toString();
				}
			}
			maxPrefix.append(chars[j]);
		}
		return maxPrefix.toString();
	}

	public static void main(String[] args) {
		String[] teStrings = {"ABCD", "ABEF", "ACEF"};
		System.out.println(longestCommonPrefix(teStrings));
	}

}
