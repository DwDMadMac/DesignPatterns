package net.pl3x.patterns.state.abuse;

public class Stopwatch {
    private State currentState = new StopppedState(this);

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void click() {
        currentState.click();
    }

    /*
     * This implementation below is perfectly fine because the Stopwatch will never have any additional states
     * A Stopwatch will have either 'Stopped' or 'Running'
     *
     * The above example is a example of Abusing the design State Pattern
     *
    private boolean isRunning;

    public void click() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Stopped");
        } else {
            isRunning = true;
            System.out.println("Running");
        }
    }
     */

}
