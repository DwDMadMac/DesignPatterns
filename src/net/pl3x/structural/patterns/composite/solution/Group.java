package net.pl3x.structural.patterns.composite.solution;

import java.util.ArrayList;
import java.util.List;

/*
 * This class allows us to group objects, so a group object can have zero or more shapes
 */
public class Group implements Component {
    /* get the shapes in the group
     * private List<Shape> shapes = new ArrayList<>();
     *
     * We also need to change the List<Shape> to List<Object>
     * This gives us a complementation error for the render() method
     * because when we iterator over the list of shapes we are dealing with instances of the
     * Object{} class and this Object{} class does not have a render() method
     */
    // private List<Object> shapes = new ArrayList<>();
    // private List<Object> objects = new ArrayList<>(); // We changed this to objects since we are no longer dealing with just shapes
    private List<Component> components = new ArrayList<>(); // We change this to Component for the Composite Pattern since we can reference a shape or an group

    /*
     * We need a method to add the shapes to the group
     *
     * public void add(Shape shape) {
     *
     * Replace Shape with Object because in every java class either directly
     * or indirectly extends the Object class, so we can pass any kind of Object
     * there
     */
    //public void add(Object shape) {
    public void add(Component shape) {
        components.add(shape);
    }

    /*
     * We need a method for rendering a group
     */
    @Override
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
        for (var component : components){
            /*
             * We have to check if we are dealing with a shape or a group object
             *
             * if (object instanceof Shape){
             *     ((Shape)object).render(); // This is how we can 'cast' or 'convert' an object in Java
             * } else { // Cast this object into a group instance
             *     ((Group) object).render();
             * }
             *
             * We no longer need to check since we are now using a component
             */
            component.render();
            // Now let's say we decide to add the concept of moving a component
        }
    }

    @Override
    public void move() {
        for (var component : components){
            component.move();
        }
    }
}
