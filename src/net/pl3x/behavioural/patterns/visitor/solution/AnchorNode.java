package net.pl3x.behavioural.patterns.visitor.solution;

/*
 * Concrete Class
 *
 * This is a Hyper Link
 */
public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
