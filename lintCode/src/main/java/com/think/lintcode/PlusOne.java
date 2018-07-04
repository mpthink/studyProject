package com.think.lintcode;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne2(int[] digits) {
		int length = digits.length;
		if (digits[length - 1] < 9) {
			digits[length - 1] = digits[length - 1] + 1;
			return digits;
		}
		int num = 0;
		for (int i = 0; i < length; i++) {
			num = (int) (num + digits[i] * Math.pow(10, length - i - 1));
		}
		int result = num + 1;
		String s_result = String.valueOf(result);
		char[] charArray = s_result.toCharArray();
		int[] temp = new int[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			temp[i] = charArray[i] - 48;
		}
		return temp;
	}

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		boolean flag = false;
		if (digits[length - 1] < 9) {
			digits[length - 1] = digits[length - 1] + 1;
			return digits;
		} else {
			digits[length - 1] = 0;
			flag = true;
		}

		int[] result1 = new int[length + 1];
		for (int i = length - 2; i >= 0; i--) {
			if (digits[i] < 9 && flag == true) {
				digits[i] = digits[i] + 1;
				flag = false;
			} else if (digits[i] == 9 && flag == true) {
				digits[i] = 0;
				flag = true;
			}
		}
		if (digits[0] == 0) {
			result1[0] = 1;
			return result1;
		} else {
			return digits;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2, 4, 9, 3, 9};
		System.out.println(Arrays.toString(plusOne(test)));
	}

}
