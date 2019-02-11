package com.pankaj;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		bTree.root = new Node(2);
		bTree.root.left = new Node(1);
		bTree.root.right = new Node(3);
	}
}

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

}