package net.pl3x.patterns.mediator.solution.fx;

import net.pl3x.patterns.mediator.solution.fx.UIControl;

/*
 * When ever a UIControl is changes states it is going to call its DialogBox and say
 * I am changed. We could use an interface because inside the abstract class we only have
 * one method. However in a real GUI framework, this DialogBox is going to provide
 * some common behavior to all DialogBoxes
 *
 */
public abstract class DialogBox {
    public abstract void changed(UIControl uiControl);
}
