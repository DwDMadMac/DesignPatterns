package net.pl3x.patterns.visitor.problem;

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
     * This methods iterates over its nodes and ask each other to highlight itself
     */
    public void highlight() {
        // polymorphism principle
        for (var node : nodes){
            node:highlight();
        }
    }
}
