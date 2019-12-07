package org.manoj.ds.sort;

import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;

/**
 * Selection sort divide the array into sorted and unsorted partition. The
 * largest element from the unsorted partition is selected and move it into the
 * sorted partition. For starting first element from unsorted partition is
 * consider as largest element and compared it with remaining element of
 * unsorted partition In selection sort, lastUnsortedIndex is the length of the
 * array.
 * 
 * It is inplace algorithm The time complexity is O(n^2) - quadratic It is
 * unstable algorithm It does not required as much swap as we do in bubble sort,
 * hence performance is higher than bubble sort.
 */
public class SelectionSort implements Sort {

    final static Logger logger = Logger.getLogger(SelectionSort.class);
    private SortingMetadata metadata = null;

    @Override
    public <E extends Comparable<E>> void sort(E[] elements) {
        sort(elements, true);
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] elements, boolean ascending) {
        metadata = new SortingMetadata(elements.length);
        Instant start = Instant.now();
        for (int lastUnsortedIndex = elements.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            logger.info("lastUnsortedIndex=" + lastUnsortedIndex + ":");
            int selectedElementIndex = 0;
            for (int selectionIndex = 1; selectionIndex <= lastUnsortedIndex; selectionIndex++) {
                if (ascending) {
                    if ((elements[selectedElementIndex].compareTo(elements[selectionIndex])) < 0) {
                        selectedElementIndex = selectionIndex;
                    }
                } else {
                    if ((elements[selectedElementIndex].compareTo(elements[selectionIndex])) > 0) {
                        selectedElementIndex = selectionIndex;
                    }
                }
                metadata.incrementIterationByOne();
            }
            Sort.swap(elements, selectedElementIndex, lastUnsortedIndex);
            metadata.increamentSwapOperationByOne();
            logger.info("\tselectedElementIndex=" + selectedElementIndex + " | selectedElementValue="
                    + elements[selectedElementIndex] + ":");
            Sort.logInfo(logger, elements);
        }
        Instant finish = Instant.now();
        metadata.setTimeTakenToExecute(Duration.between(start, finish).toNanos());
    }

    @Override
    public SortingMetadata getMetadata() {
        return metadata;
    }
}