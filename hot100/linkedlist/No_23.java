package hot100.linkedlist;

import java.util.List;

public class No_23 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val = x;
        }
        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
       ListNode dummy = new ListNode(0);
       ListNode cur = dummy;
       int sum = 0;
       int k = lists.length;
       for (ListNode list : lists) {
           ListNode head = list;
           while (head != null) {
               sum++;
               head = head.next;
           }
       }
       while (sum > 0){
           int min = Integer.MAX_VALUE;
           int index = -1;
           for (int i = 0; i < k; i++) {
               if (lists[i] == null){
                   continue;
               }
               ListNode head = lists[i];
               if (head.val < min){
                   min = head.val;
                   index = i;
               }
           }
           cur.next = lists[index];
           cur = cur.next;
           lists[index] = lists[index].next;
           sum--;
       }
       return dummy.next;
    }
}
