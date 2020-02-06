package net.pl3x.patterns.mediator.solution.fx;

/*
 * Every 'ListBox' should have a list of items
 * It should also tell us what is the current selected item
 *
 * this ListBox needs to talk to the Button & Text Box
 */
public class ListBox extends UIControl {
    private String selection;

    public ListBox(DialogBox owner) {
        super(owner); // Passing this to the constructor of the UIControl
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this); // this lets the owner know that it has been changed
    }
}
