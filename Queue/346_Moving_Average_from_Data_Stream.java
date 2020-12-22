class MovingAverage {

    /** Initialize your data structure here. */
    Queue<Integer> queue = new LinkedList<>();
    int maxSize;
    int sum;

    public MovingAverage(int size) {
        maxSize = size;
        sum = 0;
    }
    
    public double next(int val) {
        if (queue.size() == maxSize) {
            sum -= queue.poll();
        }
        sum += val;
        queue.offer(val);
        return (double) sum / queue.size();
    }
}

// Try to implement with Circular arrays

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */