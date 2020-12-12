class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        if (n <= 1) return res;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1) == '+') {
                res.add(s.substring(0,i) + "--" + s.substring(i + 2, n));
            }
        }
        return res;
    }
}