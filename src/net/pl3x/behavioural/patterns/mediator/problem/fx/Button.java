package net.pl3x.behavioural.patterns.mediator.problem.fx;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
