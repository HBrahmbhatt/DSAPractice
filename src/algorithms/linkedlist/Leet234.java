package algorithms.linkedlist;

public class Leet234 {
	// This is the main solution code using LinkedList but the dumb and easy way
	// would be to convert this to array and then check for palindrome
	// that is similar to Leet9 in numbers
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode temp = head;
		ListNode mid = middleNode(head);
		ListNode secondList = mid.next;
		mid.next = null;
		secondList = reverseList(secondList);

		while (temp != null && secondList != null) {
			if (temp.val != secondList.val) {
				return false;
			}
			temp = temp.next;
			secondList = secondList.next;
		}
		return true;
	}

	public ListNode middleNode(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = null;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow == null ? head : slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;
		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
		}

		return prev;
	}
}
