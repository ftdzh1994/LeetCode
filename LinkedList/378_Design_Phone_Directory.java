class PhoneDirectory {

    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    int max;
    boolean phones[];
    Deque<Integer> avial = new LinkedList<Integer>();

    public PhoneDirectory(int maxNumbers) {
        this.phones = new boolean[maxNumbers];
        for (int i = 0; i < maxNumbers; i++) {
            avial.addLast(i);
        }
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        if (avial.isEmpty()) return -1;
        int k = avial.removeFirst();
        phones[k] = true;
        return k;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !phones[number];
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        if (phones[number]) {
            phones[number] = false;
            avial.addFirst(number);
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */