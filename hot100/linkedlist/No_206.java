package hot100.linkedlist;

public class No_206 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        reverseList(node1);

    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode current = next.next;
        next.next = head;
        head.next = null;
        head = current;
        while (head != null){
            current = head.next;
            head.next = next;
            next = head;
            head = current;
        }
        return next;
    }

}
