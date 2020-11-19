import java.util.ArrayList;
import java.util.List;

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
class Solution {
    List<Integer> currLeaf;

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        while(root != null) {
            currLeaf = new ArrayList<Integer>();
            root = dfs(root);
            res.add(currLeaf);
        }
        return res;
    }

    public TreeNode dfs(TreeNode root) {
        if (root == null) return null ;
        if (root.left  == null && root.right == null) {
            currLeaf.add(root.val);
            return null ;
        }
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        return root;
    }
}

// 函数无法直接改变root的值