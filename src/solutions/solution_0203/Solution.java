package solutions.solution_0203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        result.next = head;

        ListNode current = result;

        while (current.next != null) {
            if(current.next.val == val)
                current.next = current.next.next;
            else current = current.next;
        }

        return result.next;

    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
