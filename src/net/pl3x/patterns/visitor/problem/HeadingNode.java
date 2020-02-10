package net.pl3x.patterns.visitor.problem;

/*
 * Concrete Class
 */
public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight-Heading.");
    }
}
