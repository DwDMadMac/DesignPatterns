package net.pl3x.structural.patterns.adapter.solution;

import net.pl3x.structural.patterns.adapter.solution.avaFilters.Caramel;

/**
 * This class is the Caramel Adaptive Class
 */
public class CaramelFilter implements Filter {
    private Caramel caramel;

    /**
     * This method initializes the caramel object
     *
     * @param caramel Get caramel filter
     */
    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    /**
     * This method applies an image to a filter
     *
     * @param image Take an image and apply filter
     */
    @Override
    public void apply(Image image) {
        /*
         * Whenever we want to apply this filter, we must fist call
         * the required method that is specified by the library
         */
        caramel.init();
        /*
         * Then we can call the render() method and pass the image
         */
        caramel.render(image);
    }
}
