class MyStack {
    private Queue<Integer> queue;
    
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
        return queue.remove();
    }
    
    public int top() {
        int ans = 0;
        for (int i = 0; i < queue.size(); i++) {
            ans = queue.remove();
            queue.add(ans);
        }
        return ans;
    }
    
    public boolean empty() {
        return queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
