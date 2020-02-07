package net.pl3x.patterns.mediator.solution.observer.fx;

/*
 * Since we now have this Observer Class, we no longer
 * need the DialogBox class and we can now remove it
 * from the package
 *
 * This is also known as a 'Functional Interface' w/ a single method
 */
public interface EventHandler {
    void handle();
}
