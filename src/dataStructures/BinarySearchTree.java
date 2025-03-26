package dataStructures;

public class BinarySearchTree {

	private static class Node {
		private int value;
		int height;
		private Node left;
		private Node right;

		// constructor for Node
		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

	private Node root;

	public BinarySearchTree() {

	}

	// To find the height of a node
	public int height(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

	// to check if the tree is empty
	public boolean isEmpty() {
		return root == null;
	}

	public void display() {
		display(root, "Root Node: ");
	}

	private void display(Node node, String details) {
		if (node == null) {
			return;
		}
		System.out.println(details + node.getValue());
		display(node.left, "Left child of " + node.getValue() + ": ");
		display(node.right, "Right child of " + node.getValue() + ": ");
	}

	// Number of comparisons happening in these trees are same as the number of
	// levels
	// and number of levels = log2(nodes+1)-1 so comparisons will be

	public void insert(int value) {
		root = insert(value, root);
	}

	public Node insert(int value, Node node) {
		if (node == null) {
			return new Node(value);
		}
		if (value < node.value) {
			node.left = insert(value, node.left);
		} else {
			node.right = insert(value, node.right);
		}
		node.height = Math.max(height(node.left), height(node.right)) + 1;
		return node;
	}

	// Check if tree is balanced or not
	public boolean balanced() {
		return balanced(root);
	}

	private boolean balanced(Node node) {
		if (node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	}
	
	public static void main(String args) {
		

	}

}
