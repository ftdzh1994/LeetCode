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
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public void dsf(TreeNode root, int sum) { 
        if(root == null) return;
        path.offerLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            res.add(list);
        } 
        dsf(root.left, sum);
        dsf(root.right, sum);
        path.pollLast()
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) { 
        dsf(root, sum);
        return res;
    }
}

// Recursion DFS