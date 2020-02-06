package net.pl3x.patterns.observer.solution;

/*
 * Concrete Observer
 */
public class SpreadSheet implements Observer{
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified");
    }
}
