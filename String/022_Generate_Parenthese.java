class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrace(0, 0, n,new StringBuilder(), ans);
        return ans;
    }

    public void backtrace(int open, int close, int max, StringBuilder cur, List<String> ans) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append('(');
            backtrace(open + 1, close, max, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (close < open) {
            cur.append(')');
            backtrace(open, close + 1, max, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}