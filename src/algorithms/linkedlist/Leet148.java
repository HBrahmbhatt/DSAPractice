package algorithms.linkedlist;

public class Leet148 {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode mid = middleNode(head);
		ListNode list1 = sortList(head);
		ListNode list2 = sortList(mid);
		return mergeTwoLists(list1, list2);
	}

	public ListNode middleNode(ListNode head) {
		ListNode slow = null;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			if (slow == null) {
				slow = head;
			} else {
				slow = slow.next;
			}
			fast = fast.next.next;
		}
		ListNode mid = slow.next;
		slow.next = null;
		return mid;
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(10);
		ListNode head = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				head.next = list1;
				list1 = list1.next;
			} else {
				head.next = list2;
				list2 = list2.next;
			}
			head = head.next;
		}
		while (list1 != null) {
			head.next = list1;
			list1 = list1.next;
			head = head.next;
		}
		while (list2 != null) {
			head.next = list2;
			list2 = list2.next;
			head = head.next;
		}
		return dummy.next;
	}
}
