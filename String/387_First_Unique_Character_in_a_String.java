class Solution {
    public int firstUniqChar(String s) {
        char[] cnt = new char[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[(int)(c - 'a')] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (cnt[(int)(c - 'a')] == 1) 
                return i;
        }
        return -1;
    }
}