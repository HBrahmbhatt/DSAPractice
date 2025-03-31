package algorithms.linkedlist;

public class Leet2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode head = new ListNode(-10);
		ListNode temp = head;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			ListNode curr = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = curr;
			temp = temp.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int sum = l1.val + carry;
			ListNode curr = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = curr;
			temp = temp.next;
			l1 = l1.next;

		}
		while (l2 != null) {
			int sum = l2.val + carry;
			ListNode curr = new ListNode(sum % 10);
			carry = sum / 10;
			temp.next = curr;
			temp = temp.next;
			l2 = l2.next;
		}
		if (carry > 0) {
			ListNode curr = new ListNode(carry);
			temp.next = curr;
		}
		return head.next;
	}
}
