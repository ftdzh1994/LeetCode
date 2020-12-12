import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Integer> last_occur = new HashMap<>();
        HashSet<Character> included = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            last_occur.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!included.contains(c)) {
                // pop the top element included which is smaller than c and will occur later
                while (!stk.isEmpty() && stk.peek() > c && last_occur.get(stk.peek()) > i) {
                    included.remove(stk.pop());
                }
                stk.push(c);
                included.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stk) sb.append(c.charValue());
        sb.toString()
    }
}