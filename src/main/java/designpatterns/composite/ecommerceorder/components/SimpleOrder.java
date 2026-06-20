package designpatterns.composite.ecommerceorder.components;

// 简单订单
public class SimpleOrder extends OrderComponent {
    public SimpleOrder(double amount) {
        this.amount = amount;
    }

    @Override
    public void process() {
        System.out.printf("Processing order: $%.2f\n", amount);
    }
}