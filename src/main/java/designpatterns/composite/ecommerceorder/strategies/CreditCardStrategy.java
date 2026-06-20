package designpatterns.composite.ecommerceorder.strategies;

// 信用卡支付
public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%.2f via Credit Card\n", amount);
    }
}
