package net.pl3x.behavioural.patterns.observer.exercise;

/*
 * concrete Subject
 */
public class StockData extends Stock {
    private String symbol;
    private float price;

    public StockData(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
