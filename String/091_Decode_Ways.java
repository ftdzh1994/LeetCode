// dp
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int curr = 1, pre = 1;
        for (int i = 1; i < s.length(); i++) {
            int tmp = pre;
            if(s.charAt(i) == '0'){
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    curr = pre;
                } else {
                    return 0;
                }
            } else {
                if (s.charAt(i) == '1' || (s.charAt(i - 1) == '2' && 1 <= s.charAt(i) && s.charAt(i) <= 6)) {
                    curr = curr + pre;
                }
            }
            pre = tmp;
        }
        return curr;
    }
}

// Recursion;
class Solution {
    int g[];

    public int numDecodings(String s) {
        int n = s.length();
        g = new int[n + 3];
        return (getNum(s, 0));
    }

    public int getNum(String s, int n) {
        if(g[n] != 0) {
            return g[n];
        }

        if (n > s.length() - 1) {
            g[n] = 1;
            return g[n];
        }

        int num = 0;
        num += isCode(s.substring(n, n + 1)) ? getNum(s, n + 1) : 0;
        if (n < s.length() - 1) 
            num += isCode(s.substring(n, n + 2)) ? getNum(s, n + 2) : 0;
        g[n] = num;
        return g[n];
    }

    public boolean isCode(String s) {
        int n1 = s.charAt(0);
        int n = Integer.parseInt(s);
        return n1 != '0' && 0 < n && n <= 26;
    }
}


// Integer.ParseInt("01") = 1;