package net.pl3x.patterns.visitor.solution;


/*
 * This can also be called Visitor
 *
 * If we wanted to add a new operation, we have to come back to modify this interface
 * along with all classes that implement it
 */
public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
