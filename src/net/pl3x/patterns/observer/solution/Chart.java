package net.pl3x.patterns.observer.solution;

/*
 * Concrete Observer
 */
public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated.");
    }
}
