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
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode start = root;
        TreeNode nextStart = null;
        TreeNode newLeft = null;
        TreeNode newRight = null;
        TreeNode newRoot;
        while (start != null) {
            nextStart = start.left;
            newRoot = start;
            
            start.left = newLeft; 
            newLeft = start.right;

            start.right = newRight;
            newRight = start;

            start = nextStart;
        }

        return newRoot;
    }
}