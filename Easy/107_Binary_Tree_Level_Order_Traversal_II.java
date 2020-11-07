import java.util.LinkedList;
import java.util.Queue;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            // Add a sub List<Integer>  to get the element of this level
            // count current size of this level

            List<Integer> level = new LinkedList<Integer>();
            int size = queue.size();

            // poll all the element of this level based on size, and add
            // all the element of next level into queue
            while (size > 0) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null){
                    queue.offer(left);
                }
                if (right != null){
                    queue.offer(right);
                }
                size--;
            }
            // Add this List<Integer> of this level to the leftest postion of leverOder List
            levelOrder.add(0, level);
        }
        return levelOrder;
    }
}

// BFS variety using interation approach

// New List 
// List.add(Object)
// List.add(index, Object)