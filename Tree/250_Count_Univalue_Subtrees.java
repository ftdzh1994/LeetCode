import java.util.HashSet;

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
    int count = 0;

    // public void dfs(TreenNode root) {
    //     if (root == null) return;
    //     uniVals.add(root);
    //     length += 1;
    //     dfs(root.left);
    //     dfs(root.right);
    // }

    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        isUnivalTree(root, root.val);
        return count;
    }

    public boolean isUnivalTree(TreeNode root, int value){
        if (root == null) return true;

        if (root.val != value) {
            isUnivalTree(root, root.value);
            return false;
        } else {                // root.val == value
            boolean isLeftUnival = isUnivalTree(root.right, value);
            boolean isRightUnival = isUnivalTree(root.left, value);
            if (isLeftUnival && isRightUnival) {
                count += 1;
            }
        }
    }
}