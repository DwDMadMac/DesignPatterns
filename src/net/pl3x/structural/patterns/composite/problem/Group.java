package net.pl3x.structural.patterns.composite.problem;

import java.util.ArrayList;
import java.util.List;

/*
 * This class allows us to group objects, so a group object can have zero or more shapes
 */
public class Group {
    /* get the shapes in the group
     * private List<Shape> shapes = new ArrayList<>();
     *
     * We also need to change the List<Shape> to List<Object>
     * This gives us a complementation error for the render() method
     * because when we iterator over the list of shapes we are dealing with instances of the
     * Object{} class and this Object{} class does not have a render() method
     */
    // private List<Object> shapes = new ArrayList<>();
    private List<Object> objects = new ArrayList<>(); // We changed this to objects since we are no longer dealing with just shapes

    /*
     * We need a method to add the shapes to the group
     *
     * public void add(Shape shape) {
     *
     * Replace Shape with Object because in every java class either directly
     * or indirectly extends the Object class, so we can pass any kind of Object
     * there
     */
    public void add(Object shape) {
        objects.add(shape);
    }

    /*
     * We need a method for rendering a group
     */
    public void render() {
        // Here we should iterate over all the shapes in the group and render each shape
        /*
         * More info above List<Object>
        for (var shape : shapes){
            shape.render();
            // Similarly if you had a method for moving or resizing a group
            // you would have to iterate over all the shapes in that group
            // and move each shape separately
        }

         */
        for (var object : objects){
            // We have to check if we are dealing with a shape or a group object
            if (object instanceof Shape){
                ((Shape)object).render(); // This is how we can 'cast' or 'convert' an object in Java
            } else { // Cast this object into a group instance
                ((Group) object).render();
            }
        }
    }
}
