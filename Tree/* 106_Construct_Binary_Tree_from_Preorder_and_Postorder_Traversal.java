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
    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] postorder, int[] inorder, int postorder_left, int postorder_right, int inorder_left, int inorder_right) {
        if (postorder_left > postorder_right) {
            return null;
        }

        int postorder_root = postorder_right;
        int inorder_root = indexMap.get(postorder[postorder_root]);
        TreeNode root = new TreeNode(postorder[postorder_root]);
        int size_right_subtree = inorder_right - inorder_root;

        root.right = myBuildTree(postorder, inorder, postorder_root - size_right_subtree, postorder_root - 1, inorder_root + 1, inorder_right);

        root.left = myBuildTree(postorder, inorder, postorder_left, postorder_root - size_right_subtree - 1, inorder_left, inorder_root - 1);
        return root;
    }

    public TreeNode buildTree(int[] postorder, int[] inorder) {
        int n = inorder.length;
        indexMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }
        return myBuildTree(postorder, inorder, 0, n-1, 0, n-1);
    }
}