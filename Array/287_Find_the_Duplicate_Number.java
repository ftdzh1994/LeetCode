// Binary Search 
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n , ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int count = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}

// Floyd 判圈；快慢指针
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
