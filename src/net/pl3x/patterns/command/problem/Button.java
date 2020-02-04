package net.pl3x.patterns.command.problem;

public class Button {
    private String label;

    /*
     * Every button should have a method called click()
     *
     * The code that should be executed here will depends
     * on where we implement this button
     *
     * For example lets say we want to save some info to a database
     * somewhere else we can have another button lets say for
     * example lets delete a record
     *
     * The problem is we don't know which code should be implemented
     * when the button is clicked. the Command Pattern aims to solve
     * this pattern
     */
    public void click() {

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
