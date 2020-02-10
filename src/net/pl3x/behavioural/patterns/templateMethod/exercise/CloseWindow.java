package net.pl3x.behavioural.patterns.templateMethod.exercise;

public class CloseWindow {

    /**
     * This is the method that has the code for implementing logic
     * before the window is closed
     */
    protected void beforeWindowClosed() {

    }

    /**
     * This method is defining the template and can be used inside your custom window
     */
    public void close() {
        beforeWindowClosed();

        System.out.println("Removing the window from the screen.");

        afterWindowClosed();
    }


    /**
     * This is the method that has the code for implementing logic
     * after the window is closed
     */
    protected void afterWindowClosed() {

    }

}
