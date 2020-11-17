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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, Long minValue, Long maxValue) {
        if (root == null) return true;
        if (root.val <= minValue || root.val >= maxValue ) {
            return false;
        }
        boolean isLeftValid = isValid(root.left, minValue, (long)root.val);
        boolean isRightValid = isValid(root.right, (long)root.val, maxValue);
        return isLeftValid && isRightValid;
    }
}




//二叉搜索树的中序遍历是一个升序数列

