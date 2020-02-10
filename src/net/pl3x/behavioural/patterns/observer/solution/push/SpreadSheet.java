package net.pl3x.behavioural.patterns.observer.solution.push;

/*
 * Concrete Observer
 */
public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified: " + value);
    }
}
