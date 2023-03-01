package algorithm;

// 剑指Offer 06. 从尾到头打印链表

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */




public class No_01_002 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode now = head;
        while (now != null){
            len++;
            now = now.next;
        }
        int[] a = new int[len];
        while (head != null){
            a[len - 1] = head.val;
            len--;
            head = head.next;
        }
        return a;
    }

}
