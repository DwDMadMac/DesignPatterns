package net.pl3x.patterns.visitor.exercise.solution;

public class NormalizeFilter implements FilterOperation{
    /**
     * This method will apply the Normalize filter to the format segment
     *
     * @param formatSegment Apply format segment
     */
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Apply Normalize filter to format segment.");
    }

    /**
     * This method will apply the Normalize filter to the fact segment
     *
     * @param factSegment Apply fact segment
     */
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Apply Normalize filter to fact segment.");
    }
}
