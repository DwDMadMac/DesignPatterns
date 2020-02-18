package net.pl3x.structural.patterns.decorator.exercise.solution;

/**
 * This is the decorator class listed in GOF Book
 *
 * This will have additional behaviors that is used in the
 * applications that chooses composition over inheritance
 */
public class MainDecorator implements ArtefactComponent {
    private ArtefactComponent artefactComponent;

    /**
     * Initialize artefactComponent object
     *
     * @param artefactComponent Get object
     */
    protected MainDecorator(ArtefactComponent artefactComponent) {
        this.artefactComponent = artefactComponent;
    }

    /**
     * Outputs the given Main decorator object
     *
     * @return Return main object
     */
    @Override
    public String render() {
        return isMain();
    }

    /**
     * Gets the artefact and states that the artefact is a main object
     *
     * @return Return artefact with main
     */
    private String isMain(){
        return artefactComponent.render() + " [Main]";
    }

}
