package net.pl3x.behavioural.patterns.state.abuse;

public class StopppedState implements State {
    private Stopwatch stopwatch;

    public StopppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running.");
    }
}
