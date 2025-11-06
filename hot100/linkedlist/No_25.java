package hot100.linkedlist;

public class No_25 {
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);
        reverseKGroup(e,3);
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x) {
            val = x;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode calsum = dummy;
        while (calsum.next != null) {
            calsum = calsum.next;
            len++;
        }
        int sum = len / k;
        ListNode temp = dummy;
        for (int i = 0; i < sum; i++){
            temp = reverseNode(temp, k);
        }
        return dummy.next;

    }

    // 翻转链表的前 K 个节点，输入该链表的前一个节点，返回链表最后一个节点
    public static ListNode reverseNode(ListNode head, int k){
        int len = 0;
        ListNode pre = head;
        ListNode cur = head.next;
        while (len + 1 < k){
            ListNode temp = pre.next;
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = temp;
            len++;
        }
        return cur;
    }

}
