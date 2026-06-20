package designpatterns.composite.ecommerceorder.handlers;

import designpatterns.composite.ecommerceorder.components.OrderComponent;

// 总监审批者
public class DirectorApprover extends Approver {
    @Override
    public void approve(OrderComponent order) {
        if (order.getAmount() < 5000) {
            System.out.println("Director approved the order.");
        } else if (successor != null) {
            successor.approve(order);
        }
    }
}