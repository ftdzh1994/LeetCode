class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length(), n2 = b.length();
        int carry = 0;
        StringBuilder binary = new StringBuilder();
        int i = 0, n = Math.max(n1, n2);
        while(i < n) {
            carry += i < n1 ? a.charAt(n1 - 1 - i) - '0' : 0;
            carry += i < n2 ? b.charAt(n2 - 1 - i) - '0' : 0;
            System.out.println(carry);
            binary.append(carry % 2);
            carry = carry / 2;
            i++;
        }
        if(carry > 0) {
            binary.append(carry);
        }
        return binary.reverse().toString();
    }
}