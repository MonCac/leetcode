package hot100.linkedlist;

import java.util.List;

public class No_148 {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        sortList(head);
    }
    static class ListNode{
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
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        for (int subLength = 1; subLength < len; subLength *= 2) {
            ListNode pre = dummy, cur = dummy.next;
            while (cur != null){
                ListNode head1 = cur;
                for (int i = 1; i < subLength && cur.next != null; i++) {
                    cur = cur.next;
                }
                ListNode head2 = cur.next;
                cur.next = null;
                cur = head2;
                for (int i = 1; i < subLength && cur != null && cur.next != null; i++) {
                    cur = cur.next;
                }
                ListNode next = null;
                if (cur != null){
                    next = cur.next;
                    cur.next = null;
                }
                cur = next;
                ListNode merged = merge(head1, head2);
                pre.next = merged;
                while (pre.next != null){
                    pre = pre.next;
                }
            }
        }
        head = dummy.next;
        return head;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        } else if (l2 != null) {
            cur.next = l2;
        }
        return dummy.next;
    }
}
