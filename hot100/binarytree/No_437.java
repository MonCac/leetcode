package hot100.binarytree;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_437 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(5);
        a.right.left = new TreeNode(6);
        a.right.right = new TreeNode(7);
        pathSum(a, 2);
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
    static int ans = 0;
    public static int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.merge(0L, 1, Integer::sum);
        getListSum(root, 0, map, targetSum);
        return ans;
    }
    public static void getListSum(TreeNode root, long s, Map<Long, Integer> map, int targetSum) {
        if (root == null){
            return;
        }
        s += root.val;
        ans += map.getOrDefault(s - targetSum, 0);
        map.merge(s, 1, Integer::sum);
        getListSum(root.left, s, map, targetSum);
        getListSum(root.right, s, map, targetSum);
        map.merge(s, -1, Integer::sum);
    }
}
