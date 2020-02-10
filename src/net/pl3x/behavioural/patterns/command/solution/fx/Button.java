package net.pl3x.behavioural.patterns.command.solution.fx;

/*
 * In the Gang Of Four book this is labeled as the 'Invoker' Class
 *
 * In this framework the 'button' class knows nothing about any
 * of class that may use this class
 */
public class Button {
    private String label;
    private Command command;

    /**
     * Initializes the command field
     *
     * @param command Gets the command
     */
    public Button(Command command) {
        this.command = command;
    }

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
        // here we are forwarding/delegating the command object
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
