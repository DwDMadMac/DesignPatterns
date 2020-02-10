package net.pl3x.patterns.visitor.exercise.solution;

/**
 * This class in the Visitor Interface that contains two concrete elements are params
 *
 * If we want to add new standard filters this is the location you would want to add it to
 */
public interface FilterOperation {
    /**
     * This method will apply a filter to the format segment
     *
     * @param formatSegment Apply format segment
     */
    void apply (FormatSegment formatSegment);

    /**
     * This method will apply a filter to the fact segment
     *
     * @param factSegment Apply fact segment
     */
    void apply (FactSegment factSegment);
}
