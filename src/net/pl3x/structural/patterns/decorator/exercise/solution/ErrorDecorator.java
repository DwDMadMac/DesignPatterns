package net.pl3x.structural.patterns.decorator.exercise.solution;

/**
 * This is the decorator class listed in GOF Book
 *
 * This will have additional behaviors that is used in the
 * applications that chooses composition over inheritance
 */
public class ErrorDecorator implements ArtefactComponent {
    private ArtefactComponent artefactComponent;

    /**
     * Initialize artefactComponent object
     *
     * @param artefactComponent Get object
     */
    protected ErrorDecorator(ArtefactComponent artefactComponent) {
        this.artefactComponent = artefactComponent;
    }

    /**
     * Outputs the given error decorator object
     *
     * @return Return error object
     */
    @Override
    public String render() {
        return hasError();
    }

    /**
     * Gets the artefact and states that the artefact is a error object
     *
     * @return Return artefact with error
     */
    private String hasError(){
        return artefactComponent.render() + " [Error]";
    }
}
