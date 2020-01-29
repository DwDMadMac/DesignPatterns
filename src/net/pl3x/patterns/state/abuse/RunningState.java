package net.pl3x.patterns.state.abuse;

public class RunningState implements State {
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new StopppedState(stopwatch));
        System.out.println("Stopped.");
    }
}
