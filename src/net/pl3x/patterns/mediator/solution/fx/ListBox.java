package net.pl3x.patterns.mediator.solution.fx;

/*
 * Every 'ListBox' should have a list of items
 * It should also tell us what is the current selected item
 *
 * this ListBox needs to talk to the Button & Text Box
 */
public class ListBox extends UIControl {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
