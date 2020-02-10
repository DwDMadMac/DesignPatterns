package net.pl3x.behavioural.patterns.visitor.exercise.solution;

/**
 * This is the Format Segment for apply filters
 */
public class FormatSegment extends Segment {
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
