package net.pl3x.behavioural.patterns.visitor.problem;

/*
 * Concrete Class
 *
 * This is a Hyper Link
 */
public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight-Anchor.");
    }
}
