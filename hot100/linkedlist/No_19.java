package hot100.linkedlist;

public class No_19 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
        ListNode(int x,ListNode next){
            val = x;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummp = new ListNode(0);
        dummp.next = head;
        int total = 0;
        while (head != null){
            total++;
            head = head.next;
        }
        total = total - n;
        head = dummp;
        while (total > 0){
            head = head.next;
            total--;
        }
        head.next = head.next.next;
        return dummp.next;
    }

}
