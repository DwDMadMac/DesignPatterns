package net.pl3x.patterns.mediator.solution.observer.fx;

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
        /*
         * technically it would be better to make this method protected
         * Because we don't want this method to be visible outside
         * of a UIControl class and it is purely used internally to
         * notify the observers when the state changes
         */
        notifyEventHandlers();
    }
}
