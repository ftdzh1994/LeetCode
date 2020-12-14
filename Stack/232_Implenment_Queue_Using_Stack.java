class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stk;
    public MyQueue() {
        stk = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> tmp = new Stack<Integer>();
        while (!stk.isEmpty()) {
            tmp.push(stk.pop());
        }
        tmp.push(x);
        while (!tmp.isEmpty()) {
            stk.push(tmp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stk.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stk.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */