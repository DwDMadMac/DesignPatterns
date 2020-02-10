package net.pl3x.behavioural.patterns.mediator.exercise.fx;

/**
 * This concrete class will handle all UI Controls that are check boxes
 */
public class CheckBox extends UIControl {
    private boolean isChecked;

    /**
     * Checks to see if a box is checked or not, will return true or false
     *
     * @return Return true or false depending on the check box being checked
     */
    public boolean isChecked() {
        return isChecked;
    }

    /**
     * Sets the check box to true or false
     *
     * @param checked Set true or false
     */
    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
