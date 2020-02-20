package net.pl3x.structural.patterns.bridge.problem;

public class SonyRemoteControl extends RemoteControl {
    /*
     * This is where we would use the Sony Library to talk to the
     * TV and turn on the Sony TV
     */
    @Override
    public void tunOn() {
        System.out.println("Sony: turnOn");
    }

    /*
     * This is where we would use the Sony Library to talk to the
     * TV and turn off the Sony TV
     */
    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }
}
