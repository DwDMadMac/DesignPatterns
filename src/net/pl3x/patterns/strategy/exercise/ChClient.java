package net.pl3x.patterns.strategy.exercise;

public class ChClient {
    public void send(String algorithmName, encryptionAlgorithm algorithm) {
        if (algorithmName == algorithmName){
            algorithm.algorithm(algorithmName);
        } else {
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }

        System.out.println("Sending the encrypted message...");
    }
}
