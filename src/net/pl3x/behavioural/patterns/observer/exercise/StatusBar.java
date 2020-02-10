package net.pl3x.behavioural.patterns.observer.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Shows the popular stocks
 */
public class StatusBar implements Observer {
    private Deque<Stock> stocks = new ArrayDeque<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("Status Bar");
        for (var stock : stocks) {
            System.out.println(stock);
        }
    }

    @Override
    public void newPrice() {
        System.out.println("New Price");
        show();
    }
}
