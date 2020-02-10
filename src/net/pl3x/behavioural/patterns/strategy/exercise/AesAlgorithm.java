package net.pl3x.behavioural.patterns.strategy.exercise;

public class AesAlgorithm implements encryptionAlgorithm {
    @Override
    public void algorithm(String algorithmName) {
        System.out.println("Encrypting message using AES");
    }
}
