package algorithms.linkedlist;

public class Leet61 {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k <= 0) {
			return head;
		}
		ListNode temp = head;
		int size = 1;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}

		int index = size - (k % size);
		ListNode newLast = head;
		for (int i = 0; i < index - 1; i++) {
			newLast = newLast.next;
		}
		temp.next = head;
		head = newLast.next;
		newLast.next = null;

		return head;
	}
}
