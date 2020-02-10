package net.pl3x.behavioural.patterns.visitor.exercise.solution;

/**
 * This is the fact Segment for apply filters
 */
public class FactSegment extends Segment {
    /**
     * Apply filter
     *
     * @param filter Apply filter
     */
    @Override
    public void applyFilter(FilterOperation filter) {
        filter.apply(this);
    }
}
