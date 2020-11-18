import java.util.HashMap;

import javax.swing.tree.TreeNode;

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
class Solution {
    HashMap<TreeNode, Integer> maxLeftSum = new HashMap<TreeNode, Integer>();
    HashMap<TreeNode, Integer> maxrightSum = new HashMap<TreeNode, Integer>();
    HashMap<TreeNode, Integer> maxrSum = new HashMap<TreeNode, Integer>();

    public int generateSinglePathSum(TreeNode root) {
        if (root.left == null) {
            maxLeftSum.put(root, 0);
        } else {
            if (max)
        }

        if (root.left == null) {
            maxLeftSum.put(root, 0);
        }
    }

    public int maxPathSum(TreeNode root) {
        generateSinglePathSum(root);
        return 0;
    }
}