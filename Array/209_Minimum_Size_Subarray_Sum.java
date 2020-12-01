class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int num : nums) {
            queue.offer(num);
            sum += num;
            if (sum < s) {
                continue;
            }
            if (sum >= s) {
                while(sum - queue.peek() >= s) {
                    sum -= queue.poll();
                }
                minLength = Math.min(minLength, queue.size());
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 :minLength;
    }
}

// 前缀和相减

// two pointer