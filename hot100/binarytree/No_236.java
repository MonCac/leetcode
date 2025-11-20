package hot100.binarytree;

public class No_236 {
    static class TreeNode{
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
    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(5);
        a.left.left = new TreeNode(6);
        a.left.right = new TreeNode(2);
        a.left.right.left = new TreeNode(7);
        a.left.right.right = new TreeNode(4);
        a.right = new TreeNode(1);
        a.right.left = new TreeNode(0);
        a.right.right = new TreeNode(8);
        lowestCommonAncestor(a, a.left, a.right);

    }
    static TreeNode ans = null;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        seePQ(root, p, q);
        return ans;
    }

    public static boolean[] seePQ(TreeNode root, TreeNode p, TreeNode q){
        boolean[] see = new boolean[2];
        if (root == null){
            return new boolean[]{false, false};
        }
        boolean[] see1 = seePQ(root.left, p, q);
        boolean[] see2 = seePQ(root.right, p, q);
        see[0] = see1[0] || see2[0];
        see[1] = see1[1] || see2[1];
        if (root == p){
            see[0] = true;
        }
        if (root == q){
            see[1] = true;
        }
        if (see[0] && see[1] && ans == null){
            ans = root;
        }
        return see;
    }
}
