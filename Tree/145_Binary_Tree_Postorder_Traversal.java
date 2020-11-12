import java.util.List;
import java.util.Stack;

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

//  Recursion
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}

// Stack Approach
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode prev = null;

        while (root != null || !stk.isEmpty()) {
            while(root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            if (root.right == null || root.right == prev){
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stk.push(root);
                root = root.right;
            }
        }
        return res;
    }
}