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

 // Recuresion
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<Integer>();
//         preorder(root, res);
//         return res;
//     }

//     public void preorder(TreeNode root, List<Integer> res) {
//         if (root == null) return;
//         res.add(root.val);
//         preorder(root.left, res);
//         preorder(root.right, res);
//     }
// }

// Stack Implement 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();

        while (root != null || !stk.isEmpty()) {
            while(root != null) {
                res.add(root.val);
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            root = root.right;
        }
        return res;
    }
}
