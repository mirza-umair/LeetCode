package com.umair.easy;

import com.umair.model.ListNode;

//21. Merge Two Sorted Lists
public class MergeTwoSortedLists {
	// time O(n) space O(1)
	public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
		ListNode root = new ListNode();
		ListNode prev = root;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				prev.next = list1;
				list1 = list1.next;
			} else {
				prev.next = list2;
				list2 = list2.next;
			}
			prev = prev.next;
		}
		prev.next = list1 != null ? list1 : list2;
		return root.next;
	}

	// time O(n) space O(n)
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode curr = null;

		if (l1.val < l2.val) {
			curr = l1;
			curr.next = mergeTwoLists(l1.next, l2);
		} else {
			curr = l2;
			curr.next = mergeTwoLists(l1, l2.next);
		}

		return curr;

	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2));
		ListNode list2 = new ListNode(1, new ListNode(3));

		System.out.println(new MergeTwoSortedLists().mergeTwoLists(list1, list2));
	}
}
