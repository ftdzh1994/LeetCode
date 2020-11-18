import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

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
    public void getPath(TreeNode root, TreeNode end, Deque<TreeNode> path) {
        if (root == null) return;

        path.addLast(root);
        if (root == end){
            return;
        } else {
            getPath(root.left, end, path);
            getPath(root.right, end, path);
            path.removeLast();
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> path_to_p = new LinkedList<TreeNode>();
        getPath(root, p, path_to_p);
        Deque<TreeNode> path_to_q = new LinkedList<TreeNode>();
        getPath(root, q, path_to_q);

        TreeNode lca = root;
        while(path_to_p.peek() == path_to_q.peek()){
            lca = path_to_p.pollFirst();
            path_to_q.pollFirst();
        }
        return lca;
    }
}