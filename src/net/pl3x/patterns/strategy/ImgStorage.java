package net.pl3x.patterns.strategy;

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
public class ImgStorage {
    // It would be better to use an 'Enum' since we are using a set of constants
    /*
    private Compressor compressor;
    private Filter filter;

    /*
     * Passing a compressor object with creating a new image storage
     *
    public ImgStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }
    */

    /*
     * Now when creating an image storage we have the flexible to pass different compressor & filters
     */
    public void store(String fileName, Compressor compressor, Filter filter) {
        // Delegate/forward the requisite of the compressing image
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
