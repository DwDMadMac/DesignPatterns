package net.pl3x.patterns.visitor.exercise.solution;

/**
 * This would be the visitor interface in the GOF Book
 *
 * If we want to add new standard filters this is the location you would want to add it to
 *
 */
public interface Segment {
    /*
    public void reduceNoise() {
        System.out.println("Reduce noise");
    }

    public void addReverb() {
        System.out.println("Add reverb");
    }

    public void normalize() {
        System.out.println("Normalize");
    }
    */

    /**
     * Add Noise filter operation
     *
     * @param noiseFilter Add Noise Filter
     */
    void apply(NoiseFilter noiseFilter);

    /**
     * Add Reverb Filter operation
     *
     * @param reverbFilter Add Reverb Filter
     */
    void apply(ReverbFilter reverbFilter);

    /**
     * Add Normalize Filter operation
     *
     * @param normalizeFilter Add Normalize Filter
     */
    void apply(NormalizeFilter normalizeFilter);
}
