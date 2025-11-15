package hot100.binarytree;

import java.util.Stack;

public class No_114 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);
        flatten2(root);
    }
    public static void flatten1(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (pre != null){
                pre.left = null;
                pre.right = node;
            }
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
            pre = node;
        }
    }

    public static void flatten2(TreeNode root) {
        TreeNode cur = root;
        while (cur != null){
            if (cur.left == null){
                cur = cur.right;
                continue;
            }
            TreeNode next = cur.left;
            TreeNode right = next;
            while (right.right != null){
                right = right.right;
            }
            right.right = cur.right;
            cur.left = null;
            cur.right = next;
            cur = cur.right;
        }
    }
}
