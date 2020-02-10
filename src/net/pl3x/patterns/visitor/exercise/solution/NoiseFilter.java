package net.pl3x.patterns.visitor.exercise.solution;

public class NoiseFilter implements FilterOperation {
    /**
     * This method will apply the Noise filter to the format segment
     *
     * @param formatSegment Apply format segment
     */
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Apply Noise filter to format segment.");
    }

    /**
     * This method will apply the Noise filter to the fact segment
     *
     * @param factSegment Apply fact segment
     */
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Apply Noise filter to fact segment.");
    }
}
