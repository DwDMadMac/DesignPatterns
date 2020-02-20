package net.pl3x.structural.patterns.bridge.solution;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung: setChannel");
    }
}
