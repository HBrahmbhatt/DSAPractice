package algorithms.linkedlist;

public class Leet237 {
	public void deleteNode(ListNode node) {
		if (node == null) {
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
