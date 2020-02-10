package net.pl3x.behavioural.patterns.mediator.exercise.fx;

/**
 * This concrete class will handle all UI Controls for buttons
 */
public class Button extends UIControl {
    private boolean isEnabled;

    /**
     * This method will check is the button is enabled or not
     *
     * @return Return true or false depending on button state
     */
    public boolean isEnabled() {
        return isEnabled;
    }

    /**
     * This method will set the button to true or false allowing it to be
     * enabled or disabled
     *
     * @param enabled Set button enabled or disabled
     */
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
