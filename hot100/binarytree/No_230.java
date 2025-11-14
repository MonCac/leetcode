package hot100.binarytree;

import java.util.ArrayList;
import java.util.List;

public class No_230 {
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        getNum(root, k, list);
        return list.get(k);
    }

    public void getNum(TreeNode root, int k, List<Integer> list) {
        if (root == null) return;
        if (list.size() == k){
            return;
        }
        getNum(root.left, k, list);
        list.add(root.val);
        getNum(root.right, k, list);
    }
}
