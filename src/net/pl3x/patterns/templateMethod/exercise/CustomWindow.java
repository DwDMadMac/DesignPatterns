package net.pl3x.patterns.templateMethod.exercise;

public class CustomWindow extends CloseWindow {

    /**
     * This will implement any logic you add before the window is closed
     */
    @Override
    protected void beforeWindowClosed() {
        System.out.println("Do something here before the window is closed");
    }

    /**
     * This will implement any logic you add after the window has closed
     */
    @Override
    protected void afterWindowClosed() {
        System.out.println("Do something here after the window is closed");
    }
}
