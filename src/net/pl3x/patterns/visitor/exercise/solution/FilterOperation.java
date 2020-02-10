package net.pl3x.patterns.visitor.exercise.solution;

public class FilterOperation implements Segment {
    /**
     * Add Noise filter operation
     *
     * @param noiseFilter Add Noise Filter
     */
    @Override
    public void apply(NoiseFilter noiseFilter) {
        System.out.println("Noise Filter Added");
    }

    /**
     * Add Reverb Filter operation
     *
     * @param reverbFilter Add Reverb Filter
     */
    @Override
    public void apply(ReverbFilter reverbFilter) {
        System.out.println("Reverb Filter Add");
    }

    /**
     * Add Normalize Filter operation
     *
     * @param normalizeFilter Add Normalize Filter
     */
    @Override
    public void apply(NormalizeFilter normalizeFilter) {
        System.out.println("Normalize Filter Added");
    }
}
