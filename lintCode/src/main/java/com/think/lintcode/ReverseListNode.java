package com.think.lintcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseListNode {

	public ListNode reverse(ListNode head) {
		List<Integer> aList = new ArrayList<>();
		if (head != null) {
			aList.add(head.val);
		} else {
			return null;
		}
		ListNode tempNode = null;
		while ((tempNode = head.next) != null) {
			aList.add(tempNode.val);
			head = tempNode;
		}
		ListNode head2 = new ListNode(0);
		ListNode head1 = head2;
		for (int i = aList.size() - 1; i >= 0; i--) {
			head2.next = new ListNode(aList.get(i));
			head2 = head2.next;
		}
		return head1.next;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
