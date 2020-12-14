class Solution {
    int curr;
    
    public int calculate(String s) {
        curr = 0;
        return helper(s);
    }

    public int helper(String s) {
        Stack<Integer> stk = new Stack<>();
        char sign = '+';
        int num = 0;

        while(curr < s.length()) {
            char c = s.charAt(curr);
            curr++;

            if (Character.isDigit(c)) {
                num = num * 10 + (c -'0');
            }

            if (c == '(') {
                num = helper(s);
            }

            if ((!Character.isDigit(c) && c != ' ') || curr == s.length()) {
                if (sign == '+') {
                    stk.push(num);
                }
                if (sign == '-') {
                    stk.push(-num);
                }
                num = 0;
                sign = c;
            }

            if (c == ')') {
                break;
            }
        }
        int res = 0;
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        return res;
    }
}