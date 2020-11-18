import java.lang.reflect.Method;

class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int n = preorder.length;
        return helper(preorder, 0 , n-1);
    }

    public boolean helper(int[] preorder, int l, int r) {
        int pivot = l;
        for (int i = l; i < r; i++) {
            if (preorder[i] > preorder[l]) {
                break;
            }
            pivot = i;                // 最后一个小于root的数字，即左子树的结尾
        }
    }
}