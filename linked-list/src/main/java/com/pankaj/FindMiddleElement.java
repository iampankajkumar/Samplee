package com.pankaj;

public class FindMiddleElement {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		FindMiddleElement llist = new FindMiddleElement();

		for (int i = 5; i > 0; --i) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}

	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" + slow_ptr.data + "] \n");
		}
	}

	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;

	}

	public void printList() {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + "->");
			tNode = tNode.next;
		}
		System.out.println("NULL");
	}

}
