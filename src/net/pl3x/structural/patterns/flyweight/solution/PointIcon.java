package net.pl3x.structural.patterns.flyweight.solution;

/**
 *
 */
public class PointIcon {
    // Let's add an enum to represent the type of each point
    private final PointType type; // In Java PointType takes 4 bytes (Each enum takes 4 bytes)
    /*
     * Let's add the icon for each point
     *
     * We use a byte[] so we can locate each icon
     * in a file system and store them in a byte[] array
     */
    private final byte[] icon; // In Java each icon may take 20KB -> and if we have 1k points to render we will need 20MB

    /**
     * Initialize the object fields. Since we have declared these fields as final we
     * cannot change them once they have been initialized by the constructor
     *
     * @param type Get point type
     * @param icon Get icon byte
     */
    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    /**
     * The method gets the icon type
     *
     * @return Return icon type
     */
    public PointType getType() {
        return type;
    }
}
