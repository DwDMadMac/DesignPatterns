package net.pl3x.structural.patterns.flyweight.problem;

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
    // Let's add an enum to represent the type of each point
    private PointType type; // In Java PointType takes 4 bytes (Each enum takes 4 bytes)
    /*
     * Let's add the icon for each point
     *
     * We use a byte[] so we can locate each icon
     * in a file system and store them in a byte[] array
     */
    private byte[] icon; // In Java each icon may take 20KB -> and if we have 1k points to render we will need 20MB

    /**
     * This method is our constructor which will intialize each field
     *
     * @param x Get X Coordinates
     * @param y Get Y Coordinates
     * @param type Get Point Type
     * @param icon Get Point Icon
     */
    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
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
        System.out.printf("%s at (%d, %d)", type, x, y);
    }
}
