package net.pl3x.structural.patterns.decorator.solution;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    /**
     * Initialize the stream object
     *
     * @param stream Get stream
     */
    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    /**
     * Overwrites method to encrypted data before sending it
     *
     * @param data Get data and encrypted
     */
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        // super.write(encrypted);
        stream.write(encrypted); // This is where we use composition
    }

    /**
     * This will encrypted the data
     *
     * @param data Get inputted data
     * @return Return data encrypted
     */
    private String encrypt(String data) {
        return "12#@%#$%@$@#$#";
    }
}
