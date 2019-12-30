package org.manoj.ds.search;

public class InterpolationSearch implements Search {

    @Override
    public <E extends Comparable<E>> int search(E[] collection, E item) {
        if (item instanceof Integer) {
            int[] tempIntArray = new int[collection.length];
            System.arraycopy(collection, 0, tempIntArray, 0, collection.length);
            return binearySearch(tempIntArray, (Integer) item, 0, collection.length);
        } else {
            throw new RuntimeException("Only integer collection is supported!");
        }

    }

    private int binearySearch(int[] collection, int item, int lowerIndex, int higherIndex) {
        int middleIndex = lowerIndex + ((higherIndex - lowerIndex) / (collection[higherIndex] - collection[lowerIndex]))
                * (item - collection[lowerIndex]);

        if (higherIndex >= lowerIndex) {
            if (collection[middleIndex] == item) {
                return middleIndex;
            } else if (collection[middleIndex] > item) {
                binearySearch(collection, item, middleIndex + 1, higherIndex);
            } else if (collection[middleIndex] < item) {
                binearySearch(collection, item, lowerIndex, middleIndex - 1);
            }
        }

        return -1;
    }
}