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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

	private TreeNode helper(int[] nums, int l, int h) {
        int mid = (l + h) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left  = helper(nums, l, mid - 1);
        root.right = helper(nums, mid + 1, h);
        return root;
	}
}

// BSF root position