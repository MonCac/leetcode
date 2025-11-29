package hot100.heap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No_215 {
    public static void main(String[] arg){
        findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4);
    }
    static class TreeNode{
        int val;
        int sum;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, int sum){
            this.val = val;
            this.sum = sum;
        }
    }
    private static TreeNode root = new TreeNode(0, 1);
    private static int total = 0;
    private static int ans = Integer.MAX_VALUE;
    public static int findKthLargest(int[] nums, int k) {
        root.val = nums[0];
        for (int i = 1; i < nums.length; i++){
            setTree(root, nums[i]);
        }
        getKth(root, k);
        System.out.println(ans);
        return ans;
    }
    private static void setTree(TreeNode root, int num){
        if (root.val > num){
            if (root.right == null){
                root.right = new TreeNode(num, 1);
            }else{
                setTree(root.right, num);
            }
        }else if((root.val < num)){
            if (root.left == null){
                root.left = new TreeNode(num, 1);
            }else{
                setTree(root.left, num);
            }
        }else{
            root.sum += 1;
        }
    }
    private static void getKth(TreeNode root, int k){
        if (root == null){
            return;
        }
        if (total >= k){
            return;
        }
        getKth(root.left, k);
        total += root.sum;
        if (total >= k && ans == Integer.MAX_VALUE){
            ans = root.val;
            return;
        }
        getKth(root.right, k);
    }
}
