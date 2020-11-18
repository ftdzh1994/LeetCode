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
    public int closestValue(TreeNode root, double target) {
        double diff = Double.MAX_VALUE;
        int closest = root.val;
        while(root != null) {
            if (Math.abs(root.val - target) < diff) {
                closest = root.val;
                diff = Math.abs(root.val - target);
            } 
            if (target > root.val) {
                root = root.right;
            } else if (target < root.val) {
                root = root.left;
            }
        }
        return closest;
    }
}