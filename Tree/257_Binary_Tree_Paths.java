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
    List<String> res = new LinkedList<String>();
    StringBuilder path  = new StringBuilder();
    // int index = 0;

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root) {
        // path.append("->");
        path.append( Integer.toString(root.val) );
        if (root.left == null && root.right == null) {
            res.add(path.toString());
        }
        if(root.left != null) {
            dfs(root.left);
        }
        if(root.right != null) {
            dfs(root.right);
        }
        path.deleteCharAt(path.length() - 1);
    }
}