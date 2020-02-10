package net.pl3x.patterns.visitor.exercise.solution;

public class ReverbFilter implements FilterOperation {
    /**
     * This method will apply the Reverb filter to the format segment
     *
     * @param formatSegment Apply format segment
     */
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Apply Reverb filter to format segment.");
    }

    /**
     * This method will apply the Reverb to the fact segment
     *
     * @param factSegment Apply fact segment
     */
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Apply Reverb filter to fact segment.");
    }
}
