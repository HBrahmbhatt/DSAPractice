package algorithms.linkedlist;

public class Leet143 {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}
		ListNode mid = midNode(head);
		ListNode secondHalf = reverseLinkedList(mid);
		ListNode firstHalf = head;

		while (firstHalf != null && secondHalf != null) {
			ListNode temp = firstHalf.next;
			firstHalf.next = secondHalf;
			firstHalf = temp;

			temp = secondHalf.next;
			secondHalf.next = firstHalf;
			secondHalf = temp;
		}
		if (firstHalf != null) {
			firstHalf.next = null;
		}
	}

	public ListNode midNode(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public ListNode reverseLinkedList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = curr.next;
		while (curr != null) {
			curr.next = prev;
			prev = prev == null ? head : curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
		}
		return prev;
	}
}
