package net.pl3x.structural.patterns.composite.problem;

/*
 * This is potentially the base class for different types of shapes
 * e.g. Square class, circle class, triangle class, etc. that would extend this shape class
 *
 * Each shape should have the ability to render or draw itself on the screen
 */
public class Shape {
    public void render() {
        System.out.println("Render Shape");
    }
}
