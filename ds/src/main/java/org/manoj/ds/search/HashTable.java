package org.manoj.ds.search;

public class HashTable<K, V> {
    private DataItem<K, V> hashArray[];
    private int size;

    public HashTable(int size) {
        this.hashArray = new DataItem[size];
        this.size = size;
    }

    private int hashCode(K key) {
        return key.hashCode() % this.size;
    }

    public void put(K key, V value) {
        DataItem<K, V> dataItem = new DataItem<>(key, value);
        int hashIndex = this.hashCode(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() != key)
                return;
            ++hashIndex;
            hashIndex %= this.size;
        }

        hashArray[hashIndex] = dataItem;
    }

    public void delete(DataItem<K, V> dataItem) {
        int hashIndex = this.hashCode(dataItem.getKey());
        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() == dataItem.getKey()) {
                hashArray[hashIndex] = null;
            }
            ++hashIndex;
            hashIndex %= this.size;
        }
    }

    public DataItem<K, V> get(K key) {
        int hashIndex = this.hashCode(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() == key) {
                return hashArray[hashIndex];
            }
            ++hashIndex;
            hashIndex %= this.size;
        }

        return null;
    }

    public V getValue(K key) {
        int hashIndex = this.hashCode(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].getKey() == key) {
                return hashArray[hashIndex].getValue();
            }
            ++hashIndex;
            hashIndex %= this.size;
        }

        return null;
    }

}