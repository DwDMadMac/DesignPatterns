package net.pl3x.patterns.strategy;

public interface Compressor {
    // You can represent an image using an byte[]
    // Example: byte[] compress(byte[] image);
    // For demo purposes we will use a void
    void compress(String fileName);
}
