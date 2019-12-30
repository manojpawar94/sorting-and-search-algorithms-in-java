package org.manoj.ds.search;

import java.util.Collection;
import java.util.Iterator;

public class LinearSearch implements Search {

    @Override
    public int search(Collection<Object> collection, Object item) {
        Iterator<Object> iterator = collection.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

}