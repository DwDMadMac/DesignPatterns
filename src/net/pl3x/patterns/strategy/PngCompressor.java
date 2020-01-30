package net.pl3x.patterns.strategy;

/*
 * Concrete Object
 */
public class PngCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
