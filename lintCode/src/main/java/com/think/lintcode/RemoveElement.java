package com.think.lintcode;

public class RemoveElement {

	/*
	 * @param A: A list of integers
	 * @param elem: An integer
	 * @return: The new length after remove
	 */
	public static int removeElement(int[] A, int elem) {
		int num = 0, i;
		for (i = 0; i < A.length; ++i) {
			if (A[i] != elem) {
				A[num++] = A[i];
			}
		}
		for (int k = 0; k < A.length; k++) {
			System.out.println(A[k]);
		}
		return num;
	}

	public static void main(String[] args) {
		int[] test = {0, 4, 4, 0, 4, 4, 4, 0, 2};
		System.out.println(removeElement(test, 4));
	}
}
