package net.pl3x.behavioural.patterns.mediator.solution.observer.fx;

/*
 * Problem here is, we do not have access to the source code of other classes
 * and we cannot change it. We do not want to change the source code, we want to reuse it
 *
 */
public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        /*
         * technically it would be better to make this method protected
         * Because we don't want this method to be visible outside
         * of a UIControl class and it is purely used internally to
         * notify the observers when the state changes
         */
        notifyEventHandlers();
    }
}
