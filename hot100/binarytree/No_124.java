package hot100.binarytree;

public class No_124 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        maxPathSum(root);

    }
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
    public static int maxPathSum(TreeNode root) {
        return getMaxAndPath(root)[0];
    }
    // 返回值 int[] 长度为 2 ，第一个存储当前二叉树的最大子路径和，第二个存储当前节点所连接的最长路径
    public static int[] getMaxAndPath(TreeNode root){
        if (root == null){
            return new int[]{-1001, 0};
        }
        int[] maxLeft = getMaxAndPath(root.left);
        int[] maxRight = getMaxAndPath(root.right);
        int ans2 = getMaxSubLen(root.val, maxLeft[1], maxRight[1]);
        int maxLenRoot = Math.max(ans2, root.val + maxLeft[1] + maxRight[1]);
        int ans1 = Math.max(maxLenRoot, Math.max(maxLeft[0], maxRight[0]));
        return new int[]{ans1, ans2};
    }
    public static int getMaxSubLen(int val, int left, int right){
        if (left < 0) {
            if (right < 0){
                return val;
            }else{
                return val + right;
            }
        }else{
            if (right < 0){
                return val + left;
            }else{
                return val + Math.max(left, right);
            }
        }
    }
}
