package hot100.binarytree;

public class No_543 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return messageOfBinaryTree(root)[1];
    }

    public int[] messageOfBinaryTree(TreeNode root) {
        if (root == null) {
            return new int[]{-1, -1};
        }
        int[] result = new int[2]; // 存放两个值，该节点的最长边和最大值
        int[] ans1 = messageOfBinaryTree(root.left);
        int[] ans2 = messageOfBinaryTree(root.right);
        result[0] = Math.max(ans1[0], ans2[0]) + 1;
        result[1] = Math.max(Math.max(ans1[1], ans2[1]), ans1[0] + ans2[0] + 2);
        return result;
    }
}
