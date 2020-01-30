package net.pl3x.patterns.strategy.exercise;

/*
 * This class uses an encryption algorithm to encrypt a message before sending it out.
 *
 * What are the problems in this implementation?
 * refactor the code using the strategy pattern.
 * What are the benefits of the new implementation?
 */
public class ChatClient {
    private String encryptionAlgorithm;

    public ChatClient(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        if (encryptionAlgorithm == "DES")
            System.out.println("Encrypting message using DES");
        else if (encryptionAlgorithm == "AES")
            System.out.println("Encrypting message using AES");
        else
            throw new UnsupportedOperationException("Unsupported encryption algorithm");

        System.out.println("Sending the encrypted message...");
    }
}
