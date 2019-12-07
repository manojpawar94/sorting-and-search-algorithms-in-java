package org.manoj.ds.sort;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public interface Sort {

    public SortingMetadata getMetadata();

    public <E extends Comparable<E>> void sort(E[] elements);

    public <E extends Comparable<E>> void sort(E[] elements, boolean ascending);

    public static void setDefaultLogger() {
        String log4jConfPath = "ds/src/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
    }

    public static void setCustomLogger(String log4jConfPath) {
        PropertyConfigurator.configure(log4jConfPath);
    }

    public static <E> void swap(E[] elements, int swapTo, int swapAt) {
        if (swapTo == swapAt)
            return;
        E temp = elements[swapTo];
        elements[swapTo] = elements[swapAt];
        elements[swapAt] = temp;
    }

    public static <E> void logInfo(Logger logger, E[] elements) {
        int index = 0;
        String message = "";
        for (E element : elements) {
            message += element.toString() + (index++ < elements.length - 1 ? ", " : "");
        }
        logger.info("\t\t" + message);
    }
}