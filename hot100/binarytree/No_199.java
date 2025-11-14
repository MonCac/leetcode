package hot100.binarytree;

import java.util.ArrayList;
import java.util.List;

public class No_199 {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recordRightSideView(root, res, 1);
        return res;
    }
    public void recordRightSideView(TreeNode root, List<Integer> res, int depth) {
        if(root == null) return;
        if (res.size() < depth){
            res.add(root.val);
        }
        depth++;
        recordRightSideView(root.right, res, depth);
        recordRightSideView(root.left, res, depth);
    }
}
