class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        Map<Character, Character> right_match = new HashMap<Character, Character>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        for (char c : s.toCharArray()) {
            if(right_match.containsKey(c)) {    // right parenthese    
                if (!stk.isEmpty() && stk.peek() == right_match.get(c)) {
                    stk.pop();
                } else {
                    return false;
                }
            } else {                            // left parenthese
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}