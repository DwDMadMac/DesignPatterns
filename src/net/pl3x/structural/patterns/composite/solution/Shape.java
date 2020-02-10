package net.pl3x.structural.patterns.composite.solution;

/*
 * This is potentially the base class for different types of shapes
 * e.g. Square class, circle class, triangle class, etc. that would extend this shape class
 *
 * Each shape should have the ability to render or draw itself on the screen
 */
public class Shape implements Component {
    @Override // by adding the Override annotation the compiler is making sure we are implementing the render() that is in the Component{} interface
    public void render() {
        System.out.println("Render Shape");
    }

    @Override
    public void move() {
        System.out.println("Move Shape");
    }
}
