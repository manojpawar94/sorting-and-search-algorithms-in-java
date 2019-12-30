package org.manoj.ds.search;

public class BinearySearch implements Search {

    @Override
    public <E extends Comparable<E>> int search(E[] collection, E item) {
        return binearySearch(collection, item, 0, collection.length);
    }

    private <E extends Comparable<E>> int binearySearch(E[] collection, E item, int lowerIndex, int higherIndex) {
        int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
        
        if (higherIndex >= lowerIndex) {
            if (collection[middleIndex].equals(item)) {
                return middleIndex;
            } else if (collection[middleIndex].compareTo(item) > 0) {
                binearySearch(collection, item, middleIndex + 1, higherIndex);
            } else if (collection[middleIndex].compareTo(item) < 0) {
                binearySearch(collection, item, lowerIndex, middleIndex - 1);
            }
        }

        return -1;
    }

}