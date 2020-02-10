package net.pl3x.behavioural.patterns.visitor.exercise.solution;

/**
 * This would be the element interface in the GOF Book
 */
public abstract class Segment {
    /**
     * this method will apply the given filter
     *
     * @param filter Apply filter
     */
    public abstract void applyFilter(FilterOperation filter);
}
