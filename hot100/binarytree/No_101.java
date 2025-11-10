package hot100.binarytree;

import java.util.ArrayList;
import java.util.List;

public class No_101 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
        TreeNode(int x, TreeNode left, TreeNode right){
            val = x;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args){
        TreeNode n15 = new TreeNode(2);
        TreeNode n13 = new TreeNode(2);
        TreeNode n9  = new TreeNode(4, n15, null);
        TreeNode n7  = new TreeNode(1, n13,null);
        TreeNode n6  = new TreeNode(1, null, n9);
        TreeNode n4  = new TreeNode(4, null, n7);
        TreeNode n3  = new TreeNode(2, null, n6);
        TreeNode n2  = new TreeNode(2, n4, null);
        TreeNode n1  = new TreeNode(5, n2, n3);
        boolean h = isSymmetric(n1);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        return left.val == right.val && check(left.right, right.left) && check(left.left, right.right);
    }





//    public static boolean isSymmetric(TreeNode root) {
//        if (root == null){
//            return true;
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        inorderTraversal(root, ans);
//        int[] a = ans.stream().mapToInt(x -> x).toArray();
//        int left = 0, right = a.length - 1;
//        while (left < right){
//            if (a[left] != a[right]){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

//    public static void inorderTraversal(TreeNode root, List<Integer> ans){
//        if (root == null){
//            ans.add(-1);
//            return;
//        }
//        if (root.left == null && root.right == null){
//            ans.add(root.val);
//            return;
//        }
//        inorderTraversal(root.left, ans);
//        ans.add(root.val);
//        inorderTraversal(root.right, ans);
//    }
}
