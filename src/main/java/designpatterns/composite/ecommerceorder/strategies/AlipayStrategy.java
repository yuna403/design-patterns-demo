package designpatterns.composite.ecommerceorder.strategies;

// 支付宝支付
public class AlipayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Paid ¥%.2f via Alipay\n", amount);
    }
}
