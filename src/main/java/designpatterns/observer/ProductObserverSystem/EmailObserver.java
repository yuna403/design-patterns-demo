package designpatterns.observer.ProductObserverSystem;

public class EmailObserver implements Observer {
    private String productId;
    private String email;

    public EmailObserver(String productId, String email) {
        this.productId = productId;
        this.email = email;
    }

    @Override
    public void update(Product product) {
        if (product.getId().equals(productId)) {
            System.out.println("发送邮件到 " + email + "：您关注的商品 " + product.getName() + " 价格已更新为 " + product.getPrice());
        }
    }
}
