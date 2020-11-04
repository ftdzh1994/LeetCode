import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}





/* How to use Stack in Java
 * import java.util.Stack
 * new: Stack<Integer> s1 = new Stack<Integer>();
 * boolean empty() 
 * Object peek( )
 * Object pop( )
 * Object push(Object element)
 * int search(Object element)   返回对象在堆栈中的位置，以 1 为基数。
 * stack.isEmpty()
 */


/* How to use Queue in Java
 * Queue<String> queue = new LinkedList<String>();
 * queue.offer("a");
 * queue.poll()
 * queue.peek()  queue.element()  
 */
