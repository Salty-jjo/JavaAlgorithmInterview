class MyCircularDeque {
    private Deque<Integer> deq = new ArrayDeque<>();
    private int size = 0;

    public MyCircularDeque(int k) {
        this.size = k;
    }
    
    public boolean insertFront(int value) {
        if (isFull())
            return false;
        
        deq.addFirst(value);
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull())
            return false;
        
        deq.addLast(value);
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty())
            return false;
        deq.removeFirst();
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty())
            return false;
        deq.removeLast();
        return true;
    }
    
    public int getFront() {
        if (isEmpty())
            return -1;
        return deq.getFirst();
    }
    
    public int getRear() {
        if (isEmpty())
            return -1;
        return deq.getLast();
    }
    
    public boolean isEmpty() {
        return deq.size() == 0;
    }
    
    public boolean isFull() {
        return deq.size() == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */