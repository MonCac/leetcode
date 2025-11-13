package hot100.binarytree;

public class No_108 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int sum = nums.length;
        if (sum == 0){
            return null;
        }
        return BSTTreeNode(nums, 0, sum - 1);
    }
    public TreeNode BSTTreeNode(int[] nums, int start, int end){
        if (start > end){
             return null;
        }
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BSTTreeNode(nums, start, mid - 1);
        root.right = BSTTreeNode(nums, mid + 1, end);
        return root;
    }
}
