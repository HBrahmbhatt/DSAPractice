package algorithms.linkedlist;

public class Leet92 {
	public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        if(left == right){
            return head;
        }
        // reach till the node from where the reversing should happen
        ListNode curr = head;
        ListNode prev = null;
        // Need to check if curr!=null or else null pointer occurs
        for(int i = 0; curr!=null && i < left-1; i++){
            prev = prev == null ? head : prev.next;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newEnd = curr;
        ListNode next = curr.next;
        for(int i=left; curr !=null && i<=right; i++ ){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
            left += 1;
        }
        
        // This is an important condition to check if last is null or not
        if(last!=null){
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = curr;

        return head;
    }
}
