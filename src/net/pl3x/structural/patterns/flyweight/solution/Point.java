package net.pl3x.structural.patterns.flyweight.solution;


/**
 * This class represents a point of interest
 *
 * We should have attributes such as X & Y Coordinates and
 * that is where on the map we are going to render this points
 *
 * We should also know the type of each point such as if it
 * is a school, hospital, cafe, etc.
 *
 * We should also know the icon for each point, so all hospitals
 * have a certain icon.
 */
public class Point {
    // Lets add the Coordinates
    private int x; // In Java int takes 4 bytes
    private int y; // In Java int takes 4 bytes
    /*
     * Since we relocated the icon fields we have to call the class.
     * We this structural we can potential store each icon in a single place
     * and reference it across multiple points. we are not storing the same
     * array of bytes in many places in memory
     */
    private PointIcon pointIcon;

    /**
     * This method is our constructor which will initialize each field
     *
     * @param x Get X Coordinates
     * @param y Get Y Coordinates
     * @param pointIcon Get Point Icon
     */
    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    /**
     * This method will add a draw for each point
     */
    public void draw() {
        /*
         * We are going to use a format print statement
         *
         * First we add a format string
         * %s: It can be replaced with a value of a string
         * %d: Placeholder for a numeric value
         * Then at the end you add in the real values
         */
        System.out.printf("%s at (%d, %d)", pointIcon.getType(), x, y);
    }
}

