class Solution {
    public int titleToNumber(String s) {
        int length = s.length();
        int number = 0;
        for (int i = 0; i < length; i++){
            number = number * 26 + (int)s.charAt(i) - 64;
        }
        return number;
    }
}





/* Java Character and Integer Convert
*       char x = 'A';
        System.out.println(x + 0);
    or  System.out.println((int) x);

        int x = 65;
        System.out.println((char) x);
*/