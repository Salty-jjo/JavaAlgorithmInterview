class MyQueue {
    Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        Stack tmp = new Stack<>();
        tmp.push(x);
        for (int i = 0; i < st.size(); i++) {
            tmp.add(st.pop());
        }
        st = tmp;
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.size() == 0;
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
