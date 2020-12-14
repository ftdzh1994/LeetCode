class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int nw = word.length(), na = abbr.length();
        int p1 = 0, p2 = 0;
        int num = 0;
        while( p1 < nw || p2 < na) {
            char c2 = abbr.charAt(p2);
            if (Character.isDigit(c2)) {
                num = num * 10 + (c2 - '0');
                p2++;
            }
            if (! Character.isDigit(c2) || p2 == na - 1) {
                p1 = p1 + num;
                if (p1 == nw) {
                    return true;
                }
                char c1 = word.charAt(p1);
                if (p1 != nw && c2 != c1) {
                    return false;
                }
                p1 ++;
                p2 ++;
            }
        }
    }
}