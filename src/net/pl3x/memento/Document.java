package net.pl3x.memento;

/*
 * Originator
 */
public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    /**
     * Get the given content
     *
     * @return Get content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the given content
     *
     * @param content Sets content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the font name
     *
     * @return Get font name
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the given font name
     *
     * @param fontName Set font name
     */
    public void setFontName(String fontName){
        this.fontName = fontName;
    }

    /**
     * Gets the font size
     *
     * @return get font size
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Sets the given font size
     *
     * @param fontSize Set font size
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Outs the methods into strings
     *
     * @return string of method outputs
     */
    public String toString() {
        return "Document{" +
                "content ='" + content + '\'' +
                ", fontName = '" + fontName + '\'' +
                ". fontSize = '" + fontSize + '}';
    }

    /**
     * Save its current font size inside Editor state object and return it
     *
     * @return Returns integer state
     */
    public EditorState createStateFontSize() {
        return new EditorState(fontSize);
    }

    /**
     * Saves it current font name inside Editor state object and return it
     *
     * @return Returns String state
     */
    public EditorState createStateFontName() {
        return new EditorState(fontName);
    }

    /**
     * Saves it current content inside Editor state object and return it
     *
     * @return Returns String state
     */
    public EditorState createStateContent() {
        return new EditorState(content);
    }

    /**
     * Restores last string state that was inputted
     *
     * @param editorState Restores last string state
     */
    public void restoreFontName(EditorState editorState) {
        fontName = editorState.getContentString();
    }

    /**
     * Restores last integer state that was inputted
     *
     * @param editorState Restores last integer state
     */
    public void restoreFontSize(EditorState editorState) {
        fontSize = editorState.getContentInt();
    }

    /**
     * Restores last string state that was inputted
     *
     * @param editorState Restores last string state
     */
    public void restoreContent(EditorState editorState) {
        content = editorState.getContentString();
    }
}
