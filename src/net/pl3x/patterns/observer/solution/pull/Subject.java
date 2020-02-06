package net.pl3x.patterns.observer.solution.pull;

import java.util.ArrayList;
import java.util.List;

/*
 * Observable
 *
 * In GOF Book it is called the 'Subject'
 */
public class Subject {
    // Maintain the observers
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /*
     * Using an 'int' is not very flexible because of the primitive params
     * Using an 'Object' class allows you to pass any kind of objects or
     * you can use generics
     */
    public void notifyObservers() {
        for (var observer : observers){
            observer.update();
        }
    }
}
