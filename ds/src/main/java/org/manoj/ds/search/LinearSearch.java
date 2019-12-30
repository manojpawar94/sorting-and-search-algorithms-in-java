package org.manoj.ds.search;

public class LinearSearch implements Search {

    @Override
    public <E extends Comparable<E>> int search(E[] collection, E item) {
        int index = 0;
        for (E element : collection) {
            if (element.equals(item))
                return index;
            index++;
        }
        return -1;
    }

}