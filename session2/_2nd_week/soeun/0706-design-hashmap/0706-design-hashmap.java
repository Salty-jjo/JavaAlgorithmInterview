class MyHashMap {
    HashMap<Integer, Integer> hashMap;

    public MyHashMap() {
        hashMap = new HashMap<Integer, Integer>( );
    }
    
    public void put(int key, int value) {
        hashMap.put(key, value);
    }
    
    public int get(int key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            return -1;
        }
    }
    
    public void remove(int key) {
        hashMap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */