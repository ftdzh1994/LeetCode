import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int first, second;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    second = stk.pop();
                    first = stk.pop();
                    stk.push(first + second);
                    break;

                case "-":
                    second = stk.pop();
                    first = stk.pop();
                    stk.push(first - second);
                    break;
                
                case "*":
                    second = stk.pop();
                    first = stk.pop();
                    stk.push(first * second);
                    break;

                case "/":
                    second = stk.pop();
                    first = stk.pop();
                    stk.push(first / second);
                    break;

                default:
                    int num = Integer.valueOf(token);
                    stk.push(num);
                    break;
                }
        }
        return stk.peek();
    }
}