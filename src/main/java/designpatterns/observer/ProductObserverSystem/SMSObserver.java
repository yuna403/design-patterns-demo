package designpatterns.observer.ProductObserverSystem;

public class SMSObserver implements Observer {
    private String productId;
    private String phoneNumber;

    public SMSObserver(String productId, String phoneNumber) {
        this.productId = productId;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Product product) {
        if (product.getId().equals(productId)) {
            System.out.println("发送短信到 " + phoneNumber + "：您关注的商品 " + product.getName() + " 价格已更新为 " + product.getPrice());
        }
    }
}
