package hot100.linkedlist;

import java.util.List;

public class No_148 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val = x;
        }
        ListNode(int x,ListNode next){
            val = x;
            this.next = next;
        }
    }
    public ListNode sortList(ListNode head) {
        return head;
    }
}
