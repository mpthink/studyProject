package com.think.lintcode;

import java.util.Collections;
import java.util.LinkedList;

public class MinStack {
	/*
	    * @param a: An integer
	    */
	int size = 0;
	LinkedList<Integer> stack;
	LinkedList<Integer> stack2;

	public MinStack(int a) {
		// do intialization if necessary
		size = a;
		stack = new LinkedList<>();
		stack2 = new LinkedList<>();
	}

	/*
	 * @param number: An integer
	 * @return: nothing
	 */
	public void push(int number) {
		// write your code here
		if (stack.size() > size) {
			return;
		}
		stack.add(number);
		stack2.add(number);
		Collections.sort(stack2);
	}

	/*
	 * @param a: An integer
	 * @return: An integer
	 */
	public int pop() {
		// write your code here
		int result = stack.removeLast();
		stack2.remove(Integer.valueOf(result));
		return result;
	}

	/*
	 * @param a: An integer
	 * @return: An integer
	 */
	public int min() {
		// write your code here
		return stack2.getFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack(10);
		minStack.push(2);
		minStack.push(3);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
		System.out.println(minStack.stack);
		System.out.println(minStack.stack2);

	}

}
