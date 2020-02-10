package net.pl3x.behavioural.patterns.visitor.solution;

/*
 * Concrete Class
 */
public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
