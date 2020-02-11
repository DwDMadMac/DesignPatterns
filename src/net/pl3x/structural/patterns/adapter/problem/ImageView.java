package net.pl3x.structural.patterns.adapter.problem;

/**
 * This class will contain an image and allow us to apply different filters to it
 */
public class ImageView {
    private Image image;

    /**
     * constructor to initialize the image object
     *
     * @param image Get image
     */
    public ImageView(Image image) {
        this.image = image;
    }

    /**
     * This method will take a filter object and apply to the image
     *
     * @param filter Get filter and apply
     */
    public void apply(Filter filter){
        filter.apply(image);
    }
}
