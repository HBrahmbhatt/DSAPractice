package algorithms.linkedlist;

public class LengthOfLinkedListCycle {

	public static int lengthOfCycle(ListNode head) {
		if (head == null || head.next == null) {
			return 0; // can't create a cycle with 0 or 1 node
		}
		int size = 0;
		ListNode slow = head;
		ListNode fast = head;
		do {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				// stop moving fast pointer, keep moving slow pointer one by one
				slow = slow.next;
				size += 1;
				while (fast != slow) {
					slow = slow.next;
					size += 1;
				}
				return size;
			}
		} while (fast != null && fast.next != null);
		return 0;
	}

	public static void main(String args[]) {
		ListNode headNode = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5); // connecting node5 to node2
		headNode.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2;

		int size = lengthOfCycle(headNode);
		System.out.println("The size of cycle is -->" + size);

		// Passing a no cycle linked list
		ListNode head = new ListNode(0);
		ListNode nodeA = new ListNode(1);
		ListNode nodeB = new ListNode(2);
		head.next = nodeA;
		nodeA.next = nodeB;

		int size1 = lengthOfCycle(head);
		System.out.println("The size of cycle 1 is -->" + size1);
	}
}