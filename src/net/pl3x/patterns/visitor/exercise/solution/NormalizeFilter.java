package net.pl3x.patterns.visitor.exercise.solution;

public class NormalizeFilter implements Filters{
    /**
     * Gather the operation from the Segment class
     *
     * @param segment Get operation
     */
    @Override
    public void execute(Segment segment) {
        segment.apply(this);
    }
}
