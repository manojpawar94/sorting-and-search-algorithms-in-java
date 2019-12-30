package org.manoj.ds.search;

import org.junit.Test;

public class HashTableTest {

    @Test
    public void hashTableTest() {
        HashTable<Integer, String> myHashaTable = new HashTable<>(20);
        myHashaTable.put(1, "Manoj");
        myHashaTable.put(1, "Raja");
        myHashaTable.put(4, "Sai");
        myHashaTable.put(1, "Shiva");
        for (int index = 1; index < 5; index++) {
            System.out.println("[index] " + index + " " + myHashaTable.get(index));
        }

        HashTable<String, String> myHashaTable2 = new HashTable<>(20);
        myHashaTable2.put("One", "Manoj");
        System.out.println(myHashaTable2.get("One"));
        System.out.println(myHashaTable2.getValue("One"));
    }
}