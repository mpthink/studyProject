package com.think.lintcode;

public class MergeTwoLists {


	/*
	 * @param l1: ListNode l1 is the head of the linked list
	 * @param l2: ListNode l2 is the head of the linked list
	 * @return: ListNode head of linked list
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// write your code here
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while (l1 != null & l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else if (l2.val <= l1.val) {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		while (l1 != null) {
			temp.next = l1;
			l1 = l1.next;
			temp = temp.next;
		}

		while (l2 != null) {
			temp.next = l2;
			l2 = l2.next;
			temp = temp.next;
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
