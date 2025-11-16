package hot100.binarytree;

import java.util.HashMap;
import java.util.Map;

public class No_105 {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLength = preorder.length;
        int inLength = inorder.length;
        if (preLength != inLength) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inLength; i++) {
            map.put(inorder[i], i);
        }
        return buildTree2(preorder, 0, preLength - 1, map, 0, inLength - 1);

    }
    public TreeNode buildTree2(int[] preorder, int preStart, int preEnd, Map<Integer, Integer> map, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = map.get(preorder[preStart]);
        root.left = buildTree2(preorder, preStart + 1, preStart + index - inStart, map, inStart, index - 1);
        root.right = buildTree2(preorder, preStart + index - inStart + 1, preEnd, map, index + 1, inEnd);
        return root;
    }
}
