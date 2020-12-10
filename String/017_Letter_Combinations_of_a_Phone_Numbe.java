import java.util.ArrayList;
import java.util.List;

import sun.awt.www.content.image.gif;

class Solution {
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        if (digits.length() == 0) {
            return ans;
        }
        backtrace(digits, 0, sb, ans);
        return ans;
    }

    public void backtrace(String digits, int index, StringBuilder sb, List<String> ans) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String letter = phoneMap.get(digits.charAt(index));
        for (int i = 0; i < letter.length(); i++) {
            sb.append(letter.charAt(i));
            backtrace(digits, index + 1, sb, ans);
            sb.deleteCharAt(index);
        }
    }
}