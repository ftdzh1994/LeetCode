import java.util.HashMap;

import javax.swing.tree.TreeNode;

// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// import javax.swing.text.AsyncBoxView.ChildLocator;
// import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Level Order Traversal + DP + rolling numbers
class Solution {
    HashMap<TreeNode, Integer> maxSum = new HashMap<>();
    HashMap<TreeNode, Integer> childMaxSum = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return maxSum.get(root);
    }

    public void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        dfs(root.right);

        int leftSum = maxSum.getOrDefault(root.left, 0);
        int leftChildSum = childMaxSum.getOrDefault(root.left, 0);
        int rightSum = maxSum.getOrDefault(root.right, 0);
        int rightChildSum = childMaxSum.getOrDefault(root.right, 0);
        
        childMaxSum.put(root, rightSum + leftSum);
        int maxValue = Math.max(rightSum + leftSum, rightChildSum + leftChildSum + root.val);
        maxSum.put(root, maxValue);
    }
}

// HashMap get or default