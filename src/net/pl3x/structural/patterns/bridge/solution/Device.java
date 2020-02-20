package net.pl3x.structural.patterns.bridge.solution;

/*
 * Every device should have operations such as turnOn, turnOff, setChannel
 */
public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}
