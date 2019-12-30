package org.manoj.ds.sort;

import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;

/**
 * In insertion sort sorted partition grows left to right unlike bubble sort and
 * selection sort It is inplace sorting algorithm It is stable sorting algorithm
 * The time complexity is O(n^2) i.e. Quadratic time complexity
 */
public class InsertionSort implements Sort {
    final static Logger logger = Logger.getLogger(BubbleSort.class);
    private SortingMetadata metadata = null;

    /**
     * 
     */
    @Override
    public <E extends Comparable<E>> void sort(final E[] elements) {
        sort(elements, true);
    }

    /**
     * 
     */
    @Override
    public <E extends Comparable<E>> void sort(final E[] elements, final boolean ascending) {
        metadata = new SortingMetadata(elements.length);
        final Instant start = Instant.now();

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < metadata.getNumberOfElement(); firstUnsortedIndex++) {

            E newElement = elements[firstUnsortedIndex];
            int index = firstUnsortedIndex;
            logger.info("firstUnsortedIndex=" + firstUnsortedIndex + " | newElement=" + newElement + " :");

            if (ascending) {
                while (index > 0 && elements[index - 1].compareTo(newElement) > 0) {
                    elements[index] = elements[index - 1];
                    metadata.increamentSwapOperationByOne();
                    index--;
                }
            } else {
                while (index > 0 && elements[index - 1].compareTo(newElement) < 0) {
                    elements[index] = elements[index - 1];
                    metadata.increamentSwapOperationByOne();
                    index--;
                }
            }

            elements[index] = newElement;
            logger.info("\tsortIndex=" + index + ":");
            Sort.logInfo(logger, elements);
            metadata.incrementIterationByOne();
        }

        final Instant finish = Instant.now();
        metadata.setTimeTakenToExecute(Duration.between(start, finish).toNanos());
    }

    /**
     * @return SortingMetadata return the metadata
     */
    @Override
    public SortingMetadata getMetadata() {
        return metadata;
    }
}