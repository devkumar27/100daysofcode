class MinStack {
    Stack<Long> stk = new Stack<>();
    long min;
    public MinStack() {
        min = Long.MAX_VALUE;
    }    
    public void push(int val) {
        long value = Long.valueOf(val);
        if(stk.isEmpty()) {
            min = value;
            stk.push(value);
        }
        else {
            if(value < min) {
                stk.push((2*value) - min);
                min = value;
            }
            else {
                stk.push(value);
            }
        }
    }
    public void pop() {
        if(stk.isEmpty()) return;
        long val = stk.pop();
        if(val < min) {
            min = (2*min) - val;
        }
    }
    public int top() {
        long head = stk.peek();
        if(head < min) {
            return (int)min;
        }
        return (int)head;
    }
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
