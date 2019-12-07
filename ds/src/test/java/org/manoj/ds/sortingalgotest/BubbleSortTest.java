package org.manoj.ds.sortingalgotest;


import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manoj.ds.sort.BubbleSort;
import org.manoj.ds.sort.Sort;

public class BubbleSortTest {

    final static Logger logger = Logger.getLogger(BubbleSortTest.class);

    @BeforeClass
    public static void initialze() {
        Sort.setDefaultLogger();
    }

    @Test
    public void testSortingAlgorithmOnString() {
        final String[] array = { "Manoj", "Sai", "Keshav", "Annapurna" };
        final Sort sort = new BubbleSort();
        sort.sort(array);
        sort.sort(array, false);
    }

    @Test
    public void testSortingAlgorithmOnInteger() {
        final Integer[] array = { 55, 23, 94, 65, 19, 24 };
        final Sort sort = new BubbleSort();
        sort.sort(array);
        for (final Integer integer : array) {
           logger.info(">>" + integer); 
        }
        logger.info(sort.getMetadata().toString());
    }
}