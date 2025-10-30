package hot100.linkedlist;

import java.util.List;

public class No_2 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            this.val = x;
        }
        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }
    }
    public static void main(String[] args){
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(9);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        b.next.next.next = new ListNode(9);
        addTwoNumbers(a,b);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int index = 0;
        ListNode head = l1;
        while (l1 != null && l2 != null) {
            int now = l1.val + l2.val + index;
            l1.val = now % 10;
            index = now / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null){
            l1 = head;
            while (l1 != null){
                if (l1.next == null){
                    l1.next = l2;
                    break;
                }
                l1 = l1.next;
            }
        }
        l1 = l1.next;
        while (l1 != null) {
            int now = l1.val + index;
            l1.val = now % 10;
            index = now / 10;
            l1 = l1.next;
        }

        if (index != 0){
            l2 = head;
            while (l2 != null){
                if (l2.next == null){
                    l2.next = new ListNode(index);
                    break;
                }
                l2 = l2.next;
            }
        }
        return head;
    }
}
