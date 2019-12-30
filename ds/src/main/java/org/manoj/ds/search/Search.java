package org.manoj.ds.search;

public interface Search {

    public <E extends Comparable<E>> int search(E[] collection, E item);
}