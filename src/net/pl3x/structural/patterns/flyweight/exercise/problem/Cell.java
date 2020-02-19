package net.pl3x.structural.patterns.flyweight.exercise.problem;

public class Cell {
    private final int row;
    private final int column;
    private String content;
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    /**
     * Initialize the row and column objects
     *
     * @param row Get row
     * @param column Get column
     */
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Get the contents
     *
     * @return Return content
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the contents
     *
     * @param content Set content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the Font Family
     *
     * @return Return font family
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the Font Family
     *
     * @param fontFamily Set font family
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Gets the Font Size
     *
     * @return Return font size
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Sets the Font Size
     *
     * @param fontSize Set font size
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Checks to see if the content is bold or not
     *
     * @return Return true if bold, return false if not bold
     */
    public boolean isBold() {
        return isBold;
    }

    /**
     * Sets the content bold or not bold
     *
     * @param bold Set true (bold) or false (bot bold)
     */
    public void setBold(boolean bold) {
        isBold = bold;
    }

    /**
     * The method will render the given contents
     */
    public void render(){
        System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontFamily);
    }
}
