class Solution {
    public boolean isHappy(int n) {
        while(n != 1){
            int sum = 0;
            while(n != 0){
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}


// how to check loop