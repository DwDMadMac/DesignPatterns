package net.pl3x.structural.patterns.decorator.exercise.solution;

/**
 * This class is the concrete Component before using composition
 */
public class Artefact implements ArtefactComponent {
    private String name;

    /**
     * Gets the inputted String data
     *
     * @param name Get string name
     */
    protected Artefact(String name) {
        this.name = name;
    }

    /**
     * Outputs the given inputted String name
     *
     * @return Return name
     */
    @Override
    public String render() {
        return name;
    }
}
