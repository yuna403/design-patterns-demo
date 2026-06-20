package designpatterns.observer.StockObserverSystem;

import java.util.Random;

public class StockObserverSystem {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL");
        CurrentPriceDisplay currentPriceDisplay = new CurrentPriceDisplay(stock);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(stock);
        ForecastDisplay forecastDisplay = new ForecastDisplay(stock);

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            double price = 100 + random.nextDouble() * 100; // 随机价格
            stock.setPrice(price);
        }
    }
}