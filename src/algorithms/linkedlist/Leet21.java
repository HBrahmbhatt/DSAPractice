package algorithms.linkedlist;

public class Leet21 {

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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return list1;
		}
		ListNode dummy = new ListNode(100000);
		ListNode head = dummy;
		ListNode temp1 = list1;
		ListNode temp2 = list2;

		while (temp1 != null && temp2 != null) {
			if (temp1.val <= temp2.val) {
				head.next = temp1;
				temp1 = temp1.next;
			} else {
				head.next = temp2;
				temp2 = temp2.next;
			}
			head = head.next;
		}
		while (temp1 != null) {
			head.next = temp1;
			temp1 = temp1.next;
			head = head.next;
		}
		while (temp2 != null) {
			head.next = temp2;
			temp2 = temp2.next;
			head = head.next;
		}
		return dummy.next;
	}
}
