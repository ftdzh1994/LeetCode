import java.util.HashMap;

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
    HashMap<TreeNode,TreeNode> map = new HashMap<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root);
        TreeNode rightNode = p.right;
        TreeNode parentNode = map.containsKey(p)? map.get(p) : null;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        if(root.left != null){
            map.put(root.left, root);
            dfs(root.left);
        }
        if(root.right != null){
            if(!map.containsKey(root)){
                map.put(root, root.right);
            } else {
                TreeNode p = map.get(root);
                p = root.right.val < p.val? root.right : p;
                map.put(root, p);
            }
            dfs(root.right);        
        }
    }

}