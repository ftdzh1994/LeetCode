/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        
    }
}