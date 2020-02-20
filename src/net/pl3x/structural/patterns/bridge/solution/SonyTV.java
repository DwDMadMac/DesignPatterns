package net.pl3x.structural.patterns.bridge.solution;

/*
 * Concrete implementation
 */
public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: TurnOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony: setChannel");
    }
}
