package net.pl3x.patterns.memento;

/*
 * Memento
 */
public class EditorState {
    // Final: Once this field has been initialize it cannot by accidental be changed in the program
    private final String contentString;
    private final int contentInt;

    /**
     * Gets the content that is inputted
     *
     * @param contentString Initialize string field with parameter
     */
    public EditorState(String contentString) {
        this.contentString = contentString;
        this.contentInt = getContentInt();
    }
    /**
     * Gets the content that is inputted
     *
     * @param contentInt Initialize integer field with parameter
     */
    public EditorState(Integer contentInt) {
        this.contentInt = contentInt;
        this.contentString = getContentString();
    }

    /**
     * Reads string value that is set
     *
     * @return Returns string value set
     */
    public String getContentString() {
        return contentString;
    }

    /**
     * Reads integer value that is set
     *
     * @return Returns integer value set
     */
    public int getContentInt() {
        return contentInt;
    }
}
