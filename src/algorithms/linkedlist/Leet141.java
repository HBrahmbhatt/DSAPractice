package algorithms.linkedlist;

public class Leet141 {

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		// Fast and slow pointers method
		ListNode slow = head;
		ListNode fast = head;
		do {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		} while (fast != null && fast.next != null);
		return false;
	}
}