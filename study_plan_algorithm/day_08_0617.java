package study_plan_algorithm;

// 合并二叉树

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class day_08_0617 {

    //Definition for a binary tree node.

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 != null){
            if (root2 != null){
                root1.val += root2.val;
            }
            else{
                return root1;
            }
        }else{
            return root2;
        }
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.add(new TreeNode[]{root1,root2});
        while (!queue.isEmpty()){
            TreeNode[] treeNodes = queue.poll();
            TreeNode treeNode1 = treeNodes[0];
            TreeNode treeNode2 = treeNodes[1];
            if (treeNode1.left != null || treeNode2.left != null){
                if (treeNode1.left != null){
                    if (treeNode2.left != null){
                        treeNode1.left.val += treeNode2.left.val;
                        queue.add(new TreeNode[]{treeNode1.left,treeNode2.left});
                    }else{
                    }
                }else{
                    treeNode1.left = treeNode2.left;
                }

            }
            if (treeNode1.right != null || treeNode2.right != null){
                if (treeNode1.right != null){
                    if (treeNode2.right != null){
                        treeNode1.right.val += treeNode2.right.val;
                        queue.add(new TreeNode[]{treeNode1.right,treeNode2.right});
                    }else{
                    }
                }else{
                    treeNode1.right = treeNode2.right;
                }
            }
        }
        return root1;
    }

}
