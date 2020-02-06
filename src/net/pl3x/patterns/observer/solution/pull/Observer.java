package net.pl3x.patterns.observer.solution.pull;

/*
 * Pull Style
 * -> Each concrete observer should get the data that it needs
 * So we should not past values in the update method
 */
public interface Observer {
    // void update(int value);
    void update();
}
