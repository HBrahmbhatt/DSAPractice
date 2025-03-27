package algorithms.linkedlist;

public class Leet160 {
	// Check out this approach for finding the common node
	// https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode d1 = headA;
		ListNode d2 = headB;
		// This loop keeps going until d1 & d2 are same (either coz of intersection or
		// coz of reaching null)
		while (d1 != d2) {
			d1 = d1 == null ? headB : d1.next;
			d2 = d2 == null ? headA : d2.next;
		}
		return d1;
	}

	// This isnt an optimized approach
	public ListNode getIntersectionNodeUnoptimized(ListNode headA, ListNode headB) {
		while (headB != null) {
			ListNode temp = headA;
			while (temp != null) {
				if (temp == headB) {
					return headB;
				}
				temp = temp.next;
			}
			headB = headB.next;
		}
		return null;
	}
}
