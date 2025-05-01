package dataStructures;


public class CustomLinkedList {

	private Node head;
	private Node tail;
	private int size;

	private class Node {
		private int value;
		private Node next;

		// constructors for class Node
		public Node(int value) {
			this.value = value;
		}
	}

	// constructors for LinkedList
	public CustomLinkedList() {
		this.size = 0;
	}

	public void populate(int value) {
		if (this.head == null) {
			Node node = new Node(value);
			this.head = node;
			this.tail = node;
		} else {
			Node node = new Node(value);
			tail.next = node;
			tail = node;
		}
		size += 1;
	}

	public void display() {
		if (head == null && tail == null) {
			System.out.println("Linkedlist is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
	}

	// Displaying linkedList attributes
	public void displayLLAttributes() {
		System.out.println("Printing attributes................");
		if (head == null && tail == null) {
			System.out.println("Linkedlist is empty");
		} else {
			System.out.println("list size " + this.size);
			System.out.println("head " + this.head.value);
			System.out.println("tail " + this.tail.value);
		}
	}

	// Inserting at an index
	public void insertAtIndex(int value, int index) {
		// All index start at zero
		System.out.println("Linkedlist size is " + this.size);
		if (index > size) {
			System.out.println("Can't proceed as index > size of linked list..........");
		} else if (index == 0) {
			Node node = new Node(value);
			node.next = this.head;
			head = node;
			if (tail == null) {
				tail = head;
			}
			size += 1;
		} else if (index == size) {
			Node node = new Node(value);
			tail.next = node;
			tail = node;
			size += 1;
		} else {
			Node temp = head;
			int num = 1;
			while (num < index) {
				temp = temp.next;
				num += 1;
			}
			Node node = new Node(value);
			node.next = temp.next;
			temp.next = node;
			size += 1;
		}

	}

	public static void main(String args[]) {
		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.populate(5);
		linkedList.populate(4);
		linkedList.populate(3);
		linkedList.populate(2);
		linkedList.populate(1);

		linkedList.display();
		linkedList.displayLLAttributes();
		
		linkedList.insertAtIndex(0, 2);
		linkedList.display();
		linkedList.displayLLAttributes();
		
		linkedList.insertAtIndex(15, 0);
		linkedList.display();
		linkedList.displayLLAttributes();
		
		linkedList.insertAtIndex(30, linkedList.size);
		linkedList.display();
		linkedList.displayLLAttributes();
		System.out.println("\n..");

		CustomLinkedList linkedList2 = new CustomLinkedList();
		linkedList2.display();
		linkedList2.displayLLAttributes();

	}

}
