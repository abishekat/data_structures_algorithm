package org.datastructure.binarysearchtree;

public class RBST {
	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	Node root;

	private Node rInsert(Node currentNode, int value) {
		if (currentNode == null)
			return new Node(value);

		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else {
			currentNode.right = rInsert(currentNode.right, value);
		}
		return currentNode;
	}

	public void rInsert(int value) {
		if (root == null)
			root = new Node(value);
		rInsert(root, value);
	}

	private Node rDelete(Node currentNode, int value) {
		if (currentNode == null)
			return null;
		if (value < currentNode.value) {
			currentNode.left = rDelete(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = rDelete(currentNode.right, value);
		} else {
			if (currentNode.left == null && currentNode.right == null) {
				return null;
			} else if (currentNode.left == null) {
				currentNode = currentNode.right;
			} else if (currentNode.right == null) {
				currentNode = currentNode.left;
			} else {
				int subTreeMin = minValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = rDelete(currentNode.right, value);
			}

		}

		return currentNode;
	}

	public void rDelete(int value) {
		rDelete(root, value);

	}

	public int minValue(Node currentNode) {
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}

	private boolean rContains(Node currentNode, int value) {
		if (currentNode == null)
			return false;
		if (currentNode.value == value)
			return true;

		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}

	public boolean rContains(int value) {
		return rContains(root, value);
	}

}
