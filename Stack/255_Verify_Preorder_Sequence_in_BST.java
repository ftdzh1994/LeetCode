import java.util.Stack;

class Solution {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> stk = new Stack<>();
        int min = Integer.MIN_VALUE;
        for (int val : preorder) {
            if (val < min) {
                return false;
            }
            while (! stk.isEmpty() && val > stk.peek()) {
                min = stk.pop();
            }
            stk.push(val);
        }
        return true;
    }
}

// Implement Stack using input array
class Solution {
    public boolean verifyPreorder(int[] preorder) {
        int min = Integer.MIN_VALUE;
        int k = -1;
        for(int val : preorder) {
            if (val < min) {
                return false;
            }
            while ( k >= 0 && val > preorder[k]) {
                min = preorder[k--];
            }
            preorder[++k] = val;
        }
        return true;
    }
}