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
    int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        int digit = 0;
        if (root == null) return 0;
        dfs(root, digit);
        return sum;
    }

    public void dfs(TreeNode root, int digit) {
        digit = digit * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += digit;
        }
        if (root.left != null) dfs(root.left, digit);
        if (root.right != null) dfs(root.right, digit);
        digit = (digit - root.val) / 10;
    }
}