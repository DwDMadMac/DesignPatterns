package net.pl3x.structural.patterns.composite.solution;

/*
 * This is the Component Interface in the GOF Book
 *
 * To implement the composite pattern we should have this interface face which can be named
 * anything you like. It does not have to be named component{}
 */
public interface Component {
    /*
     * Here we want to declare the operations that are common
     * between leafs and containers or composite objects
     *
     * Now we should make each types ( Group{} & Shape{} ) implements the Component{} Class
     */
    void render();
    void move(); // in a real application we want 'x' & y' parameters but for demo purposes let's leave it blank
}
