package hot100.linkedlist;

import java.util.List;

public class No_141 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
