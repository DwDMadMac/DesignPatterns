package net.pl3x.structural.patterns.decorator.exercise.solution;

public class SourceControlDecorator implements ArtefactComponent {
    private ArtefactComponent artefactComponent;

    /**
     * Initialize artefactComponent object
     *
     * @param artefactComponent Get object
     */
    protected SourceControlDecorator(ArtefactComponent artefactComponent) {
        this.artefactComponent = artefactComponent;
    }


    /**
     * Outputs the given source control decorator object
     *
     * @return Return source control object
     */
    @Override
    public Object render() {
        return hasSourceControl();
    }

    /**
     * Gets the artefact and states that the artefact is a Source Control object
     *
     * @return Return artefact with source control
     */
    private String hasSourceControl() {
        return artefactComponent.render() + " [Special Mark]";
    }
}
