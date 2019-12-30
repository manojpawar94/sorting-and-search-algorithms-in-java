package org.manoj.ds.sortingalgotest;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manoj.ds.sort.InsertionSort;
import org.manoj.ds.sort.Sort;

public class InsertionSortTest{
    final static Logger logger = Logger.getLogger(InsertionSortTest.class);

    @BeforeClass
    public static void initialze() {
        Sort.setDefaultLogger();
    }

    @Test
    public void testSortingAlgorithmOnString() {
        final String[] array = { "Manoj", "Sai", "Keshav", "Annapurna","Krushna" };
        final Sort sort = new InsertionSort();
        sort.sort(array, false);
        // sort.sort(array, false);
        for (final String element : array) {
            logger.info(">> " + element);
        }
        logger.info(sort.getMetadata().toString());
    }

    @Test
    public void testSortingAlgorithmOnInteger() {
        final Integer[] array = { 55, 23, 94, 65, 19, 24, 35 };
        Sort.logInfo(logger, array);
        final Sort sort = new InsertionSort();
        sort.sort(array,false);
        for (final Integer integer : array) {
            logger.info(">> " + integer);
        }
        logger.info(sort.getMetadata().toString());
        logger.info(sort.getMetadata().getTimeTakenToExecuteInMiliSeconds());
    }
}