package algorithms.linkedlist;

public class Leet25 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (k <= 1 || head == null || head.next == null) {
			return head;
		}
		ListNode temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++; // there is another way to not count separately and using size attribute in the same below loop.
		}
		int counter = size / k;
		// reach till the node from where the reversing should happen
		ListNode curr = head;
		ListNode prev = null;
		while (counter > 0 && curr != null) {
			ListNode last = prev;
			ListNode newEnd = curr;
			ListNode next = curr.next;
			for (int i = 0; curr != null && i < k; i++) {
				curr.next = prev;
				prev = curr;
				curr = next;
				if (next != null) {
					next = next.next;
				}
			}
			if (last != null) {
				last.next = prev;
			} else {
				head = prev;
			}
			newEnd.next = curr;
			if (curr == null) {
				break;
			}
			prev = newEnd;
			counter--;
		}
		return head;

	}
}
