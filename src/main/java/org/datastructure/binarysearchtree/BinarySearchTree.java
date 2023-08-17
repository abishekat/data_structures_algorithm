package org.datastructure.binarysearchtree;

public class BinarySearchTree {
	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	Node root;

// Automatically root sets to null in line 14
//	public BinarySearchTree(int value) {
//		Node newNode = new Node(value);
//		root = newNode;
//
//	}

	public boolean insert(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (newNode.value == temp.value)
				return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	public boolean contains(int value) {

//		if (root == null)
//			return true;

		Node temp = root;
		while (temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if (value > temp.value) {
				temp = temp.right;
			} else {
				return true;
			}
		}
		return false;
	}

}
