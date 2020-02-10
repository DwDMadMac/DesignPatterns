package net.pl3x.patterns.visitor.solution;

import java.util.ArrayList;
import java.util.List;

/*
 * Concrete Class
 *
 * This document should have a bunch of nodes
 */
public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    /**
     * Method thats adds a new node
     *
     * @param htmlNode Add new node
     */
    public void add(HtmlNode htmlNode){
        nodes.add(htmlNode);
    }

    /**
     * This method is an extensibility point, which passes new operations to it
     * without modifying it
     *
     * @param operation Pass new operation
     */
    public void execute(Operation operation){
        for (var node : nodes){
            node.execute(operation);
        }
    }
}
