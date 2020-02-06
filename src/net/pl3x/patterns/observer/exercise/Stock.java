package net.pl3x.patterns.observer.exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * In 'GOF' Book this is the 'Subject'
 */
public class Stock {
    // Let's maintain the observers
    private Deque<Observer> observers = new ArrayDeque<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer : observers) {
            observer.newPrice();
        }
    }
}
