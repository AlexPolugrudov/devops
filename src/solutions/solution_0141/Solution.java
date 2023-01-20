package solutions.solution_0141;

public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }

        return false;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
