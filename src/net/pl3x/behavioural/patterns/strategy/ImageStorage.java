package net.pl3x.behavioural.patterns.strategy;

/*
 * this class will give us the ability to store the images users upload
 *
 * Storing an image requires a few steps
 * - > Compress image algorithms like JPEN, PNG, ETC.
 * -> Apply filter so all iamges look the same like b&W (Black & White), High Contrast, Etc.
 *
 * This class is violating SRP due to the following:
 * -> Storing an image
 * -> Compressing an image
 * -> Applying a filter
 *
 * OOP methodology
 * -> Encapsulation
 * -> Abstraction
 * -> Inheritance
 * -> Polymorphism
 *
 * State and Strategy Patterns look very similar in comparision
 * What are the differences?
 * -> In a Strategy pattern, we do not have a single state
 * -> different behaviours are represented using different Strategy objects
 */
public class ImageStorage {
    // It would be better to use an 'Enum' since we are using a set of constants
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if (compressor == "jpeg") {
            System.out.println("Compressing using JPEP");
        } else if (compressor == "png") {
            System.out.println("Compressing using PNG>");
        }

        if (filter == "b&w") {
            System.out.println("Applying B&W filter.");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high contrast filter");
        }
    }
}
