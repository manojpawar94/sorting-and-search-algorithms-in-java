package org.manoj.ds.sortingalgotest;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manoj.ds.sort.SelectionSort;
import org.manoj.ds.sort.Sort;

public class SelectionSortTest {
    final static Logger logger = Logger.getLogger(SelectionSortTest.class);

    @BeforeClass
    public static void initialze() {
        Sort.setDefaultLogger();
    }

    @Test
    public void testSortingAlgorithmOnString() {
        final String[] array = { "Manoj", "Sai", "Keshav", "Annapurna","Krushna" };
        final Sort sort = new SelectionSort();
        sort.sort(array);
        // sort.sort(array, false);
        for (final String element : array) {
            logger.info(">> " + element);
        }
        logger.info(sort.getMetadata().toString());
    }

    @Test
    public void testSortingAlgorithmOnInteger() {
        final Integer[] array = { 55, 23, 94, 65, 19, 24, 35 };
        final Sort sort = new SelectionSort();
        sort.sort(array);
        for (final Integer integer : array) {
            logger.info(">> " + integer);
        }
        logger.info(sort.getMetadata().toString());
    }
}