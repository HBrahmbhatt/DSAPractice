package algorithms.linkedlist;

public class Leet2095 {
	// delete middle of linkedList
	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode slow = null;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow == null ? head : slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
