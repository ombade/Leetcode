class MyHashSet {
    private static final int MAX_SIZE = 1000001;
    
    private boolean[] store;

    public MyHashSet() {
        store = new boolean[MAX_SIZE];
    }
    
    public void add(int key) {
        store[key] = true;
    }
    
    public void remove(int key) {
        store[key] = false;
    }
    
    public boolean contains(int key) {
        return store[key];
    }
}

