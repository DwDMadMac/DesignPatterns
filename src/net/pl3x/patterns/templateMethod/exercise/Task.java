package net.pl3x.patterns.templateMethod.exercise;

public abstract class Task {
    private CloseWindow closeWindow;

    /**
     * Default constructor
     *
     *
     */
    public Task() {
        closeWindow = new CloseWindow();
    }

    /**
     * Will close the window the user has selected
     *
     * @param closeWindow Closes the selected window
     */
    public Task(CloseWindow closeWindow) {
        this.closeWindow = closeWindow;
    }
}
