package net.pl3x.patterns.visitor.solution;

/*
 * You could also use an abstract class if you wanted to share some common behavior across different nodes
 */
public interface HtmlNode {
    // void highlight();
    // String plainText();
    void execute(Operation operation);
}
