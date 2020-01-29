package net.pl3x.patterns.memento;

/*
 * Originator
 *
 * SRP = Single Responsibility Principle
 * Every class should have a single responsibility
 */
public class Editor {
    private String contentString;
    private Integer contentInt;
    // Most follow SRP
    // private List prevStates;

    /**
     * Gets set String content
     *
     * @return Gets String content
     */
    public String getContentString() {
        return contentString;
    }

    /**
     * Sets the given String content
     *
     * @param content sets String content
     */
    public void setContentString(String content) {
        this.contentString = content;
    }

    /**
     * Save its current String state inside an Editor state object and return it
     *
     * @return Returns String state
     */
    public EditorState createStateString() {
        return new EditorState(contentString);
    }

    /**
     * Restores last String state that was inputted
     *
     * @param editorState Restores last String state
     */
    public void restoreString(EditorState editorState) {
        contentString = editorState.getContentString();
    }

    /**
     * Gets set integer content
     *
     * @return Gets integer content
     */
    public Integer getContentInt() {
        return contentInt;
    }

    /**
     * Sets the given integer content
     *
     * @param content sets integer content
     */
    public void setContentInt(Integer content) {
        this.contentInt = content;
    }

    /**
     * Save its current integer state inside an Editor state object and return it
     *
     * @return Returns integer state
     */
    public EditorState createStateInt() {
        return new EditorState(contentInt);
    }

    /**
     * Restores last integer state that was inputted
     *
     * @param editorState Restores last integer state
     */
    public void restoreInt(EditorState editorState) {
        contentInt = editorState.getContentInt();
    }

}
