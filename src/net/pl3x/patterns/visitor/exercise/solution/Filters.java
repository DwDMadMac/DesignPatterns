package net.pl3x.patterns.visitor.exercise.solution;

/**
 * This class is the element for the Visitor Class
 */
public interface Filters {
    /**
     * Gather the operation from the Segment class
     *
     * @param segment Get operation
     */
    void execute(Segment segment);
}
