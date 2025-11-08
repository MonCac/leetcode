package hot100.binarytree;

public class No_104 {
    class TreeNode{
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
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }

    public int getMaxDepth(TreeNode root) {
        int ans;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int leftDepth = getMaxDepth(root.left);
        int rightDepth = getMaxDepth(root.right);
        ans = Math.max(leftDepth, rightDepth) + 1;
        return ans;
    }
}
