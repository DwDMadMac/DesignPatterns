package net.pl3x.structural.patterns.adapter.solution;

public interface Filter {
    /**
     * This method applies an image to a filter
     *
     * @param image Take an image and apply filter
     */
    void apply(Image image);
}
