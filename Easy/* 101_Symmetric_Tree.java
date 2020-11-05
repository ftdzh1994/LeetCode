/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Recursion
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode u, TreeNode v) {
        if (u == null && v == null){
            return true;
        }
        if (u == null && v == null && u.val != v.val){
            return false;
        }
        return check(u.left, u.right) && check(u.right, v.left);
    }
}


// Consider to build auxiliary function