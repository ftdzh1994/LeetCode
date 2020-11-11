import java.util.Map;
/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
class TwoSum {

    /** Initialize your data structure here. */
    private HashMap<Integer,Integer> num_counts;
    public TwoSum() {
        this.num_counts = new HashMap<Integer,Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if (this.num_counts.containsKey(number)) {
            this.num_counts.put(number, this.num_counts.get(number) + 1);
        } else {
            this.num_counts.put(number, 1);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : this.num_counts.entrySet()) {
            int complement = value - entry.getKey();
            if (this.num_counts.containsKey(complement)) {
                if (complement != entry.getKey()) {
                    return true;
                } else if (entry.getValue() > 1){
                    return true;
                }
            }
        }
        return false;
    }
}

// How to do the HashMap Traversal: Map.Entry; map.entrySet