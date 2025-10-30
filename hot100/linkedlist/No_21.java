package hot100.linkedlist;

public class No_21 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
        ListNode(int x,ListNode next){
            this.val = x;
            this.next = next;
        }

        public ListNode() {

        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ans = new ListNode();
        if (list1.val < list2.val) {
            ans.val = list1.val;
            list1 = list1.next;
        }else{
            ans.val = list2.val;
            list2 = list2.next;
        }
        ListNode head = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
            }else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        if (list1 == null) {
            ans.next = list2;
        }else{
            ans.next = list1;
        }
        return head;
    }
}
