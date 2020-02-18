package net.pl3x.structural.patterns.decorator.problem;

public class EncryptedCloudStream extends CloudStream {

    /**
     * Overwrites method to encrypted data before sending it
     *
     * @param data Get data and encrypted
     */
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        super.write(encrypted);
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
