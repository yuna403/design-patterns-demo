package designpatterns.composite.ecommerceorder.components;

public abstract class OrderComponent {
    protected double amount;

    public double getAmount() { // 必须存在此方法
        return amount;
    }

    public abstract void process();
}