import java.util.List;

class Solution {
    List<Integer> inorder = new ArrayList<Integer>();

    public void inorderTaversal(TreeNode root){
        if (root == null) return;
        inorderTaversal(root.left);
        inorder.add(root.val);
        inorderTaversal(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorderTaversal(root);
        return inorder.get(k);
    }
}

// Stack or Interation DFS