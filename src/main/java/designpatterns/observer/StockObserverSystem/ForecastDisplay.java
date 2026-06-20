package designpatterns.observer.StockObserverSystem;

import java.util.Random;

public class ForecastDisplay implements Observer {
    private Stock stock;
    private double forecastPrice;

    public ForecastDisplay(Stock stock) {
        this.stock = stock;
        stock.registerObserver(this);
    }

    @Override
    public void update(Stock stock) {
        if (stock.getSymbol().equals(this.stock.getSymbol())) {
            double currentPrice = stock.getPrice();
            forecastPrice = currentPrice + (new Random().nextDouble() * 20 - 10); // 随机预测
            display();
        }
    }

    public void display() {
        System.out.println(stock.getSymbol() + " 的预测价格是 " + forecastPrice);
    }
}
