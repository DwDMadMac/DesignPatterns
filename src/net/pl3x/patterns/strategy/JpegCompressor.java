package net.pl3x.patterns.strategy;

/*
 * Concrete Object
 */
public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
