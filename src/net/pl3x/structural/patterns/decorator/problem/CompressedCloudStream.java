package net.pl3x.structural.patterns.decorator.problem;

public class CompressedCloudStream extends CloudStream {
    /**
     * Gets inputted data and compresses the data
     *
     * @param data Get data and compress
     */
    @Override
    public void write(String data) {
        var compressed = compress(data);
        super.write(compressed);
    }

    /**
     * Get the inputted data and compress the data
     *
     * @param data Get data
     * @return Return data compressed
     */
    private String compress(String data) {
        return data.substring(0, 5);
    }
}
