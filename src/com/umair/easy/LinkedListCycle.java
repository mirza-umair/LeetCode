package com.umair.easy;

import java.util.HashSet;
import java.util.Set;

import com.umair.model.ListNode;

//141. Linked List Cycle
public class LinkedListCycle {

	// time O(n) space O(1)
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode l1 = head;
		ListNode l2 = head.next;

		while (l2 != null && l2.next != null) {
			if (l1 == l2)
				return true;
			l1 = l1.next;
			l2 = l2.next.next;
		}
		return false;
	}

	// time O(n) space O(n)
	public boolean hasCycle1(ListNode head) {
		Set<ListNode> visited = new HashSet<>();
		while (head != null) {
			if (visited.contains(head)) {
				return true;
			}
			visited.add(head);
			head = head.next;

		}
		return false;
	}
}
