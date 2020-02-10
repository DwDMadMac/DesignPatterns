package net.pl3x.behavioural.patterns.observer.solution.pull;

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

    public void notifyObservers() {
        for (var observer : observers){
            observer.update();
        }
    }
}
