class Solution {
    public String multiply(String num1, String num2) {
        // corner issue: 0 || null
        if (num1 == null || num2 == null) {
            return null;
        }
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        // base
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length() - 1, n2 = num2.length() - 1, n = n1 + n2;    // 分别有 n1 + 1， n2 + 1,  n1 + n2 + 1 位
        int carry = 0;
        for (int i = 0; i <= n; i++) {          // get the last ith digit of the multiply result
            for (int j = 0; j <= i && j <= n1; j++) {
                int k = i - j;
                if (k > n2) {
                    continue;
                }
                int digit1 = Character.getNumericValue(num1.charAt(n1 - j));
                int digit2 = Character.getNumericValue(num2.charAt(n2 - k));
                carry += digit1 * digit2;
            }
            sb.append(Integer.toString(carry % 10));
            carry = carry / 10;
        }
        if (carry >0 ) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}