package net.pl3x.structural.patterns.flyweight.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will get a list of points
 */
public class PointService {
    private PointIconFactory pointIconFactory;

    /**
     * Initialize the point Icon Factory
     *
     * @param pointIconFactory Get Icon
     */
    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    /**
     * This method will get all the list of points and return them
     *
     * @return Return list of points
     */
    public List<Point> getPoints() {
        /*
         * In a real application, this method will call on our backend
         * get the list of points that are stored in a database
         */
        // Declare list of points
        List<Point> points = new ArrayList<>();
        /*
         * Create a point - for demo will make icon null
         *
         * Since we are using the icon for the pointIconFactory{} class we are
         * reusing the CAFE icon and not storing it multiple times in memory
         */
        var point = new Point(1,2,pointIconFactory.getPointIcon(PointType.CAFE));
        // Add point to our list
        points.add(point);
        // return the list
        return points;
    }
}
