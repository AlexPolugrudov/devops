package solutions.solution_0206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;

        while(current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }

        return prev;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
