package com.think.lintcode;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwitchWords {

	public static int[][] twitchWords(String str) {
		Map<Integer, Integer> temp = new HashMap<>();
		int[][] result = null;
		char[] charValues = str.toCharArray();
		int count = 1;
		boolean flag = false;
		int start = 0;
		for (int i = 0; i < charValues.length - 1; i++) {

			if (charValues[i] == charValues[i + 1]) {
				count++;
			} else {
				count = 1;
				if (flag) {
					temp.put(start, i);
					flag = false;
					count = 1;
				}
			}
			if (count == 3) {
				flag = true;
				start = i - 1;
			}
		}
		if (flag) {
			temp.put(start, charValues.length - 1);
		}
		result = new int[temp.size()][2];
		int i = 0;
		SortedSet<Integer> keys = new TreeSet<>(temp.keySet());
		for (Integer key : keys) {
			result[i][0] = key;
			result[i][1] = temp.get(key);
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] temp = twitchWords("aqquuuuwwhhhiiiimgyyffffhgyeyyegdvvvvvvvvvhhheiddd");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(temp[i][j]);
			}
		}
	}

}
