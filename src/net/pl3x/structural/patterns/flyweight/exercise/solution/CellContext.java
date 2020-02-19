package net.pl3x.structural.patterns.flyweight.exercise.solution;

import java.util.Objects;

/**
 * This class will share the attributes with the given cells
 */
public class CellContext {
    // These are the attributes that can be shared by many cells.
    // That's why I've encapsulated them inside this class.
    // Our CellContextFactory class will ensure that every combination
    // of these attributes will only be stored once.
    private final String fontFamily;
    private final int fontSize;
    private final boolean isBold;

    /**
     * Initialize the ojbect fields
     *
     * @param fontFamily Get font family
     * @param fontSize Get font size
     * @param isBold Get bold
     */
    public CellContext(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    /**
     * This method will check for the font family
     *
     * @return Return font family
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * This method will check for font size
     *
     * @return Return font size
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * This method will check if content is bold or not bold
     *
     * @return Return true if bold, return false if not bold
     */
    public boolean isBold() {
        return isBold;
    }

    /**
     * This method will return the values of each object field
     *
     * @return Return object values
     */
    @Override
    public int hashCode() {
        return Objects.hash(fontFamily, fontSize, isBold);
    }
}
