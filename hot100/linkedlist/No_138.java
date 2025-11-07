package hot100.linkedlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_138 {
    class Node{
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node ans = new Node(0);
        Node cur = ans;
        Node temp = head;
        Map<Node, Node> map = new HashMap<>();
        while (temp != null) {
            cur.next = new Node(temp.val);
            cur = cur.next;
            map.put(temp, cur);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
