package net.pl3x.patterns.observer.solution.push;

/*
 * Concrete Observer
 */
public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart got updated: " + value);
    }
}
