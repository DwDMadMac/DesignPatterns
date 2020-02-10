package net.pl3x.behavioural.patterns.mediator.solution.observer.fx;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        /*
         * technically it would be better to make this method protected
         * Because we don't want this method to be visible outside
         * of a UIControl class and it is purely used internally to
         * notify the observers when the state changes
         */
        notifyEventHandlers();
    }
}
