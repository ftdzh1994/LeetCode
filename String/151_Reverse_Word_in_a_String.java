class Solution {
    public String reverseWords(String s) {
        // corner 
        int n = s.length();
        if (n < 1) return null;
        // base
        String ans = "";
        String word = "";
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; --i) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (word.equals("")) continue;
                else {
                    ans = ans + (ans.equals("") ? "" : " ") + word;
                    word = "";
                }
            } else {
                word = ch + word;
            }
        }
        if (!word.equals("")) {
            ans = ans + (ans.equals("") ? "" : " ") + word;
        } 
        return ans;
    }
}