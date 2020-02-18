package net.pl3x.structural.patterns.decorator.exercise.solution;

public class Editor {
    /**
     * This method is for demo purposes
     *
     * @param path Get path
     */
    public void openProject(String path) {
        ArtefactComponent[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
                new Artefact("SourceControl"),
        };

        // artefacts[0].setMain(true);
        // artefacts[2].setHasError(true);
        // Here we can add multiple decorators to any artefact
        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);
        artefacts[4] = new ErrorDecorator(new SourceControlDecorator(artefacts[4]));

        // Loop through all the artefacts
        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
