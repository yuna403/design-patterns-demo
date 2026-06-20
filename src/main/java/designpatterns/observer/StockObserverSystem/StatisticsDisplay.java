package designpatterns.observer.StockObserverSystem;

public class StatisticsDisplay implements Observer {
    private Stock stock;
    private double minPrice;
    private double maxPrice;
    private double avgPrice;
    private int count;

    public StatisticsDisplay(Stock stock) {
        this.stock = stock;
        stock.registerObserver(this);
        count = 0;
        minPrice = Double.MAX_VALUE;
        maxPrice = Double.MIN_VALUE;
    }

    @Override
    public void update(Stock stock) {
        if (stock.getSymbol().equals(this.stock.getSymbol())) {
            double price = stock.getPrice();
            count++;
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price);
            avgPrice = (avgPrice * (count - 1) + price) / count;
            display();
        }
    }

    public void display() {
        System.out.println(stock.getSymbol() + " 的统计信息：最低价格 " + minPrice + "，最高价格 " + maxPrice + "，平均价格 " + avgPrice);
    }
}
