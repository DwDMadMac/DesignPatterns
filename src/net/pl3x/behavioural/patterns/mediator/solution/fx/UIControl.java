package net.pl3x.behavioural.patterns.mediator.solution.fx;

/*
 * This is going to be the base class for all user interface classes
 */
public class UIControl {
    // call the DialogBox 'owner', so ever UIControl knows its owner
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
