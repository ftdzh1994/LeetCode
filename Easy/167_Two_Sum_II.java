// Approach #1: HashMap

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }
        int complement;
        int complementIdx;
        for (int i = 0; i < numbers.length; i++) {
            complement = target - numbers[i];
            if (map.containsKey(complement)
            && (complementIdx = map.get(complement)) != i + 1 ) {
                return new int [] {i + 1, map.get(complement) };
            }
        }
        return new int [] {-1, -1};
    }
}

// Approach #2: two pointer


/* Conlusion:
 * Only when the elements of array are unsorted, HashMap is consider
 * becasuse HashMap can't take advantage of the sorted character
 */
