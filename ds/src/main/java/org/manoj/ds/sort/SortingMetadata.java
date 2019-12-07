package org.manoj.ds.sort;

import java.time.Duration;

public class SortingMetadata {
    private int numberOfElement;
    private int numberOfIterations;
    private int numberOfSwapOperations;
    private long timeTakenToExecute;

    public SortingMetadata(int numberOfElement) {
        super();
        this.numberOfElement = numberOfElement;
        this.numberOfIterations = 0;
        this.numberOfSwapOperations = 0;
    }

    /**
     * @return int return the numberOfElement
     */
    public int getNumberOfElement() {
        return this.numberOfElement;
    }

    /**
     * @return int return the numberOfIterations
     */
    public int getNumberOfIterations() {
        return this.numberOfIterations;
    }

    /**
     * @param numberOfIterations the numberOfIterations to set
     */
    protected void incrementIterationByOne() {
        this.numberOfIterations++;
    }

    /**
     * @return int return the numberOfSwapOperations
     */
    public int getNumberOfSwapOperations() {
        return this.numberOfSwapOperations;
    }

    /**
     * @param numberOfSwapOperations the numberOfSwapOperations to set
     */
    protected void increamentSwapOperationByOne() {
        this.numberOfSwapOperations++;
    }

    /**
     * @return long return the timeTakenToExecute
     */
    public long getTimeTakenToExecuteInNanoSeconds() {
        return timeTakenToExecute;
    }

    public long getTimeTakenToExecuteInMiliSeconds() {
        return Duration.ofNanos(this.timeTakenToExecute).toMillis();
    }

    public long getTimeTakenToExecuteInMinutes() {
        return Duration.ofNanos(this.timeTakenToExecute).toMinutes();
    }

    /**
     * @param timeTakenToExecute the timeTakenToExecute to set
     */
    protected void setTimeTakenToExecute(long timeTakenToExecute) {
        this.timeTakenToExecute = timeTakenToExecute;
    }


    @Override
    public String toString() {
        return "SortingMetadata [numberOfElement=" + numberOfElement + ", numberOfIterations=" + numberOfIterations
                + ", numberOfSwapOperations=" + numberOfSwapOperations + ", timeTakenToExecute=" + timeTakenToExecute
                + "nanoseconds]";
    }

}