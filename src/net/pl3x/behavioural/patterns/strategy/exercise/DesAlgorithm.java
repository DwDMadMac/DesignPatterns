package net.pl3x.behavioural.patterns.strategy.exercise;

public class DesAlgorithm implements encryptionAlgorithm {

    @Override
    public void algorithm(String algorithmName) {
        System.out.println("Encrypting message using DES");
    }
}
