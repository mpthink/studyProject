package com.think.lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigzagIterator2 {

	/*
	 * @param vecs: a list of 1d vectors
	 */
	private static final Queue<Integer> temp = new LinkedList<>();

	public ZigzagIterator2(List<List<Integer>> vecs) {
		// do intialization if necessary
		int size = vecs.size();
		int length = 0;
		for (List<Integer> list : vecs) {
			length = list.size() > length ? list.size() : length;
		}
		Integer[][] tempArry = new Integer[size][length];
		for (int i = 0; i < vecs.size(); i++) {
			tempArry[i] = vecs.get(i).toArray(new Integer[vecs.get(i).size()]);
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < size; j++) {
				if (i < tempArry[j].length) {
					temp.add(tempArry[j][i]);
				}
			}
		}
	}

	/*
	 * @return: An integer
	 */
	public int next() {
		return temp.remove();
	}

	/*
	 * @return: True if has next
	 */
	public boolean hasNext() {
		return !temp.isEmpty();
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		List<List<Integer>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		List<Integer> result = new ArrayList<>();
		ZigzagIterator2 solution = new ZigzagIterator2(list);
		System.out.println(solution.temp);
		while (solution.hasNext()) {
			result.add(solution.next());
		}
		System.out.println(result);

		Stack<Integer> test = new Stack<Integer>();
		test.push(1);
		System.out.println(test.pop());

	}

}
