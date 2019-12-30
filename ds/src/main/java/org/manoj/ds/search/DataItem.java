package org.manoj.ds.search;

public class DataItem<K, V> {
    private K key;
    private V value;

    public DataItem() {
    }

    public DataItem(K key) {
        this.key = key;
    }

    public DataItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return K return the key
     */
    public K getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @return V return the value
     */
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataItem [key=" + key + ", value=" + value + "]";
    }

}