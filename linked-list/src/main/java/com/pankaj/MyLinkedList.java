package com.pankaj;

public class MyLinkedList {

	Node first;
	Node last;

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.push(i);
			list.traverse();
		}
	}

	public void push(int data) {
		Node l = last;
		Node newNode = new Node(data);
		last = newNode;
		if (l == null)
			first = newNode;
		else
			l.next = newNode;
	}

	public void traverse() {
		Node node = first;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("NULL");
	}

}
