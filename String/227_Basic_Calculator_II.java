class Solution {
    public int calculate(String s) {
        int n = s.length();
        int num = 0;
        char sign = '+';
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                int pre;
                switch (sign) {         // 比较 sign 而不是 c
                    case '+':
                        stk.push(num);
                        break;
                
                    case '-':
                        stk.push(-num);
                        break;
                    case '*':
                        pre = stk.pop();
                        stk.push(pre * num);
                        break;

                    case '/':
                        pre = stk.pop();
                        System.out.println(pre/num);
                        stk.push(pre / num);
                        break;
                }
                sign = c;
                num = 0;
            }
        }

        int res = 0;
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        
        return res;
    }
}