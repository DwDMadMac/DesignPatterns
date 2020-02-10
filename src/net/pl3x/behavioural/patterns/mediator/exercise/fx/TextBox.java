package net.pl3x.behavioural.patterns.mediator.exercise.fx;

/**
 * This concrete class will handle all UI Controls with the Text Box
 */
public class TextBox extends UIControl {
    private String content;

    /**
     * Gets the content of the Text Box
     *
     * @return Return content inside text box
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content inside the text box
     *
     * @param content Set content inside text box
     */
    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

    public boolean isEmpty() {
        return content == null || content.isEmpty();
    }
}
