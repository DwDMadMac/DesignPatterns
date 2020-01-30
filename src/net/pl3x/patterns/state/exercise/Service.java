package net.pl3x.patterns.state.exercise;

public class Service implements State{
    private TravelMode travelMode;

    /**
     * Gets set Travel Mode
     *
     * @return travel Mode
     */
    public TravelMode getTravelMode() {
        return travelMode;
    }

    /**
     * Set the given travel mode
     *
     * @param travelMode Set travel mode
     */
    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    /**
     * Checks for the set travel mode and explicitly outputs the given direction
     *
     * @return Travel mode direction
     */
    @Override
    public Object direction() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating Direction (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating Direction (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating Direction (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return 4;
        }
    }

    /**
     * Checks for the set travel mode and explicitly outputs the given eta
     *
     * @return Travel mode eta
     */
    @Override
    public Object eta() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }
}
