class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stk = new Stack<>();
        String [] strs = preorder.split(",");
        int num = 0;
        for (int i = 0; i < strs.length; i++) {
            String c = strs[i];
            while (c.equals("#") && !stk.isEmpty() && stk.peek().equals("#")) {
                stk.pop();
                if (!stk.isEmpty() && !stk.peek().equals("#")) {
                    stk.pop();
                } else {
                    return false;
                }
            }
            stk.push(c);
        }
        return stk.size() == 1 && stk.peek().equals("#");
    }
}