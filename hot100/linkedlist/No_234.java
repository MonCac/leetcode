package hot100.linkedlist;

import java.util.List;

public class No_234 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
        ListNode(int x,ListNode next){
            val = x;
            this.next = next;
        }
    }
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode go = head;
        while (go != null){
            len++;
            go = go.next;
        }
        int[] a = new int[len];
        for (int i = 0; i < len; i++){
            a[i] = head.val;
            head = head.next;
        }
        int start = 0, end = len - 1;
        while (start < end){
            if (a[start] != a[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
