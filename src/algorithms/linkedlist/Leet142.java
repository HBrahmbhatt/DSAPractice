package algorithms.linkedlist;

public class Leet142 {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		// Fast and slow pointers method
		ListNode slow = head;
		ListNode fast = head;
		do {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				ListNode dummy = head;
				while (slow != dummy) {
					slow = slow.next;
					dummy = dummy.next;
				}
				return slow;
			}
		} while (fast != null && fast.next != null);
		return null;
	}
}
