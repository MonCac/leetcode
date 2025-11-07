package hot100.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class No_146 {
    class LRUCache {
        class DLinkedNode {
            int key;
            int value;
            DLinkedNode next;
            DLinkedNode prev;

            public DLinkedNode() {}
            public DLinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Map<Integer, DLinkedNode> map = new HashMap<>();
        private int size;
        private int capacity;
        private DLinkedNode head, tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkedNode node = map.get(key);
            if (node == null) {
                return -1;
            }
            // 如果 key 存在，先通过哈希表定位，再移到头部
            movetoHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = map.get(key);
            if (node == null) {
                DLinkedNode newNode = new DLinkedNode(key, value);
                map.put(key, newNode);
                addToHead(newNode);
                size++;
                if (size > capacity){
                    DLinkedNode tail = removeTail();
                    map.remove(tail.key);
                    size--;
                }
            }else{
                node.value = value;
                movetoHead(node);
            }
        }

        private void addToHead(DLinkedNode node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(DLinkedNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void movetoHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        private DLinkedNode removeTail() {
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;
        }
    }
}
