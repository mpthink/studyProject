package com.think.lintcode;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		Set<String> setCount = new HashSet<>();
		int i = 0;
		while (head.next != null) {
			ListNode temp = head.next;
			setCount.add(temp.toString());
			i++;
			head = head.next;
			if (setCount.size() < i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
