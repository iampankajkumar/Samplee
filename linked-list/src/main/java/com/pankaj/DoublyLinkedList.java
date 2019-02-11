package com.pankaj;

public class DoublyLinkedList {

	Node head;

	class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		for (int i = 1; i < 6; i++) {
			doublyLinkedList.push(i);
			doublyLinkedList.traverse();
		}
	}

	public void push(int data) {

		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
		} else {
			head.right = new_node;
			new_node.left = head;
			head = new_node;
		}
	}

	public void traverse() {
		Node tNode = head;
		System.out.print("NULL><");
		while (tNode != null) {
			System.out.print(tNode.data + "><");
			tNode = tNode.left;
		}
		System.out.println("NULL");
	}

}
