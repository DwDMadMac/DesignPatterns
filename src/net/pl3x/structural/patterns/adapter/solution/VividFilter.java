package net.pl3x.structural.patterns.adapter.solution;

/**
 * This filter is going to make out image vivid with beautiful filters
 */
public class VividFilter implements Filter {
    /**
     * this method will apply the Vivid filter to an image
     *
     * @param image Take an image and apply filter
     */
    @Override
    public void apply(Image image) {
        System.out.println("Apply Vivid Filter");
    }
}
