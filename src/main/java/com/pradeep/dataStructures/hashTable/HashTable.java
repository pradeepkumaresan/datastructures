package com.pradeep.dataStructures.hashTable;

public class HashTable<X, Y> {
    private Entry<X, Y>[] data;
    private int capacity;
    private int size;

    public HashTable(int tableSize) {
        this.capacity = tableSize;
        this.data = new Entry[this.capacity];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public Y get(X key) {
        int hash = calculateHash(key);

        if(data[hash] == null)
            return null;
        else
            return data[hash].getValue();
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);

        data[hash] = new Entry<>(key, value);
        size--;
    }

    public int calculateHash(X key) {
        int hash = (key.hashCode() % this.capacity);
        // necessary to deal with collisions
        while(data[hash] != null & !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    private class Entry<X, Y>{
        private X key;
        private Y value;

        public Entry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}
