package net.pl3x.patterns.visitor.solution;

/*
 * Concrete Class
 */
public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
