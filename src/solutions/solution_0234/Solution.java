package solutions.solution_0234;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;

        ListNode middle = middleList(head);
        ListNode reverse = reverseList(middle);

        while(reverse != null) {
            if(reverse.val != head.val)
                return false;
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;

        while(current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }

    public static ListNode middleList(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
