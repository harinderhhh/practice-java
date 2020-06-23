package com.harinder.java.learning;

// Type declaration for a linked list
public class ListNode {
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return this.next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	// Traversing a singley LL, Time Complexity: O(n), Space Complexity: O(1) for temporary variable
	public int listLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
}

