package net.pl3x.behavioural.patterns.visitor.problem;

/*
 * You could also use an abstract class if you wanted to share some common behavior across different nodes
 */
public interface HtmlNode {
    void highlight();
    // String plainText();
}
