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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pStr = treeTraversal(p);
        String qStr = treeTraversal(q);
        return pStr.equals(qStr);
    }

    public String treeTraversal(TreeNode root){
        if (root == null) {
            return "#";
        }
        String left = treeTraversal(root.left);
        String right = treeTraversal(root.right);

        String subTree = root.val + "," + left + "," + right;
        // System.out.println(subTree);

        return subTree;
    }
}

// 没有必要全部遍历才得到结果

// Recuresion approach and *Iteration* approach

// 理解 equals() 方法和==运算符执行的是两个不同的操作是重要的。如同刚才解释的那样，equals() 方法比较字符串对象中的字符。而==运算符比较两个对象引用看它们是否引用相同的实例。

// 比大小 compareTo()