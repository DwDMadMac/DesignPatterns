package net.pl3x.structural.patterns.decorator.solution;

/**
 * This interface will be where we will declare the operations
 * where all streams should support
 */
public interface Stream {
    /**
     * Get inputted data
     *
     * @param data Get data
     */
    void write(String data);
}
