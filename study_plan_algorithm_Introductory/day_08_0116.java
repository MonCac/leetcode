package study_plan_algorithm_Introductory;

// 填充每个节点的下一个右侧节点指针

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

public class day_08_0116 {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        // 从根节点开始
        Node leftmost = root;

        while (leftmost.left != null) {

            // 遍历这一层节点组织成的链表，为下一层的节点更新 next 指针
            Node head = leftmost;

            while (head != null) {

                // CONNECTION 1
                head.left.next = head.right;

                // CONNECTION 2
                if (head.next != null) {
                    head.right.next = head.next.left;
                }

                // 指针向后移动
                head = head.next;
            }

            // 去下一层的最左的节点
            leftmost = leftmost.left;
        }

        return root;
    }

}
