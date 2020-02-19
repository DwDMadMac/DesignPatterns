package net.pl3x.structural.patterns.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * this factory class will store each icon in a single place of memory
 */
public class PointIconFactory {
    /*
     * Hashmap is a class that implements the Maps interface
     */
    private Map<PointType, PointIcon> icons = new HashMap<>();

    /**
     * This method will see if this icon
     *
     * @param pointType Get point type
     * @return Return point type icon
     */
    public PointIcon getPointIcon(PointType pointType) {
        /*
         * So, we would pass a type here "getPointIcon(pointType)" like CAFE and this will return
         * icons for CAFE's.
         *
         * Here we need to implement some type of cache
         * or a pool of objects that we can reuse.
         *
         * In Java we have a data structure called 'Map<>' or 'Hashmap<>' which is similar to a
         * dictionary in C# or Python. Basically, it is a data structure for storing 'Key' 'Value' pairs
         *
         * Key -> Value
         * PointType -> PointIcon
         *
         * We need to see if this icon has an icon for the given type and if it does
         * not we need to create the icon and store it in our Map<> then return it
         */
        if (!icons.containsKey(pointType)){
            /*
             * in a real application, the icon (null) will be a method that reads the icon from a file system
             */
            var icon = new PointIcon(pointType, null);
            icons.put(pointType, icon);
        }

        /*
         * since we now know we definitely have an icon for the given type, we can return it
         */
        return icons.get(pointType);
    }
}
