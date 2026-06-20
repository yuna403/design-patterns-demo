package designpatterns.observer.ProductObserverSystem;

public class ProductObserverSystem {
    public static void main(String[] args) {
        Product product = new Product("1001", "智能手机", 3999.0);
        Observer smsObserver = new SMSObserver("1001", "13800138000");
        Observer emailObserver = new EmailObserver("1001", "user@example.com");

        product.registerObserver(smsObserver);
        product.registerObserver(emailObserver);

        product.setPrice(3599.0);
        product.setPrice(3799.0);
    }
}