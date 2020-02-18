package net.pl3x.structural.patterns.decorator.solution;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    /**
     * Initialize the stream object
     *
     * @param stream Get stream
     */
    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    /**
     * Gets inputted data and compresses the data
     *
     * @param data Get data and compress
     */
    @Override
    public void write(String data) {
        var compressed = compress(data);
        //super.write(compressed);
        stream.write(compressed); // This is where we use composition
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
