package net.pl3x.structural.patterns.bridge.solution;

/*
 * Let's work on our feature hierarchy
 *
 * We want to remove the abstract so that we can create a Remote Control
 * object for a particular device
 */
public class RemoteControl {
    /*
     * Creating this private field will be the bridge between
     * these two separate hierarchy's
     *
     * We have changed this to protected so that 'extended' classes may
     * call this field inside its methods
     */
    protected Device device;

    /**
     * Initialize the device field
     *
     * @param device Get device
     */
    public RemoteControl(Device device) {
        this.device = device;
    }

    /**
     * This method will call the turnOn() method from the Device{} interface
     * using the device field
     */
    public void tunOn(){
        device.turnOn();
    }

    /**
     * This method will call the turnOff() method from the Device{} interface
     * using the device field
     */
    public void turnOff(){
        device.turnOff();
    }
}