package com.umair.easy;

import com.umair.model.ListNode;

//206. Reverse Linked List
public class ReverseLinkedList {

	// time O(n) and space O(n)
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head;
		if (head.next != null) {
			curr = reverseList(head.next);
			head.next.next = head;
		}
		head.next = null;
		return curr;
	}
	
	// 1->2>null

	// time O(n) and space O(1)
	public ListNode reverseList1(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(2);
		ListNode n = new ListNode(1, node);

		System.out.println(new ReverseLinkedList().reverseList(n));

	}
}
