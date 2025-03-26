package algorithms.linkedlist;

public class Leet82 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0, head);
		ListNode prev = dummy;
		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				while (curr != null && curr.next != null && curr.val == curr.next.val) {
					curr = curr.next;
				}
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}
		return dummy.next;
	}
}
