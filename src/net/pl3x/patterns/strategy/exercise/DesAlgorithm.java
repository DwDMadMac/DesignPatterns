package net.pl3x.patterns.strategy.exercise;

public class DesAlgorithm implements encryptionAlgorithm {

    @Override
    public void algorithm(String algorithmName) {
        System.out.println("Encrypting message using DES");
    }
}
