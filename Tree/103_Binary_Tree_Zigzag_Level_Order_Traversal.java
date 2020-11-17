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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean is_order_left = true;
        queue.offer(root);

        while(!queue.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<Integer>();
            int size = queue.size();

            while(size != 0) {
                TreeNode node = queue.poll();
                if (is_order_left) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size --;
            }
            is_order_left = !is_order_left;
            res.add(level);
        }
        return res;
    }
}

// LinkedList<> list = new LinkedList<>():   list.addLast()  list.addFirst()