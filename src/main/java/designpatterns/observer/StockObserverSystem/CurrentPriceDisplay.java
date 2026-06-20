package designpatterns.observer.StockObserverSystem;

public class CurrentPriceDisplay implements Observer {
    private Stock stock;

    public CurrentPriceDisplay(Stock stock) {
        this.stock = stock;
        stock.registerObserver(this);
    }

    @Override
    public void update(Stock stock) {
        if (stock.getSymbol().equals(this.stock.getSymbol())) {
            display();
        }
    }

    public void display() {
        System.out.println("当前 " + stock.getSymbol() + " 的价格是 " + stock.getPrice());
    }
}