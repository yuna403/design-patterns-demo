package designpatterns.observer.StockObserverSystem;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String symbol;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
