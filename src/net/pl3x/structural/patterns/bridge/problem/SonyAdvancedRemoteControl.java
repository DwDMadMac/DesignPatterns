package net.pl3x.structural.patterns.bridge.problem;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {

    /*
     * This is where you will use the Sony Library to
     * set a channel with the Sony TV
     */
    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }

    /*
     * Here you could extend the SonyRemoteControl{} class
     * to get the additional implementations. For now, we will
     * duplicate the code.
     */
    @Override
    public void tunOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }
}
