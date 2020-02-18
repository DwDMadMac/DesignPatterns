package net.pl3x.structural.patterns.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will get a list of points
 */
public class PointService {
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
        // Create a point - for demo will make icon null
        var point = new Point(1,2,PointType.CAFE, null);
        // Add point to our list
        points.add(point);
        // return the list
        return points;
    }
}
