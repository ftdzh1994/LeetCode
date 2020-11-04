class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int curChar;
        int l = s.length() - 1;
        for (int i = l; i >= 0; i--) {
            curChar = s.charAt(i);
            if (curChar == ' ' && length != 0) {
                break;
            } 
            if (curChar != ' ' && length == 0) {
                length += 1;
            } 
        }
        return length;
    }
}