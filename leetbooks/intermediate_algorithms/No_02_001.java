package leetbooks.intermediate_algorithms;

// 两数相加

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

public class No_02_001 {
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ans = result;
        int sum = 0, count = 0;
        while (l1 != null || l2 != null || count != 0){
            sum = count;
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (sum >= 10){
                count = 1;
                sum -= 10;
            }else{
                count = 0;
            }
            result.next = new ListNode(sum);
            result = result.next;
        }
        return ans.next;
    }
}
