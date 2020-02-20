package net.pl3x.structural.patterns.bridge.solution;

/*
 * We want to remove the abstract so that we can create an
 * object for a particular device
 */
public class AdvancedRemoteControl extends RemoteControl {
    /**
     * With this constructor we will get the device and pass it
     * to our constructor to our base class
     *
     * @param device Get device
     */
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    /**
     * This method will set the channel
     *
     * @param number Set channel number
     */
    public void setChannel(int number){
        device.setChannel(number);
    }
}
