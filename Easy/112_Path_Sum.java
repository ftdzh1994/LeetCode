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
    public boolean hasPathSum(TreeNode root, int sum) {
        // are all the vals are positive?
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return root.val == sum;
        }
        int remainder = sum - root.val; 
        return hasPathSum(root.left, remainder) || hasPathSum(root.right, remainder);  
    }
}

// Recursion

// DFS