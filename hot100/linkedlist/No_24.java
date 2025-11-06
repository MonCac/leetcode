package hot100.linkedlist;

public class No_24 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
        ListNode(int x, ListNode next){
            val = x;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3,a);
        ListNode c = new ListNode(2,b);
        ListNode d = new ListNode(1,c);
        swapPairs(d);

    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int total = 0;
        while(head != null){
            total++;
            head = head.next;
        }
        if (total < 2){
            return dummy.next;
        }
        ListNode a = dummy;
        while (a.next != null && a.next.next != null){
            ListNode b = a.next;
            ListNode c = b.next;
            ListNode d = c.next;
            a.next = c;
            b.next = d;
            c.next = b;
            a = b;
        }
        return dummy.next;
    }

}
