package org.manoj.ds.sort;

import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;

/**
 * In Bubble Sort algorithm, the array of elements are partitioned into two
 * parts, the unsorted partition and sorted partition The larger element of
 * array are bubbled to top of the array.
 * 
 * It is inplace algorithm. Not depend of the no of items in array The time
 * complexity is O(n^2) i.e. quadratic. Algorithm performance degrade as element
 * increases in array.
 * 
 * It is stable sorting algorithms. As element are getting swapping only if
 * comparison greater than or less than based upon the ascending or descending
 * sorting parameter.
 */
public class BubbleSort implements Sort {

    final static Logger logger = Logger.getLogger(BubbleSort.class);
    private SortingMetadata metadata = null;

    /**
     * 
     */
    @Override
    public <E extends Comparable<E>> void sort(E[] elements) {
        sort(elements, true);
    }

    /**
     * 
     */
    @Override
    public <E extends Comparable<E>> void sort(E[] elements, boolean ascending) {
        metadata = new SortingMetadata(elements.length);
        Instant start = Instant.now();
        for (int lastUnsortedIndex = elements.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            logger.info("lastUnsortedIndex=" + lastUnsortedIndex + ":");
            for (int bubbledIndex = 0; bubbledIndex < lastUnsortedIndex; bubbledIndex++) {
                if (ascending) {
                    if (elements[bubbledIndex].compareTo(elements[bubbledIndex + 1]) > 0) {
                        Sort.swap(elements, bubbledIndex, bubbledIndex + 1);
                        metadata.increamentSwapOperationByOne();
                    }
                } else {
                    if (elements[bubbledIndex].compareTo(elements[bubbledIndex + 1]) < 0) {
                        Sort.swap(elements, bubbledIndex, bubbledIndex + 1);
                        metadata.increamentSwapOperationByOne();
                    }
                }
                logger.info("\tbubbledIndex=" + bubbledIndex + ":");
                Sort.logInfo(logger, elements);
                metadata.incrementIterationByOne();
            }
        }
        Instant finish = Instant.now();
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