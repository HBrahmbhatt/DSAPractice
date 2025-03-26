package dataStructures;

import java.util.Scanner;

class BinaryTree {

	// constructor for Binary Tree
	public BinaryTree() {
	}

	private static class Node {
		int value;
		Node left;
		Node right;

		// constructor for Node
		public Node(int value) {
			this.value = value;
		}
	}

	private Node rootNode;

	public void populateBinaryTree(Scanner sc) {
		System.out.println("Enter the value for root Node");
		// start by filling the rootNode
		int val = sc.nextInt();
		rootNode = new Node(val);
		populateBinaryTree(rootNode, sc);
	}

	// Populate left and right sides
	public void populateBinaryTree(Node node, Scanner sc) {
		System.out.println("Write true if you want to add node to the left side of " + node.value);
		boolean left = sc.nextBoolean();
		if (left) {
			System.out.println("Enter the value you want to add on the left side of " + node.value);
			int val = sc.nextInt();
			node.left = new Node(val);
			System.out.println(val + " is added to the left of " + node.value);
			populateBinaryTree(node.left, sc);
		}
		System.out.println("Write true if you want to add node to the right side of " + node.value);
		boolean right = sc.nextBoolean();
		if (right) {
			System.out.println("Enter the value you want to add on the right side of " + node.value);
			int val = sc.nextInt();
			node.right = new Node(val);
			System.out.println(val + " is added to the right of " + node.value);
			populateBinaryTree(node.right, sc);
		}
	}

	public void display() {
		display(rootNode, "");
	}

	public void display(Node node, String separator) {
		if (node == null) {
			return;
		}
		System.out.println(separator + node.value);
		display(node.left, separator + "\t");
		display(node.right, separator + "\t");
	}

	public static void main(String args[]) {
		System.out.println("Inside main method...");
		BinaryTree binaryTree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		binaryTree.populateBinaryTree(sc);
		binaryTree.display();

	}
}
