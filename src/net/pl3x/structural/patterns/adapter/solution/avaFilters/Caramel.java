package net.pl3x.structural.patterns.adapter.solution.avaFilters;

import net.pl3x.structural.patterns.adapter.solution.Image;

/**
 * This class will be a filter that is being used for a filter library
 */
public class Caramel {
    /**
     * This method is required to have by the filter library
     */
    public void init(){

    }

    /**
     * This method is where we render the caramel filter to the image
     *
     * @param image Apply caramel filter to image
     */
    public void render(Image image){
        System.out.println("Applying Caramel Filter");
    }
}
