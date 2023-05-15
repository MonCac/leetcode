package leetbooks.intermediate_algorithms;

// 奇偶链表

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

public class No_02_002{
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode oddEvenList(ListNode head) {
         if (head == null){
             return null;
         }
         if (head.next == null || head.next.next == null){
             return head;
         }
         ListNode one = head;
         ListNode two = head.next;
         ListNode dummp = new ListNode(0);
         ListNode ans = dummp;
         while (one != null){
             dummp.next = new ListNode(one.val);
             dummp = dummp.next;
             if (one.next == null || one.next.next == null){
                 break;
             }
             one = one.next.next;
         }
        while (two != null){
            dummp.next = new ListNode(two.val);
            dummp = dummp.next;
            if (two.next == null || two.next.next == null){
                break;
            }
            two = two.next.next;
        }
         return ans.next;
    }
}
