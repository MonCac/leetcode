package leetbooks.intermediate_algorithms;

// 反转链表

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class No_02_004 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {
       ListNode pre = null;
       ListNode next = head;
       while (next != null) {
           next = head.next;
           head.next = pre;
           pre = head;
           head = next;
       }
       return pre;
    }
}
